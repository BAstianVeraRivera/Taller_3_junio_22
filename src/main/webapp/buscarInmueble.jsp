<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" type="text/css" href="style.css">
  <title>Buscar Inmueble</title>
  <script>
    function mostrarCampo() {
      var criterio = document.getElementById("criterio").value;
      var campo = document.getElementById("campo");
      if (criterio == "nombre") {
        campo.style.display = "block";
      } else {
        campo.style.display = "none";
      }
    }
  </script>
</head>
<body class="fondo-buscar">
<div class="contenedor-buscar">
  <div class="titulo">
    <h1 class="titulo-texto" style="text-align: center;">
      Buscar inmueble
    </h1>
  </div>
  <div class="formulario">
    <form action="BuscarInmuebleServlet" method="post">
      <div class="campo" style="text-align: center">
        <label for="criterio" style="color: white">Criterio de búsqueda:</label>
        <select id="criterio" name="criterio" required onchange="mostrarCampo()">
          <option value="">Seleccione una opción</option>
          <option value="Madera">Madera</option>
          <option value="Cemento">Cemento</option>
          <option value="Metalcom">Metalcon</option>
          <option value="Container">Container</option>
        </select>
      </div>
      <br>
      <ul class="enlaces-texto" style="text-align: center">
        <li><a href="agregarArticulo.jsp"><button>Buscar</button></a></li>
        <br>
      </ul>
    </form>
  </div>
</div>
</body>
</html>


