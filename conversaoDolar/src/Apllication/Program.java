package Apllication;
import java.util.Scanner;
import util.currencyConverter;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		currencyConverter converter;
		converter = new currencyConverter();
		System.out.println("What is the dollar price?");
		converter.price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		converter.quantity_bought = sc.nextDouble();
		System.out.printf("Amount to be paid in reais: %.2f", converter.total());
		
		sc.close();
	}

}
