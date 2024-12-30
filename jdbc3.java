import java.sql.*;
class jdbc3
{
public static void main(String gg[])
{
int code=Integer.parseInt(gg[0]);
String title=gg[1];
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
c=DriverManager.getConnection("jdbc:mysql://hr@localhost:3306/hrdb","hr","hr");
PreparedStatement p;
p=c.prepareStatement("update designation set title=? where code=?",PreparedStatement.RETURN_GENERATED_KEYS);
p.setString(1,title);
p.setInt(2,code);
p.executeUpdate();
System.out.println("Updated");
p.close();
c.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}