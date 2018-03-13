package main.com.roche.services.impls;

import java.math.BigDecimal;
import java.util.ArrayList;

import main.com.roche.bos.impls.BloodSampleBO;
import main.com.roche.bos.impls.SampleBO;
import main.com.roche.bos.impls.TestBO;
import main.com.roche.bos.impls.UrineSampleBO;


public class ImmunologyTestServiceImpl extends BaseTestServiceImpl{

private static ImmunologyTestServiceImpl instance;
	
	private ImmunologyTestServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public static BaseTestServiceImpl getInstance() {
		if (instance == null)
			instance = new ImmunologyTestServiceImpl(); 
		
		return instance;
	}

	@Override
	public boolean doTest(TestBO test, ArrayList<SampleBO> samples){
		boolean resultSampleUrine = false;
		boolean resultSampleBlood = false;
		
		for (SampleBO sample: samples){
			if (sample instanceof UrineSampleBO){
				if (
						((UrineSampleBO) sample).getPropSampleUrineA() <= 100 &&
						((UrineSampleBO) sample).getPropSampleUrineB().compareTo(new BigDecimal("125")) <=0	
				   )
					resultSampleUrine = true;
				else resultSampleBlood = false;
			}
			
			else if (sample instanceof BloodSampleBO){
				if (
					((BloodSampleBO) sample).getPropSampleBloodA() <= 150
				   )
				   resultSampleBlood = true;
				else resultSampleBlood = false;
				
			}
					
		}
		
		return resultSampleBlood && resultSampleUrine;
	}
}
