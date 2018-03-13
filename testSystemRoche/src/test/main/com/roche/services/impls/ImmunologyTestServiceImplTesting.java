package test.main.com.roche.services.impls;


import static org.junit.Assert.*;


import java.math.BigDecimal;
import java.util.ArrayList;


import main.com.roche.bos.impls.BloodSampleBO;
import main.com.roche.bos.impls.ImmunologyTestBO;

import main.com.roche.bos.impls.SampleBO;
import main.com.roche.bos.impls.TestBO;
import main.com.roche.bos.impls.UrineSampleBO;
import main.com.roche.constants.Constants;
import main.com.roche.services.impls.BaseTestServiceImpl;
import main.com.roche.services.impls.BiochemistryTestServiceImpl;
import main.com.roche.services.provider.ServiceLocator;

import org.junit.Before;
import org.junit.Test;

public class ImmunologyTestServiceImplTesting {

	private BaseTestServiceImpl immunologyTestService;
	private TestBO testBO;
	private BloodSampleBO sampleBlood;
	private UrineSampleBO sampleUrine;
	private ArrayList<SampleBO> samples;
	
	@Before
	public void initialize(){
		testBO = new ImmunologyTestBO(false, true, "propB");
		samples = new ArrayList<SampleBO>();
		immunologyTestService = ServiceLocator.getInstance().getService(testBO.getIdentifier());
	}
	
	@Test
	public void propAOfUrineSampleBiggerThan100ShouldReturnFalse() {
		sampleBlood = new BloodSampleBO(new BigDecimal("150.6"), 85);
		sampleUrine = new UrineSampleBO(new BigDecimal("215"), (short) 120, new BigDecimal("12.6"));
		samples.add(sampleBlood);
		samples.add(sampleUrine);
		
		assertFalse(immunologyTestService.doTest(testBO, samples));
	}
	
	@Test
	public void propAOfUrineSampleMinorThan100AndPropBOfUrineSampleBiggerThan125ShouldReturnFalse() {
		sampleBlood = new BloodSampleBO(new BigDecimal("150.6"), 85);
		sampleUrine = new UrineSampleBO(new BigDecimal("215"), (short) 65, new BigDecimal("129.36"));
		samples.add(sampleBlood);
		samples.add(sampleUrine);
		
		assertFalse(immunologyTestService.doTest(testBO, samples));
	}
	
	@Test
	public void propAOfUrineSampleMinorThan100AndPropBOfUrineSampleMinorThan125ShouldReturnTrue() {
		sampleBlood = new BloodSampleBO(new BigDecimal("150.6"), 85);
		sampleUrine = new UrineSampleBO(new BigDecimal("215"), (short) 65, new BigDecimal("121"));
		samples.add(sampleBlood);
		samples.add(sampleUrine);
		
		assertTrue(immunologyTestService.doTest(testBO, samples));
	}
	
	@Test
	public void propAOfBloodSampleBiggerThan150ShouldReturnFalse() {
		sampleBlood = new BloodSampleBO(new BigDecimal("155"), 160);
		samples.add(sampleBlood);
		
		assertFalse(immunologyTestService.doTest(testBO, samples));
    }

}
