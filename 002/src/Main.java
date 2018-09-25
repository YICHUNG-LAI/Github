
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner zxc = new Scanner(System.in);
	System.out.println("請輸入攝氏度:");
	float C = zxc.nextFloat();
float F = C*9/5+32;
		System.out.println("華氏度為:");
		System.out.println(F);
    }
}
