
package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UserVisitOffer extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserVisitOffer</title>");            
            out.println("</head>");
            out.println("<body>");
            Integer count =0;
            HttpSession s = request.getSession();
 
            if(s.isNew())
            {
                count+=1;
                s.setAttribute("counter", count);
                out.println("Welcome User you are the first visitor <br/><br/> Your Task is completed <br/><br/>Get 20% CashBack By visit it more than 2 times ");
            }else
            {
                int x = (Integer)s.getAttribute("counter");
                x++;
                if(x==2)
                {
                out.println("Welcome User <br/><br/>Your task is completed <br/><br/>Get 20% CashBack By visit it again ");    
                }
                else if(x==3)
                {
                    out.println("Welcome User <br/><br/>Your task is completed <br/><br/>***** JackPot Offer******<br/><br/> Get 20% Cash Back + 10,000Rs shopping voucher By visit again..");    
                }
                else
                {
                out.println("Welcome User <br/><br/>Your task is completed <br/><br/> Chalo Niklo Yha se ab, Bohot Hogya Time Pass...");    
                }
                
                s.setAttribute("counter", new Integer(x));
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
