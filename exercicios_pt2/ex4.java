public class ex4{
    public static void main(String[] args){
        //ex4
        Scanner sc = new Scanner(System.in);
        
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        sc.close();
        int duracao;

        if(horaInicial<horaFinal){
            duracao = horaFinal-horaInicial;
        }else{
            duracao = 24-horaInicial+horaFinal;
        }

        System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
    }
}
