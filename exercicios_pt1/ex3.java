import java.util.Scanner;

public class ex3{
    public static void main(String[] args) {
        int a, b, c, d, dif;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sc.close();

        dif = (a*b - c*d);
        System.out.printf("DIFERENCA: %d", dif);

        return;
    }
}