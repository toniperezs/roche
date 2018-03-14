package main.com.roche.integration.impls;

import main.com.roche.bos.impls.OrderBO;
import main.com.roche.bos.impls.TestBO;
import main.com.roche.integration.interfaces.FacadeInterface;
import main.com.roche.services.impls.BaseTestServiceImpl;
import main.com.roche.services.provider.ServiceLocator;




public class Facade implements FacadeInterface {

	private static Facade instance;
	
	private Facade(){

	}
	
	public static Facade getInstance(){
		
		if (instance == null)
			instance = new Facade(); 
		
		return instance;
			
	}

	
	/**
	 * 
	 * @param orderBO
	 */
	@Override
	public void analizeOrder(OrderBO orderBO){
		
		//Iterate tests to be done
		for(TestBO test : orderBO.getTests()){
			BaseTestServiceImpl service = ServiceLocator.getInstance().getService(test.getIdentifier());
			service.doTest(test, orderBO.getSamples());
		}

	}
}
