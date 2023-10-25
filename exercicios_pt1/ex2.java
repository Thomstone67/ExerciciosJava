import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        double raio, area, pi=3.14159;
        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();
        sc.close();

        area = pi*Math.pow(raio, 2);
        System.out.printf("A: %.4f", area);
        return;
    }
}