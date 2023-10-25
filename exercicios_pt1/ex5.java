import java.util.Scanner;

public class ex5{
    public static void main(String[] args) {
        int num1, num2, quant1, quant2;
        double preco1, preco2, valor;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        quant1 = sc.nextInt();
        preco1 = sc.nextDouble();

        num2 = sc.nextInt();
        quant2 = sc.nextInt();
        preco2 = sc.nextDouble();
        sc.close();

        valor = (quant1*preco1)+(quant2*preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valor);
    }
}