import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/greet")
public class greet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("email");
        resp.setContentType("text/html");

        PrintWriter out  = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Your Email is: " + name + "!</h1>");
        out.println("</body></html>");
    }
}