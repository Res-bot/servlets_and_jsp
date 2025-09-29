package control;

import dao.CategoryDao;
import dao.ProductDao;
import entity.Category;
import entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeControl", value = "")
public class HomeControl extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	// Call DAO class to access with database.
    ProductDao productDao = new ProductDao();
    CategoryDao categoryDao = new CategoryDao();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Get all products from database.
        List<Product> productList = productDao.getAllProducts();
        // Get all categories from database.
        List<Category> categoryList = categoryDao.getAllCategories();


        request.setAttribute("product_list", productList);
        request.setAttribute("category_list", categoryList);
        // Set attribute active class for home in header.
        request.setAttribute("home_active", "active");
        // Get request dispatcher and render to index page.
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }

}
