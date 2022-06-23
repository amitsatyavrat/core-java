package com.javabhakt.core.designPatterns.creational.Singleton;

import java.io.Serializable;

public class LazySingleton extends MyClone implements Serializable {

	private static LazySingleton instance;

	// restrict reflection
	private LazySingleton() {
		if (instance != null) {
			throw new IllegalStateException();
		}
	}

	// restrict deserialization
	protected Object readResolve() {
		return instance;

	}

	// restrict cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			return instance = new LazySingleton();
		}
		return instance;
	}

}
