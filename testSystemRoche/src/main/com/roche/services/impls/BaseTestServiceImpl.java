package main.com.roche.services.impls;


import java.util.ArrayList;

import main.com.roche.bos.impls.SampleBO;
import main.com.roche.bos.impls.TestBO;



public abstract class BaseTestServiceImpl {
	

	protected BaseTestServiceImpl() {
		super();
	}
	
	public abstract boolean doTest(TestBO test, ArrayList<SampleBO> samples);
		
		
	
	
	

}
