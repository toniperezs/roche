package main.com.roche.services.provider;

import main.com.roche.services.impls.BaseTestServiceImpl;



public class ServiceLocator {

	private static ServiceLocator instance;

	private ServiceLocator() {
		super();
	}
	
	public static ServiceLocator getInstance() {
		if (instance == null)
			instance = new ServiceLocator(); 
		
		return instance;
	}
	
	public BaseTestServiceImpl getService(String identifier){
		return ServiceContainer.getInstance().getService(identifier);
	}
}
