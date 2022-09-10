import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int x = scan.nextInt();
        int mn = x;
        int mx = x;

        for (int i = 2; i <= a; i++) {
            x = scan.nextInt();
            if (x > mx) {
                mx = x;
            } if (x < mn) {
                mn = x;
            }
        }
        System.out.println(mn + " " + mx);
    }
}
