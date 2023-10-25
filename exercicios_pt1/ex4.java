import java.util.Scanner;

public class ex4{
    public static void main(String[] args) {
        int num, hours;
        double per_hour, sal;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        hours = sc.nextInt();
        per_hour = sc.nextDouble();
        sc.close();
        
        sal = hours * per_hour;

        System.out.printf("NUMBER = %d\n", num);
        System.out.printf("SALARY = U$ %.2f", sal);

    }
}