import java.util.Scanner;

public class ex6{
    public static void main(String[] args) {
        double a, b, c;
        double tri, circ, trap, quad, ret;

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();

        tri = (a*c)/2;
        circ = Math.PI*Math.pow(c,2);
        trap = ((a+b)/2)*c;
        quad = Math.pow(b, 2);
        ret = a*b;

        System.out.printf("TRIANGULO: %.3f\n", tri);
        System.out.printf("CIRCULO: %.3f\n", circ);
        System.out.printf("TRAPEZIO: %.3f\n", trap);
        System.out.printf("QUADRADO: %.3f\n", quad);
        System.out.printf("RETANGULO: %.3f\n", ret);
    }
}