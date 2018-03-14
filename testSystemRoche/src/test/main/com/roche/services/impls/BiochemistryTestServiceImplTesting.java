package test.main.com.roche.services.impls;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;

import main.com.roche.bos.impls.BiochemistryTestBO;
import main.com.roche.bos.impls.BloodSampleBO;
import main.com.roche.bos.impls.SampleBO;
import main.com.roche.bos.impls.TestBO;
import main.com.roche.bos.impls.UrineSampleBO;
import main.com.roche.services.impls.BaseTestServiceImpl;
import main.com.roche.services.provider.ServiceLocator;

import org.junit.Before;
import org.junit.Test;


public class BiochemistryTestServiceImplTesting {

	private BaseTestServiceImpl biochemistryTestService;
	private TestBO testBO;
	private BloodSampleBO sampleBlood;
	private UrineSampleBO urineSample;
	private ArrayList<SampleBO> samples;
	
	@Before
	public void initialize(){
		testBO = new BiochemistryTestBO(false, 150, "propB");
		samples = new ArrayList<SampleBO>();
		biochemistryTestService = ServiceLocator.getInstance().getService(testBO.getIdentifier());
	}
	
	@Test
	public void propAOfBloodSampleMinorThan100ShouldReturnTrue() {
		sampleBlood = new BloodSampleBO(new BigDecimal("150.6"), 85);
		samples.add(sampleBlood);
		
		assertTrue(biochemistryTestService.doTest(testBO, samples));
	}
	
	@Test
	public void propAOfBloodSampleEqualsTo100ShouldReturnTrue() {
		sampleBlood = new BloodSampleBO(new BigDecimal("150.6"), 100);
		samples.add(sampleBlood);
		
		assertTrue(biochemistryTestService.doTest(testBO, samples));
    }
	
	@Test
	public void propAOfBloodSampleBiggerThan100ShouldReturnFalse() {
		sampleBlood = new BloodSampleBO(new BigDecimal("150.6"), 112);
		samples.add(sampleBlood);
		
		assertFalse(biochemistryTestService.doTest(testBO, samples));
    }

}
