package util;

public class currencyConverter {
	public static final double IOF = 6.0;//taxa de iof, constante
	public double price;//preço do dolar
	public double quantity_bought;//quantidade a ser comprada
	public double amount;//valor a ser pago
	
	public double total() {
		//valor total = valor do dolar*quantidade a ser comprada
		this.amount = this.price*this.quantity_bought;
		//calculado valor da taxa com base no preço a ser pago
		this.price = this.amount*(IOF/100);
		//preço total + taxa de iof
		return this.amount + this.price;
	}
}
