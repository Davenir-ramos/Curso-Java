
public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200)); // passa como argumento para system println
		
		/* proibido
		conta.saldo = conta.saldo -101;
		System.out.println(conta.saldo);
		*/
		conta.saca(101);
		System.out.println(conta.getSaldo());
		
	}

}
