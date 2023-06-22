<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="style.css">
  <title>Agregar Inmueble</title>
</head>
<body class="fondo-cliente">
<div class="contenedor-cliente">
  <div class="titulo">
    <h1 class="titulo-texto" style="text-align: center;">
      Agregar Inmueble
    </h1>
  </div>
  <div class="formulario">
    <form action="AgregarInmuebleServlet" method="post">
      <div class="campo" style="text-align: center">
        <label for="tipoConstruccion" style="color: white">Tipo Construccion:</label>
        <input type="text" id="tipoConstruccion" name="tipoConstruccion" required>
      </div>
      <br>
      <div class="campo" style="text-align: center">
        <label for="ubicacionGeografica" style="color: white">Ubicacion geografica:</label>
        <input type="text" id="ubicacionGeografica" name="ubicacionGeografica" required>
      </div>
      <br>
      <div class="campo" style="text-align: center">
        <label for="precio" style="color: white">Correo:</label>
        <input type="email" id="precio" name="precio" required>
      </div>
      <br>
      <br>
      <div class="boton" style="text-align: center">
        <input type="submit" value="Agregar">
      </div>
    </form>
  </div>
</div>
</body>
</html>
