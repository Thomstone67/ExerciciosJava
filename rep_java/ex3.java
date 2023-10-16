public class ex3{
    public static void main(String[] args){
        //ex3
        Scanner sc = new Scanner(System.in);

        int num1, num2, maior, menor;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();

        if(num1>num2){
            maior = num1;
            menor = num2;
        }else if(num1<num2){
            maior = num2;
            menor = num1;
        }else{
            maior = num1;
            menor = num2;
        }

        int div = maior%menor;

        if(div!=0){
            System.out.println("Nao sao Multiplos");
        }else if(div==0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Erro");
        }
    }
}
