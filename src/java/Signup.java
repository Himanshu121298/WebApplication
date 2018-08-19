

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signup extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try {
           String UserName=request.getParameter("UserName");
            String Password=request.getParameter("Password");
            String Email =request.getParameter("Email");
            System.out.println(UserName);
            System.out.println(Password);
            System.out.println(Email);
      
          Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
          PreparedStatement stmt=con.prepareStatement("insert into WebBuddyLogin values(?,?,?)");
          stmt.setString(1,UserName);
          stmt.setString(2,Password);
          stmt.setString(3,Email);
          int i=stmt.executeUpdate();  
System.out.println(i+" records affected"); 
RequestDispatcher rd=request.getRequestDispatcher("MainId");
                
           rd.forward(request,response);
        } catch (Exception ex) {
          System.out.println(ex);
        }
    }
}
