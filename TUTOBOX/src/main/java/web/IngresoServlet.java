package web;


import java.io.IOException;
import java.sql.Connection;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.SQLException;
import model.TipoUsuario;
import model.Usuario;
import service.TipoUsuarioService;
import service.UsuarioService;


public class IngresoServlet extends HttpServlet {
    
    private Connection connection;
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("ENTRO AL METODO doGet");
        
        try {
            TipoUsuarioService tipoUsuarioService = new TipoUsuarioService();
            List<TipoUsuario> tiposUsuario = tipoUsuarioService.obtenerTiposUsuario();

            HttpSession session = request.getSession();
            session.setAttribute("tiposUsuario", tiposUsuario);
            request.getRequestDispatcher("registro.jsp").forward(request, response);
        } catch (ServletException | IOException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("ENTRO AL METODO doPost");
        
        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contrasena");
        String correo = request.getParameter("correo");
        int idTipo = Integer.parseInt(request.getParameter("opcion"));

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setContrasena(contrasena);
        usuario.setCorreo(correo);
        usuario.setIdTipo(idTipo);

        UsuarioService usuarioService = new UsuarioService();
        try {
            usuarioService.insertarUsuario(usuario);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        // Almacenar el mensaje de éxito en la sesión
        HttpSession session = request.getSession();
        session.setAttribute("mensajeExito", "Ingreso exitoso. ¡Bienvenido!");
        response.sendRedirect("login.jsp");

        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
