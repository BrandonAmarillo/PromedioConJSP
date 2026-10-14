<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="org.mycompany.models.Student" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Resultado</title>
</head>
<body>
    <h1> Resultado del promedio</h1>
    <% 
        String error = (String) request.getAttribute("Error");
        if (error != null ) {
    %>
    
        <p style="color: red;"><%= error %></p>
        <p><a href="index.jsp">Volver al formulario</a></p>
    <% 
        } else {
            Student student = (Student) request.getAttribute("student");
            String name = student.getName();
            double note1 = student.getNote1();
            double note2 = student.getNote2();
            double note3 = student.getNote3();
            double average = student.getAverage();
            String status = student.getStatus();
    %>
        <p><strong>Alumno:</strong> <%= name %></p>
        <p><strong>Notas:</strong> <%= note1 %>, <%= note2 %>, <%= note3 %></p>
        <p><strong>Promedio:</strong> <%= average %></p>
        <p><strong>Estado:</strong> <%= status %></p>
        <p><a href="index.jsp">Volver al formulario</a></p>
    <%
        }
    %>
    
</body>
</html>