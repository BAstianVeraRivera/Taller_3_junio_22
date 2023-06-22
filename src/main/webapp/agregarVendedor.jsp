<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Agregar Vendedor</title>
</head>
<body class="fondo-articulo">
<div class="contenedor-articulo">
    <div class="titulo">
        <h1 class="titulo-texto" style="text-align: center;">
            Agregar Vendedor
        </h1>
    </div>
    <div class="formulario">
        <form action="AgregarVendedorServlet" method="post">
            <div class="campo" style="text-align: center">
                <label for="nombreVendedor" style="color: white">Nombre del vendedor:</label>
                <input type="text" id="nombreVendedor" name="nombreVendedor" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="rut" style="color: white">Rut(sin punto ni guion):</label>
                <input type="text" id="rut" name="rut" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="direccion" style="color: white">Direccion:</label>
                <input type="text" id="direccion" name="direccion" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="titulo" style="color: white">Titulo profesional:</label>
                <input type="text" id="titulo" name="titulo" required>
            </div>
            <br>
            <div class="campo" style="text-align: center">
                <label for="estadoCivil" style="color: white">Estado civil (soltero/casado):</label>
                <input type="text" id="estadoCivil" name="estadoCivil" required>
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