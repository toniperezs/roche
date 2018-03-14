package main.com.roche.client;

import java.math.BigDecimal;
import java.util.ArrayList;

import main.com.roche.bos.impls.BloodSampleBO;
import main.com.roche.bos.impls.ImmunologyTestBO;
import main.com.roche.bos.impls.OrderBO;
import main.com.roche.bos.impls.PatientBO;
import main.com.roche.bos.impls.SampleBO;
import main.com.roche.bos.impls.TestBO;
import main.com.roche.bos.impls.UrineSampleBO;
import main.com.roche.integration.impls.Facade;


public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList testsLists = new ArrayList<TestBO>();
		TestBO test = new ImmunologyTestBO(false, false, "propB");
		testsLists.add(test);
		
		ArrayList samplesList = new ArrayList<SampleBO>();
		SampleBO bloodSample = new BloodSampleBO(new BigDecimal("12.36"), 12);
		SampleBO urineSample = new UrineSampleBO(new BigDecimal("12.36"), (short)45, new BigDecimal(129));
		samplesList.add(bloodSample);
		samplesList.add(urineSample);
		
		PatientBO patient = new PatientBO("Patient" , "A", "11111111H");
		
		OrderBO order = new OrderBO(patient, samplesList, testsLists);
		
		Facade.getInstance().analizeOrder(order);

	}
	
}
