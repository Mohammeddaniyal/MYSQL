import java.sql.*;
class jdbc1
{
public static void main(String gg[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
c=DriverManager.getConnection("jdbc:mysql://hr@localhost:3306/hrdb","hr","hr");
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