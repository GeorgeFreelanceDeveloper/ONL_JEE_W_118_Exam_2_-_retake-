package pl.coderslab.exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/getMessage")
public class GetMessageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int age = Integer.parseInt(request.getParameter("age"));
        String message = request.getParameter("message");

        Message messageObj = new Message(title, author, age, message);
        request.setAttribute("messageObj", messageObj);

        request.getRequestDispatcher("/displayMessage.jsp").forward(request, response);
    }
}
