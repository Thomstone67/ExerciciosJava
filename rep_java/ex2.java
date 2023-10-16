public class ex2{
    public static void main(String[] args) throws Exception{

        //ex2
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        sc.close();

        if(num % 2!=0){
            System.out.println("IMPAR");
        }else{
            System.out.println("PAR");
        }
    }
}
