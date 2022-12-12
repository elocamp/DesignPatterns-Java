package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.EJBAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory EJBFactory = new EJBAbstractFactory();
		ServicesAbstractFactory RESTFactory = new RestAbstractFactory();

		UserService EJBUserService = EJBFactory.getUserService();
		System.out.println("\n########## EJB User Service");
		EJBUserService.save("John");
		EJBUserService.delete(5);

		CarService EJBCarService = EJBFactory.getCarService();
		System.out.println("\n########## EJB Car Service");
		EJBCarService.save("Prius");
		EJBCarService.update("Audi A7");

		UserService RESTUserService = RESTFactory.getUserService();
		System.out.println("\n########## REST User Service");
		RESTUserService.save("Mary");
		RESTUserService.delete(5);

		CarService RESTCarService = EJBFactory.getCarService();
		System.out.println("\n########## REST Car Service");
		RESTCarService.save("Fusion");
		RESTCarService.update("BMW X7");
	}
}
