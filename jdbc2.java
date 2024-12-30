import java.sql.*;
class jdbc2
{
public static void main(String gg[])
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c=DriverManager.getConnection("jdbc:mysql://hr@localhost:3306/hrdb","hr","hr");
Statement s;
s=c.createStatement();
ResultSet r;
r=s.executeQuery("select * from designation");
int code;
String title;
while(r.next())
{
code=r.getInt("code");
title=r.getString("title").trim();
System.out.printf("Code %d,Title %s\n",code,title);
}
r.close();
s.close();
c.close();
}catch(SQLException sqlException)
{
System.out.println(sqlException.getMessage());
}
catch(ClassNotFoundException classNotFoundException)
{
System.out.println(classNotFoundException.getMessage());
}
}
}