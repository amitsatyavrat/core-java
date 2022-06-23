package com.javabhakt.core.java8.basics.marker;

public class DaoFramework {

	public void delete (Object object) {
		if (object instanceof Deletable) {
			//write DB logic
		}
	}
}
