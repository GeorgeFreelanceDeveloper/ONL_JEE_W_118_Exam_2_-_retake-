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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        final String login = request.getParameter("login");

        if (login != null && !login.isEmpty()) {
            Cookie loginCookie = new Cookie("login", login);
            loginCookie.setMaxAge(60 * 60);
            response.addCookie(loginCookie);
        }

        response.setContentType("text/html; utf-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        if (login != null && !login.isEmpty()) {
            out.println("<p>Cookie 'cookieLogin' set with value: " + login + "</p>");
        } else {
            out.println("<p>No login parameter provided.</p>");
        }
        out.println("</body></html>");
    }
}
