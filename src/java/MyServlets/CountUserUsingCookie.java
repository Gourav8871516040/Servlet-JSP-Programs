
package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CountUserUsingCookie extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CountUserUsingCookie</title>");            
            out.println("</head>");
            out.println("<body>");
            int count = 0,i;
            boolean newvisitor = true;
            Cookie c[]= request.getCookies();
           if(c!=null)
           {
            for(i=0;i<c.length;i++)
            {
                if(c[i].getName().equals("oldvisitor"))
                {
                    newvisitor = false;
                    break;
                }
            }
           }
            if(newvisitor)
            {
                Cookie f = new Cookie("oldvisitor","old user");
                Cookie s = new Cookie("counter","1");
                f.setMaxAge(3600);
                s.setMaxAge(3600);
                response.addCookie(f);
                response.addCookie(s);
                out.println("This is first time you are accessing this Page. <br/><br/>Welcome to My Site ");
                
                
            }
            else
            {
                Cookie ck [] = request.getCookies();
                if(ck!=null)
                {
                    Cookie temp = null;
                    for(i=0;i<ck.length;i++)
                    {
                        if(ck[i].getName().equals("counter"))
                        {
                            temp=ck[i];
                            break;
                        }
                    }
                    String x= temp.getValue();
                    count = Integer.parseInt(x);
                    count++;
                    temp.setValue(Integer.toString(count));
                    temp.setMaxAge(3600);
                    response.addCookie(temp);
                    out.println("Welcome back user this is "+count+" time you are visiting this page.");
                    
                }
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
