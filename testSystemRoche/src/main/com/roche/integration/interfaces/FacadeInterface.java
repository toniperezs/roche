package main.com.roche.integration.interfaces;

import main.com.roche.bos.impls.OrderBO;



/**
 * @author antonio
 * @version 1.0
 * @created 12-mar-2018 9:29:55
 */
public interface FacadeInterface {

	/**
	 * 
	 * @param orderBO
	 */
	public void analizeOrder(OrderBO orderBO);

}
