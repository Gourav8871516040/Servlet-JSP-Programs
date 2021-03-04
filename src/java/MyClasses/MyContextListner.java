/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import java.util.Date;
import javax.servlet.*;

/**
 *
 * @author User
 */
public class MyContextListner implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
     Employee x = new Employee();
     x.setName("Ram");
     x.setAge(25);
     ServletContext sc = sce.getServletContext();
     sc.setAttribute("emp", x);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    System.out.println("Servlet context destroyed at "+new Date());
    }
    
}
