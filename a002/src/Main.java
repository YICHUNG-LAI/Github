import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a;
	Scanner A = new Scanner(System.in);
	System.out.println("enter number");
	a = A.nextInt();
	if(a%400==0|| (a%4==0 && a%100!=0)){
	    System.out.println("True");
    }
    else{
        System.out.println("False");
    }
    }
}
