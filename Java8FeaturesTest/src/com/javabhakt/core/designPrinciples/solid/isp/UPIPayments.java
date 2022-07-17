package com.javabhakt.core.designPrinciples.solid.isp;
/*The Interface Segregation Principle states that the larger 
 * interfaces should be split into smaller interfaces so that implementation classes
 * only implement only those what they require. Client should not be forced to
 * implement those he does not want. Its similar to Single responsibility.*/
public interface UPIPayments {

	public void payMoney ();
	
	public void getScratchCard ();
	
	public void getCashbackAsCreditBalance ();
}
