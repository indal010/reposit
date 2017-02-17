import java.util.*;
class Username
{
public static void main(String args[])
{
int i;
int c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter username");
String user=sc.nextLine();
String s1="hello";
String s2="How are you";

for(i=0;i<=user.length()-1;i++)
	{
	  if((user.charAt(i)>=65 && user.charAt(i)<=90) || (user.charAt(i)>=97 && user.charAt(i)<=122))
		c++;
	}
if(c>=3)
System.out.println(s1+" "+user+" "+s2);
else
System.out.println("Invalid Username");

}
}
