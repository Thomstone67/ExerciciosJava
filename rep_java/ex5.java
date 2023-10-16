public class ex5{
    public static void main(String[] args){
        //ex5
        Scanner sc = new Scanner(System.in);

        int prod;
        double preco, quant;

        prod = sc.nextInt();
        quant = sc.nextDouble();
        sc.close();

        switch(prod){
            case 1:
                preco = 4.00*quant;
                System.out.println("Total: R$ "+preco);
                break;
            case 2:
                preco = 4.50*quant;
                System.out.println("Total: R$ "+preco);
                break;
            case 3:
                preco = 5.00*quant;
                System.out.println("Total: R$ "+preco);
                break;
            case 4:
                preco = 2.00*quant;
                System.out.println("Total: R$ "+preco);
                break;
            case 5:
                preco = 1.00*quant;
                System.out.println("Total: R$ "+preco);
                break;
        }
    }
}
