package classes;

public class Conta {
	private double numero;
	private String name;
	private double saldo;
	
	public Conta(double numero, String name) {
		super();
		this.numero = numero;
		this.name = name;
		this.saldo = 0;
	}

	public Conta(double numero, String name, double di) {
		super();
		this.numero = numero;
		this.name = name;
		this.Di(di);
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", name=" + name + ", saldo=" + saldo + "]";
	}
	
	public void deposito(double valor){
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor;
		
	}
	
	public double Di(double valor) {
		return this.saldo = valor;
	}
	
	
	
	

}
