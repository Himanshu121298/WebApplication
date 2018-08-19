

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MainId extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
      String UserName=request.getParameter("UserName");
	  response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
           ArrayList<String> al=new ArrayList<String>();
          try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
          Statement stmt=con.createStatement();  
          ResultSet rs=stmt.executeQuery("Select * from question");
          
          while(rs.next())
          {
               al.add(rs.getString(1));
               System.out.println(rs.getString(1));
          }  
          }
          catch(Exception e)
          {
          }
out.println(" <!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println(" <meta charset='utf-8'>");
out.println(" <meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'>");
out.println(" <title>Web-Buddy by Chitkara</title>");
out.println("<meta name='description' content='Pushy is an off-canvas navigation menu for your website.'>");
out.println("<meta name='viewport' content='width=device-width, initial-scale=1, user-scalable=no'>");
out.println(" <link rel='tylesheet' href='css1/normalize.css'>");
out.println("  <link rel='stylesheet' href='css1/demo.css'>");
out.println(" <link rel='stylesheet' href='css1/pushy.css'>");
out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js'></script>");
out.println("</head>");
out.println(" <body background='images/bg2.jpg'>");
out.println(" <div class='site-header push' align='left'> ");
out.println("<button class='menu-btn' ><h2>&#9776; Menu</h2></button>");
out.println(" <img src='images/mlogo.png' width='800' height='60' align='center' class='img-chit'></img>");
out.println("<img src='images/logoc.png' width='175' height='50' align='right' class='img-chit'></img>");	
out.println("</div>");
out.println("<nav class='pushy pushy-left' data-focus='#first-link'>");
out.println("<div class='pushy-content'>");
out.println(" <ul>");
out.println(" <li class='pushy-submenu'>");                   
out.println("</li>");        
out.println("<li class='pushy-link'><a href='#'><img src='img1/ppic.png' width='140' height='140'></img>");
out.println("<br>");
out.println("<h3 align='center'>"+UserName.toUpperCase()+"</h3></a></li>");
out.println("<hr>");
out.println(" <li class='pushy-link'><a href='askq.html'>Ask Questions</a></li>");
out.println("<li class='pushy-link'><a href='#'>My Answers</a></li>");
out.println("</ul>");
out.println("</div>");
out.println("</nav>");
out.println(" <div class='site-overlay'></div>");

out.println("<link href='css1/1.css' rel='stylesheet' type='text/css'>");
out.println("<div class='wrap'>");
 for(String i:al)
  { out.println("<div class='box box3 shadow8 site-header push'>");
    out.println("<h3>"+i+"</h3>");
  out.println("</div>");
  }
out.println("</div>  ");

  response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
     
out.println("<script src='js1/pushy.min.js'></script>");
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
