package servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/asyncDemo", asyncSupported = true)
public class AsyncDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        AsyncContext ctx = req.startAsync();
        ctx.start(() -> {
            try {
                Thread.sleep(5000); // simulate long task
                res.getWriter().write("Async Task Completed after 5 seconds!");
                ctx.complete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
