package listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@WebListener
public class AppContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Application Started!");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Application Stopped!");
    }
}
