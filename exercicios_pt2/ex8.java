public class ex8{
    public static main void(String[] args){
        //ex8
        Scanner sc = new Scanner(System.in);

        double imposto = 0.0;
        double salario;
        
        salario = sc.nextDouble();
        
        if(salario<=2000.00){
            imposto = 0.0;
        }else if(salario<=3000.00){
            imposto = (salario-2000.00) * 0.08;
        }else if(salario <=4500.00){
            imposto = (salario-3000.0)*0.18 +  1000.0*0.08;
        }else{
            imposto = (salario-4500.00)*0.28 + 1500.00*0.18 + 1000.00*0.08;
        }

        if(imposto==0.0){
            System.out.println("Isento");
        }else{
            System.out.printf("R$ %.2f\n", imposto);
        }
        sc.close(); 
    }
}
