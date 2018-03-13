package main.com.roche.bos.impls;

import main.com.roche.constants.Constants;

public class ImmunologyTestBO extends TestBO{

	private boolean propTestImmuA;
	private String propTestImmuB;
	
	public ImmunologyTestBO(boolean passed,
			boolean propTestImmuA, String propTestImmuB) {
		super(passed, Constants.TEST_IMMU);
		this.propTestImmuA = propTestImmuA;
		this.propTestImmuB = propTestImmuB;
	}
	
	public boolean isPropTestImmuA() {
		return propTestImmuA;
	}
	public void setPropTestImmuA(boolean propTestImmuA) {
		this.propTestImmuA = propTestImmuA;
	}
	public String getPropTestImmuB() {
		return propTestImmuB;
	}
	public void setPropTestImmuB(String propTestImmuB) {
		this.propTestImmuB = propTestImmuB;
	}
	
	
}
