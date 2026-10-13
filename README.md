# Ejercicio Nº 2: Calculadora de promedio de notas (Básico/intermedio)

Creá una mini aplicación web que permita cargar las notas de un alumno y mostrar su promedio junto con un mensaje.

1. **Index.jsp**

Debe tener un formulario con:
+ Campo de texto para **nombre del alumno**.
+ Tres campos para **notas^ (ej: nota1, nota2, nota3).
+ Botón **"Calcular promedio"**.
+ El formulario debe enviar los datos por **POST** a un **servlet** (ej: PromedioServlet)

2. **PromedioServlet**

Debe realizar las siguientes acciones:

+ Obtener los parámetros del request (nombre, nota1, nota2, nota3)
+ Convertir las notas a número (Double o int).
+ Calcular el **promedio**.
+ Armar un mensaje según el resultado, por ejemplo:
  * Si promedio >= 6: **"Aprobado"**.
  * Si promedio < 6: **"Desaprobado"**.
+ Guardar en el request:
    *  El nombre del alumno-
    * Las notas.
    * El promedio.
    * El mensaje (Aprobado/Desaprobado)
+ Hacer un forward a resultado.jsp usando ```RequestDispathcher```.

3. **resultado.jsp**

Debe mostrar algo similar a:

    Alumno: Juan Pérez
    Notas: 7, 8, 6
    Promedio: 7.0
    Estado: Aprobado

+ request.getAttribute(...)
+ O Expression Language: ${promedio}, ${mensaje}, ${nombre} (si los seteás como atributos).

4. **Requisitos técnicos**
  + Un **Servlet** para procesar la lógica.
  + **Forward**(dispatcher.forward) hacia un JSP.
  + Paso de información del Servlet al JSP mediante **atributos de request**
  + Manejo simple de errores:
    * Si alguna nota está vacía o no es numérica, mostrar un mensaje de error en resultado.jsp (mo hace falta validación súper compleja, pero al menos controlar que no exploque el parseo).

**Objetivo didáctico**: introducir la separación de responsabilidades (Servlet para la lógica, JSP para la vista), el uso de request.setAttribute(...) y el forward hacia un JSP.