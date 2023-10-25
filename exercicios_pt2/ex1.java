public class App{
    public static void main(String[] args) throws Exception{
       Scanner sc = new Scanner(System.in);
        
       int num = sc.nextInt();
       sc.close();

       if(num >= 0){
           System.out.println("NAO NEGATIVO");
       }else if(num < 0){
           System.out.println("NEGATIVO");
       }else{
           System.out.println("ERRO");
       }
    }
}
