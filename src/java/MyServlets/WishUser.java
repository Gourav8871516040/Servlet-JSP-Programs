package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WishUser extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet WishUser</title>");
            out.println("</head>");
            out.println("<body>");
            java.util.Date d = new java.util.Date();
            SimpleDateFormat hh = new SimpleDateFormat("hh");
            SimpleDateFormat mm = new SimpleDateFormat("mm");
            SimpleDateFormat aa = new SimpleDateFormat("aa");
            out.println(hh.format(d) + " : " + mm.format(d) + " : " + aa.format(d) + "</br></br>");
            int h = Integer.parseInt(hh.format(d));
            int m = Integer.parseInt(mm.format(d));
            String a = aa.format(d);
            ServletContext sc = getServletContext();
            if ((h > 4 && h < 12)  && (a.equals("AM"))) {
                String c = sc.getInitParameter("msg");
                out.println(c + " Everyone");//Good Morning
            } else if (((h >= 1 && h < 5) || h == 12)  && (a.equals("PM"))) {
                String c = sc.getInitParameter("msg2");
                out.println(c + " Everyone");//Good Afternoon
            } else if ((h >= 5 && h < 9)  && (a.equals("PM"))) {
                String c = sc.getInitParameter("msg3");
                out.println(c + " Everyone");//Good Evening
            } else if ((h >= 9 && h < 12)  && (a.equals("PM")) || ((h >= 1 && h < 6) || h == 12)  && (a.equals("AM"))) {
                String c = sc.getInitParameter("msg4");
                out.println(c + " Everyone");//Good Night
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
