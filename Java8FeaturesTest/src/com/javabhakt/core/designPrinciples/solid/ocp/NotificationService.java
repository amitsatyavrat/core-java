package com.javabhakt.core.designPrinciples.solid.ocp;

/*Open closed principle states that to add a new requirement the module 
 * should be open for extension
 * but closed for modifications*/

public class NotificationService {

	public void sendOtp(String medium) {
		if (medium.equals("email")) {
			// Java mail api

		}
		if (medium.equals("mobile")) {

			// tullio api
		}
	}
}
