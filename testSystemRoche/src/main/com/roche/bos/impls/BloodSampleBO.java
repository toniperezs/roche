package main.com.roche.bos.impls;

import java.math.BigDecimal;

public class BloodSampleBO extends SampleBO{
	
	private int propSampleBloodA;

	
	
	public BloodSampleBO(BigDecimal quantity, int propSampleBloodA) {
		super(quantity);
		this.propSampleBloodA = propSampleBloodA;
	}

	public int getPropSampleBloodA() {
		return propSampleBloodA;
	}

	public void setPropSampleBloodA(int propSampleBloodA) {
		this.propSampleBloodA = propSampleBloodA;
	}
	
	

}
