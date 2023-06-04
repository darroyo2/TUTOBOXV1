<%-- 
    Document   : restablecerContrasena.jsp
    Created on : 25 may. 2023, 01:57:07
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>Restablecer Contraseña</title>
  <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
  <div class="container">
    <h2>Restablecer Contraseña</h2>
    <form action="procesar-restablecer.jsp" method="post">
      <div>
        <label for="correo">Correo electrónico:</label>
        <input type="email" id="correo" name="correo" required>
      </div>
      <div>
        <label for="nuevaContrasena">Nueva Contraseña:</label>
        <input type="password" id="nuevaContrasena" name="nuevaContrasena" required>
      </div>
      <div>
        <button type="submit" class="btn btn-primary">Guardar</button>
        <button type="button" onclick="window.location.href='login.jsp'" class="btn btn-primary">Cancelar</button>
      </div>
    </form>
  </div>
</body>
</html>
