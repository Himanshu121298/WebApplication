    import java.sql.*;  
    
    public class Write{  
    Write(String s){  
    try{  
    Class.forName("oracle.jdbc.driver.OracleDriver");  
      
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");  
      
    PreparedStatement stmt=con.prepareStatement("insert into Question values(?,?,?,?)");  
   
    stmt.setString(1,"Ratan");  
      
    int i=stmt.executeUpdate();  
    System.out.println(i+" records inserted");  
      
    con.close();  
      
    }catch(Exception e){ System.out.println(e);}  
      
    }  
    }  