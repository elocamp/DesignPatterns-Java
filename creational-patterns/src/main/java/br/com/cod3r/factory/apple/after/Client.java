package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.*;
import br.com.cod3r.factory.apple.after.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();
		IPhoneFactory iphone11Factory = new IPhone11Factory();
		IPhoneFactory iphoneXSMaxFactory = new IPhoneXSMaxFactory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iPhone1 = iphoneXFactory.orderIPhone();
		System.out.println(iPhone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iPhone2);

		System.out.println("\n\n### Ordering an iPhone 11");
		IPhone iPhone3 = iphone11Factory.orderIPhone();
		System.out.println(iPhone3);

		System.out.println("\n\n### Ordering an iPhone XS Max");
		IPhone iPhone4 = iphoneXSMaxFactory.orderIPhone();
		System.out.println(iPhone4);
	}
}
