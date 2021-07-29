public class Conta {
	private double saldo;
	private int agencia = 42;
	private int numero;
	private Cliente titular;
	private static int total;
		//static é um atributo da class
	
	// construtor
	public Conta (int agencia, int numero){
		Conta.total++;
		//System.out.println("o total de contas é: "+Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma conta: "+ this.numero);
		  
		
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else { 
			return false;
			}
	}
	
	/*public boolean transfere(double valor, Conta destino) { 
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
			return false;
	}*/
	public boolean transfere(double valor, Conta destino) { 
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} 
			return false;
	}
	
	public double getSaldo() { // get - método que pega informação
		 return this.saldo;
		 
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero (int numero){
		if(numero <= 0){
			System.out.println("não pode valor <=0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0){
			System.out.println("não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal(){
		return Conta.total;
	}
}
