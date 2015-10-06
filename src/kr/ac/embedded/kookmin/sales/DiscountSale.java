package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {
	private double	discount;	// A percent of the price. Cannot be negative.
								
	public DiscountSale() {
		/** 援ы쁽 �븯�떆�삤 **/ 
	}
	
	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		setName(theName);
		setPrice(thePrice);
		discount = theDiscount;
	}
	
	public DiscountSale(DiscountSale originalObject) {
		/** 援ы쁽 �븯�떆�삤 **/ 
	}
	
	public static void announcement() {
		System.out.println("This is the DiscountSale class.");
	}
	
	public double bill() {
		return this.getPrice()*(1 - discount/100);
	}
	
	public double getDiscount() {
		return discount;
	}
	
	/**
	 * Precondition: Discount is nonnegative.
	 */
	public void setDiscount(double newDiscount) {
		discount = newDiscount;
	}
	
	public String toString() {
		return (getName() + " Price = $" + getPrice() + " Discount = " + discount + "%\n" + "   Total cost = $" + bill());
	}
	
	public boolean equals(Object otherObject) {
		if (otherObject instanceof DiscountSale)
			return true;
		else
			return false;
	}
	
	
	public DiscountSale clone() {
		return this.clone();
	}
}
