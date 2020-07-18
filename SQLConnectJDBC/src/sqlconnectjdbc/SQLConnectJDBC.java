package sqlconnectjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectJDBC 
 {
   public static void connect()
    {
        Connection conn=null;
        try 
         {
             String url="jdbc:sqlite:C:/Users/Hp/Downloads/Project5(1).db";
             conn=DriverManager.getConnection(url);
             System.out.println("SQL connection has been established!!!!");
         } catch(SQLException e)
         {
             System.out.println("Connection not established:"+e.getMessage());
         } finally
        {
            try
            {
                if (conn!=null)
                {
                    conn.close();
                }
            } catch(SQLException e)
            {
                System.out.println("Error!!!"+e.getMessage());
            }
        }
    } 
   public static void main(String[] args) 
    {
     connect();   // TODO code application logic here
    }
    
 }
