import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try 
        {
             response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
     
            String UserName=request.getParameter("UserName");
            String Password=request.getParameter("Password");
            
          PrintWriter out = response.getWriter();
          Class.forName("oracle.jdbc.driver.OracleDriver");
          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
          Statement stmt=con.createStatement();  
          ResultSet rs=stmt.executeQuery("Select * from WebBuddyLogin");
          while(rs.next())
          {
               System.out.println(UserName+"   "+Password);
          if(UserName.equals(rs.getString(1))&&Password.equals(rs.getString(2)))
          {
                  System.out.println("Login SuccessFul");
                   System.out.println(UserName+"   "+Password);
                 RequestDispatcher rd=request.getRequestDispatcher("MainId");
                 System.out.println("dispatched");
                  rd.forward(request,response);
          }
           else{
            
          }
          } 
          RequestDispatcher rd=request.getRequestDispatcher("indexinv.jsp");
                 System.out.println("dispatched");
          rd.forward(request,response);
           
        }
catch(Exception e)
        {
        System.out.println(e);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
