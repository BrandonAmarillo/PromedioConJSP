package org.mycompany.servlets;

import java.io.IOException;

import org.mycompany.models.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "SvAverage", urlPatterns = "/SvAverage")
public class SvAverage extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                try {
                String name = request.getParameter("name");
                double note1 = Double.parseDouble(request.getParameter("note1"));
                double note2 = Double.parseDouble(request.getParameter("note2"));
                double note3 = Double.parseDouble(request.getParameter("note3"));

                double average = (note1 + note2 + note3) / 3;
                String status = "";
                if(average >= 6) {
                   status = "Aprobado";
                } else {
                   status = "Desaprobado";
                }
                Student student = new Student();
                student.setName(name);
                student.setNote1(note1);
                student.setNote2(note2);
                student.setNote3(note3);
                student.setAverage(average);
                student.setStatus(status);
                request.setAttribute("student", student);
                } catch (NumberFormatException nfe) {
                        request.setAttribute("Error", "Error: Ingrese un valor numérico válido para las notas.");
                }
                request.getRequestDispatcher("Result.jsp").forward(request, response);
                
    }

}
