<%@ page contextType="text/html; pagaEncoding=" UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta http-equiv="context-Type" content="text/html charset=UTF-8">
        <title>Calculadora de promedio</title>
    </head>

    <body>
        <h1>Calcula tu promedio</h1>
        <form action="${pageContext.request.contextPath}/SvAverage" method="POST">
            <p><label>Ingrese el nombre: </label><input type="text" name="name"></p>
            <p><label>Nota 1: </label><input type="text" name="note1"></p>
            <p><label>Nota 2: </label><input type="text" name="note2"></p>
            <p><label>Nota 3: </label><input type="text" name="note3"></p>
            <button type="submit">Calcular Promedio</button>
        </form>
    </body>

    </html>