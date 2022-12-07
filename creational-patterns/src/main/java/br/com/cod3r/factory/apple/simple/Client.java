package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneSimpleFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneSimpleFactory iPhoneSimpleFactory = new IPhoneSimpleFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iPhone1 = iPhoneSimpleFactory.orderIPhone("11", "standard");
		System.out.println(iPhone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = iPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iPhone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iPhone3 = iPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iPhone3);

		System.out.println("\n\n### Ordering an iPhone XS Max");
		IPhone iPhone4 = iPhoneSimpleFactory.orderIPhone("X", "highEnd");
		System.out.println(iPhone4);
	}
}
