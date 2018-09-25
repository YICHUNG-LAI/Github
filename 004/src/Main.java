import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner E = new Scanner(System.in);
        Scanner F = new Scanner(System.in);
        Scanner G = new Scanner(System.in);
        int e = E.nextInt();
        int f = F.nextInt();
        int g = G.nextInt();
        int H = e+f+g;
        System.out.println(H);
        System.out.println(H/3);
    }
}
