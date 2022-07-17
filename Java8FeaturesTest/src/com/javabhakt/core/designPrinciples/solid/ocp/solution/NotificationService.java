package com.javabhakt.core.designPrinciples.solid.ocp.solution;

public interface NotificationService {

	public void sendOtp (String medium);
	
	public void sendTransactionReport (String medium);
}
