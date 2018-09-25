import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a,b,c ;
	Scanner A = new Scanner(System.in);
	System.out.println("enter three number");
	a = A.nextInt();
        b = A.nextInt();
        c = A.nextInt();
	if(a+b>c && b+c>a && a+c>b){
	    System.out.println("True");

    }
    else{
        System.out.println("False");
    }
    }
}
