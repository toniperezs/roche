package main.com.roche.bos.impls;

import java.math.BigDecimal;

public class UrineSampleBO extends SampleBO{
	
	private short propSampleUrineA;
	private BigDecimal propSampleUrineB;
	
	public UrineSampleBO(BigDecimal quantity, short propSampleUrineA,
			BigDecimal propSampleUrineB) {
		super(quantity);
		this.propSampleUrineA = propSampleUrineA;
		this.propSampleUrineB = propSampleUrineB;
	}
	public short getPropSampleUrineA() {
		return propSampleUrineA;
	}
	public void setPropSampleUrineA(short propSampleUrineA) {
		this.propSampleUrineA = propSampleUrineA;
	}
	public BigDecimal getPropSampleUrineB() {
		return propSampleUrineB;
	}
	public void setPropSampleUrineB(BigDecimal propSampleUrineB) {
		this.propSampleUrineB = propSampleUrineB;
	}

	
}
