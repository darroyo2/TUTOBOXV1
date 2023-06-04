<%-- 
    Document   : registro.jsp
    Created on : 25 may. 2023, 01:44:26
    Author     : User
--%>

<%@page import="model.TipoUsuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Registro</title>
  <link rel="stylesheet" type="text/css" href="styles.css">
  <script src="ruta/al/archivo/script.js"></script>
</head>
<body>
  <div class="container">
    <h2>Registro</h2>
    <form id="formulario" action="IngresoServlet" method="post">
      <div>
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required>
      </div>
      <div>
        <label for="correo">Correo electrónico:</label>
        <input type="email" id="correo" name="correo" required>
      </div>
      <div>
        <label for="contrasena">Contraseña:</label>
        <input type="password" id="contrasena" name="contrasena" required>
      </div>
      <div>
        <label for="opcion">Tipo de usuario:</label>
        <select id="opcion" name="opcion">
          <%-- Recorre la lista de tipos de usuario y genera las opciones --%>
            <% for (TipoUsuario tipoUsuario : (List<TipoUsuario>) session.getAttribute("tiposUsuario")) { %>
                <option value="<%= tipoUsuario.getCodigo() %>"><%= tipoUsuario.getDescripcion() %></option>
            <% } %>
        </select>
      </div>
      <div>
        <button type="submit" class="btn btn-primary">Guardar</button>
        <button type="button" onclick="window.location.href='login.jsp'" class="btn btn-primary">Cancelar</button>
      </div>
    </form>
    <%-- Muestra el mensaje de éxito si está presente --%>
    <%
        String mensajeExito = (String) request.getAttribute("mensajeExito");
        if (mensajeExito != null && !mensajeExito.isEmpty()) {
    %>
    <script>
            alert("<%= mensajeExito %>");
    </script>
        <% } %>
  </div>
</body>
</html>
