import java.util.Scanner;
class Maximum{
public static void main(String args[]){
Scanner scn=new Scanner(System.in);
System.out.print("Enter num1: ");
int num1=scn.nextInt();
System.out.print("Enter num2: ");
int num2=scn.nextInt();
if(num1>num2){System.out.println(num1+" is greater!");}
else if(num1==num2){System.out.println("both numbers are equal");}
else if(num2>num1){System.out.println(num2+" is greater");}
else{System.out.println("invalid input");}
}
}