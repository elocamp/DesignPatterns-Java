package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.*;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iPhone1 = iphoneXFactory.orderIPhone("standard");
		System.out.println(iPhone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = iphone11Factory.orderIPhone("highEnd");
		System.out.println(iPhone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iPhone3 = iphone11Factory.orderIPhone("standard");
		System.out.println(iPhone3);

		System.out.println("\n\n### Ordering an iPhone XS Max");
		IPhone iPhone4 = iphoneXFactory.orderIPhone("highEnd");
		System.out.println(iPhone4);
	}
}
