package pl.coderslab.exam;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/someCookie")
public class SomeCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the 'login' parameter from the request
        String login = request.getParameter("login");
        response.setContentType("text/html");
        PrintWriter responseWriter = response.getWriter();

        if (login != null && !login.isEmpty()) {
            // Create a cookie with the login value
            Cookie loginCookie = new Cookie("cookieLogin", login);
            loginCookie.setMaxAge(60 * 60); // 1 hour
            response.addCookie(loginCookie);
            request.getSession().setAttribute("login", login);

            responseWriter.println("<html><body>");
            responseWriter.println("<h2>Login cookie created successfully.</h2>");
            responseWriter.println("<p>Login: " + login + "</p>");
            responseWriter.println("</body></html>");
        } else {
            responseWriter.println("<html><body>");
            responseWriter.println("<h2>No login value provided.</h2>");
            responseWriter.println("</body></html>");
        }
    }
}
