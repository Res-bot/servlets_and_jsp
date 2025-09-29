package servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/forwardDemo")
public class ForwardDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        req.setAttribute("message", "Forwarded to JSP successfully!");
        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);
    }
}
