import java.sql.*;
class eg1psp
{
public static void main(String gg[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tmdb","tmdbuser","tmdbuser");
Statement s=c.createStatement();
s.executeUpdate("insert into designation (title) value('Supervisior')");
s.close();
c.close();
System.out.println("Record inserted, testing done");
}catch(Exception e)
{
System.out.println(e);
}
}
}