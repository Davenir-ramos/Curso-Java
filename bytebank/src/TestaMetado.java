
public class TestaMetado {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		System.out.println();
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);
        System.out.println();
        
        Conta contaDaMarcela = new Conta();
         contaDaMarcela.deposita(1000);
         System.out.println(contaDaMarcela.saldo);
         System.out.println();
         
         if(contaDaMarcela.transfere(300, contaDoPaulo)) {
        	 System.out.println("Transferencia feita com sucesso");
         } else {
        	 System.out.println("Conta sem saldo");
         }
         System.out.println(contaDoPaulo.saldo);
         System.out.println(contaDaMarcela.saldo);
         
         contaDoPaulo.titular = "paulo silveira";
         System.out.println(contaDoPaulo.titular);
       
	}
}
