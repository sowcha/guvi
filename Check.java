import java.util.Scanner;
class Check
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
int n=S.nextInt();
if(n==0)
System.out.println("Zero");
else if(n<0)
System.out.println("negative");
else
System.out.println("positive");
}
}