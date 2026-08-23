import java.util.Scanner;
class EvenOdd{
public static void main(String args[]){
Scanner scn=new Scanner(System.in);
System.out.print("Enter any Number:");
int num=scn.nextInt();
if(num%2==0){System.out.println("The entered Number is even");}
else{System.out.println("The enterd Number is odd");}
}
}