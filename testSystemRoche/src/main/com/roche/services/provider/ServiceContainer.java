package main.com.roche.services.provider;

import java.util.HashMap;

import main.com.roche.constants.Constants;
import main.com.roche.services.impls.BaseTestServiceImpl;
import main.com.roche.services.impls.BiochemistryTestServiceImpl;
import main.com.roche.services.impls.ImmunologyTestServiceImpl;


public class ServiceContainer {

	private final HashMap<String, BaseTestServiceImpl> services;
	private static ServiceContainer instance;
	
	private ServiceContainer(){
		super();
		services = new HashMap<String, BaseTestServiceImpl>();
		
		//HARDCODED. Would be desirable to be through an XML conf file to not to change it every time a new service is added
		//Identificador-class
		services.put(Constants.TEST_BIO, BiochemistryTestServiceImpl.getInstance());
		services.put(Constants.TEST_IMMU, ImmunologyTestServiceImpl.getInstance());
		
	}
	
	public static ServiceContainer getInstance() {
		if (instance == null)
			instance = new ServiceContainer(); 
		
		return instance;
	}
	
	/**
	 * 
	 * @param testBO
	 */
	public BaseTestServiceImpl getService(String identifier){
		
		BaseTestServiceImpl service = services.get(identifier);
		if (service == null){
			System.out.println("No existe el servicio con nombre:"+identifier);
		}
		
		return service;
	}
	
}
