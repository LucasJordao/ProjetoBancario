package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankProcess;

public class Main {
	
	public static void main(String[] args) {
//		Configuração de entrada de dados
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Variáveis 
		
		double deposit;
		
//		Requerimento de dados para criação de uma conta bancária
		
		System.out.print("Enter account number: ");
		int countNumber = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		
		
//		Instanciando o objeto BankProcess
		
		BankProcess newProcess = new BankProcess(countNumber, name);
		
//		Perguntando se quer fazer o primeiro deposito
		
		System.out.print("\nIs there na initial deposit (y/n)?  ");
		String response = sc.nextLine();
		char resp = response.toUpperCase().charAt(0);
		
		if(resp == 'Y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			newProcess.deposit(deposit);
		}
		
		System.out.printf("Account data:%n%s%n%n", newProcess);
		
//		Realizando depósito
		
		System.out.printf("Enter a deposit value: ");
		deposit = sc.nextDouble();
		newProcess.deposit(deposit);
		
		System.out.printf("Updated account data:%n%s%n%n%n", newProcess);
		
		
//      Realizando saque
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		
		newProcess.withdraw(withdraw);
		
		System.out.printf("Updated account data:%n%s", newProcess);
		

	}

}
