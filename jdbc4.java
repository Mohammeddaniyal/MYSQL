import java.sql.*;
class jdbc4psp
{
public static void main(String gg[])
{
String fatherName=gg[0];
int fatherAge=Integer.parseInt(gg[1]);
char fatherGender=gg[2].charAt(0);
String motherName=gg[3];
int motherAge=Integer.parseInt(gg[4]);
char motherGender=gg[5].charAt(0);
String sisterName=gg[6];
int sisterAge=Integer.parseInt(gg[7]);
char sisterGender=gg[8].charAt(0);
String brotherName=gg[9];
int brotherAge=Integer.parseInt(gg[10]);
char brotherGender=gg[11].charAt(0);

String uncleName=gg[12];
int uncleAge=Integer.parseInt(gg[13]);
char uncleGender=gg[14].charAt(0);

char isAdult=gg[15].charAt(0);
char isIndian=gg[16].charAt(0);

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection c;
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hrdb","hr","hr");
Statement s=c.createStatement();
String sql;
sql="insert into family (father_name,father_age,father_gender,mother_name,mother_age,mother_gender,sister_name,sister_age,sister_gender,brother_name,brother_age,brother_gender,uncle_name,uncle_age,uncle_gender,is_adult,is_indian) values('"+fatherName+"','"+fatherAge+"','"+fatherGender+"','"+motherName+"','"+motherAge+"','"+motherGender+"','"+sisterName+"','"+sisterAge+"','"+sisterGender+"','"+brotherName+"','"+brotherAge+"','"+brotherGender+"','"+uncleName+"','"+uncleAge+"','"+uncleGender+"','"+isAdult+"','"+isIndian+"')";
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