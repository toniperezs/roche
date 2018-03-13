package main.com.roche.services.impls;

import java.util.ArrayList;

import main.com.roche.bos.impls.BloodSampleBO;
import main.com.roche.bos.impls.SampleBO;
import main.com.roche.bos.impls.TestBO;




public class BiochemistryTestServiceImpl extends BaseTestServiceImpl{

	private static BiochemistryTestServiceImpl instance;
	
	private BiochemistryTestServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public static BaseTestServiceImpl getInstance() {
		if (instance == null)
			instance = new BiochemistryTestServiceImpl(); 
		
		return instance;
	}

	@Override
	public boolean doTest(TestBO test, ArrayList<SampleBO> samples){
		
		for (SampleBO sample: samples){
			if ((sample instanceof BloodSampleBO) &&
				((BloodSampleBO) sample).getPropSampleBloodA() <= 100)
				
				return true;
		}
		return false;
	}
}
