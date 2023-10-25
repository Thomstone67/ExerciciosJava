import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        int num1, num2, soma;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();

        soma = num1+num2;
        System.out.printf("Soma: %d", soma); 

        return;
    }
}