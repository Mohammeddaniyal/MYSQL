import java.sql.*;
class jdbc5psp
{
public static void main(String gg[])
{
String fatherName=gg[0];
String motherName=gg[1];
String brotherName=gg[2];

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
Statement s=c.createStatement();
String sql;
sql="update family set father_name='"+fatherName+"',mother_name='"+motherName+"' where brother_name='"+brotherName+"'";
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