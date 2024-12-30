import java.sql.*;
class jdbc6psp
{
public static void main(String gg[])
{
String sisterName=gg[0];

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
Statement s=c.createStatement();
String sql;
sql="delete from family where sister_name='"+sisterName+"'";
System.out.println(sql);
System.out.println("Done");
s.executeUpdate(sql);
s.close();
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