package com.javabhakt.core.designPatterns.creational.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMain {

	public static void main(String[] args)
			throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {

		System.out.println(SingletonClass.getInstance());
		System.out.println(SingletonClass.getInstance());

		LazySingleton instance1 = LazySingleton.getInstance();
		System.out.println(instance1.hashCode());

		/*
		 * LazySingleton instance2 = (LazySingleton)
		 * LazySingleton.getInstance().clone();
		 * System.out.println(instance2.hashCode());
		 */

		/*
		 * LazySingleton reflectionInstance = null; Constructor[] constructors =
		 * LazySingleton.class.getDeclaredConstructors(); for (Constructor constructor :
		 * constructors) { constructor.setAccessible(true); reflectionInstance =
		 * (LazySingleton) constructor.newInstance(); }
		 * System.out.println(reflectionInstance.hashCode());
		 */
		// Serialize Singleton object to a file
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instance1);
		out.close();
		// Deserialize singleton object from file
		ObjectInput input = new ObjectInputStream(new FileInputStream("singleton.ser"));
		LazySingleton instance2 = (LazySingleton) input.readObject();
		System.out.println(instance2.hashCode());
	}

}
