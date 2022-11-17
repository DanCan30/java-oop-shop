package generation.italy.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
	
	String code = "";
	String name;
	String description;
	int price;
	int tax = 20;
	
	Random rand = new Random();
	DecimalFormat twoDecimalsFormat = new DecimalFormat("0.00");
	
	Prodotto(String name, String description, int price) {
		
		for(int i = 0; i < 5; i++) {
			code += rand.nextInt(9);
		}
		
		this.name = name;
		this.description = description;
		this.price = price;
	};
	
	public int getRawPrice() {
		return price;
	};
	
	public double getPriceWithTaxes() {
		
		double taxInPercentage = tax /100d;
		
		double finalPrice = price + (price * taxInPercentage);
		
		return finalPrice;
	}
	
	@Override
	public String toString() {
		return  
				"Codice prodotto: " + code +
				"\nNome prodotto: " + name + 
				"\nDescrizione prodotto: " + description + 
				"\nPrezzo esentasse: " + twoDecimalsFormat.format(getRawPrice()) + 
				"€ \nPrezzo finale: " + twoDecimalsFormat.format(getPriceWithTaxes()) + "€"; 

	}
}
