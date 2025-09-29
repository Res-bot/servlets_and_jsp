package StudRegControl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student12;
import dao.StudentDAO;

/**
 *  implementation class StudentRegistrationController
 */
@WebServlet("/StudentRegistrationController")
public class StudentRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//fetch request parameter
		Student12 stud = new Student12();
		stud.setEmail(request.getParameter("email"));
		stud.setName(request.getParameter("name"));
		stud.setPan(request.getParameter("pan"));
		stud.setPassword(request.getParameter("password"));
		stud.setUsername(request.getParameter("username"));
		stud.setRegdNo(request.getParameter("regdNo"));
		
		
		
		
		//save student data in database
		
		StudentDAO dao = new StudentDAO();
		boolean flag = dao.save(stud);
		
		
		//check the status of operation
				
		RequestDispatcher rd = null;
		
		if(flag == true) {
			rd = request.getRequestDispatcher("/home.jsp");
		}else {
			rd = request.getRequestDispatcher("/stud-regd.jsp");
		}
		
		
		//forward the control
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
