package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {	
			case "US Dollar":
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.89);
				this.exchangeValues.put("GBP", 0.77);
				this.exchangeValues.put("CHF", 1.01);
				this.exchangeValues.put("CNY", 6.72);
				this.exchangeValues.put("JPY", 111.16);
                                this.exchangeValues.put("INR", 70.0);
				break;
			case "Euro":
				this.exchangeValues.put("USD", 1.12);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.86);
				this.exchangeValues.put("CHF", 1.13);
				this.exchangeValues.put("CNY", 7.55);
				this.exchangeValues.put("JPY", 124.94);
                                this.exchangeValues.put("INR", 78.67);
				break;
			case "British Pound":
				this.exchangeValues.put("USD", 1.30);
				this.exchangeValues.put("EUR", 1.16);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("CHF", 1.31);
				this.exchangeValues.put("CNY", 8.75);
				this.exchangeValues.put("JPY", 144.70);
				this.exchangeValues.put("INR", 91.11);
                                break;
			case "Swiss Franc":
				this.exchangeValues.put("USD", 0.99);
				this.exchangeValues.put("EUR", 0.88);
				this.exchangeValues.put("GBP", 0.76);
				this.exchangeValues.put("CHF", 1.00);
				this.exchangeValues.put("CNY", 6.67);
				this.exchangeValues.put("JPY", 110.28);
                                this.exchangeValues.put("INR", 69.44);
				break;
			case "Chinese Yuan Renminbi":
				this.exchangeValues.put("USD", 0.15);
				this.exchangeValues.put("EUR", 0.13);
				this.exchangeValues.put("GBP", 0.11);
				this.exchangeValues.put("CHF", 0.15);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("JPY", 16.54);
                                this.exchangeValues.put("INR", 10.41);
				break;
			case "Japanese Yen":
				this.exchangeValues.put("USD", 0.009);
				this.exchangeValues.put("EUR", 0.008);
				this.exchangeValues.put("GBP", 0.0069);
				this.exchangeValues.put("CHF", 0.0091);
				this.exchangeValues.put("CNY", 0.060);
				this.exchangeValues.put("JPY", 1.000);
                                this.exchangeValues.put("INR", 0.63);
				break;
                       case "Indian Rupee":
				this.exchangeValues.put("USD", 0.014);
				this.exchangeValues.put("EUR", 0.013);
				this.exchangeValues.put("GBP", 0.011);
				this.exchangeValues.put("CHF", 0.014);
				this.exchangeValues.put("CNY", 0.096);
				this.exchangeValues.put("JPY", 1.59);
                                this.exchangeValues.put("INR", 1.000);
				break;
                      
		}
	}
	
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add( new Currency("US Dollar", "USD") );
		currencies.add( new Currency("Euro", "EUR") );
		currencies.add( new Currency("British Pound", "GBP") );
		currencies.add( new Currency("Swiss Franc", "CHF") );
		currencies.add( new Currency("Chinese Yuan Renminbi", "CNY") );
		currencies.add( new Currency("Japanese Yen", "JPY") );
                currencies.add( new Currency("Indian Rupee", "INR") );
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}
