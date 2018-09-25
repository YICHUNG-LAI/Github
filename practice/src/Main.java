


import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner A = new Scanner(System.in);
        int a = A.nextInt();
        int b = A.nextInt();
        int c = A.nextInt();
        if (a + b > c && b + c > a && a + c > b) ;
        {
            System.out.println("True");
        }
  else
        {
            System.out.println("False");
        }


    }