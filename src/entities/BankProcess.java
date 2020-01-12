package entities;

public class BankProcess {
	
//	Atributos necess�rios para cria��o de uma conta banc�ria
	
	private int countNumber;
	private String name;
	private double bankBalance;
	private static final int RATE = 5;
	
	
//	Construtores (Sobrecargas)
	
	public BankProcess(int countNumber, String name, double initialValue) {
		this.countNumber = countNumber;
		this.name = name;
		deposit(initialValue);
	}
	
	public BankProcess(int countNumber, String name) {
		this.countNumber = countNumber;
		this.name = name;
	}
	
	
//	M�todos respons�veis pelo dep�sito e saque do dinheiro
	
	public void deposit(double deposit) {
		bankBalance += deposit;
	}
	
	public void withdraw(double withdraw) {
		bankBalance -= withdraw + RATE;
	}
	
//	M�todo toString
	
	public String toString() {
		return "Account "
				+ countNumber
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", bankBalance);
	}
	
//	M�todos getters e setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBankBalance() {
		return bankBalance;
	}
	
	public int getCountNumber() {
		return countNumber;
	}
	
}
