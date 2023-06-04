<%-- 
    Document   : login.jsp
    Created on : 25 may. 2023, 01:30:03
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Inicio de sesión</title>
  <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
  <div class="container">
    <h2>Inicio de sesión</h2>
    <form action="procesar-login.jsp" method="post">
      <div>
        <label for="correo">Correo electrónico:</label>
        <input type="email" id="correo" name="correo" required>
      </div>
      <div>
        <label for="contrasena">Contraseña:</label>
        <input type="password" id="contrasena" name="contrasena" required>
      </div>
      <button type="submit">Iniciar sesión</button>
    </form>
  
    <div>
      <a href="IngresoServlet?action=registro.jsp" role="button">Registrarse</a>
      <a href="restablecerContrasena.jsp">Restablecer contraseña</a>
    </div>
  </div>
</body>
</html>


