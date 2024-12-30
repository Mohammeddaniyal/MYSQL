import java.sql.*;
class jdbc7psp
{
public static void main(String gg[])
{


try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
Statement statement=c.createStatement();
ResultSet r=statement.executeQuery("select count(*) from designation");
r.next();
System.out.println(r.getInt("code"));
System.out.println("Done");
statement.close();
c.close();
}catch(SQLException s)
{
System.out.println(s);
}
catch(ClassNotFoundException c)
{
System.out.println(c);
}
}
}