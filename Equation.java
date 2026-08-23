import java.util.Scanner;
class Equation{
public static void main(String args[]){
Scanner scn=new Scanner(System.in);
System.out.print("Enter value of a:");
int a=scn.nextInt();
System.out.print("Enter value of b:");
int b=scn.nextInt();
System.out.print("Enter value of c:");
int c=scn.nextInt();
System.out.println("Solution of 2a+3b+c is:"+ (2*a+3*b+c));
}
}