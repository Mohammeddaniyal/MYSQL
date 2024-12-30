import java.sql.*;
class jdbc1
{
public static void main(String gg[])
{
try
{
Connection c;
Class.forName("com.mysql.cj.jdbc.Driver");
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tmdb","tmdbuser","tmdbuser");

Statement s;
s=c.createStatement();
s.executeUpdate("insert into designation (title) values('Drawing teacher')");
s.close();
c.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}