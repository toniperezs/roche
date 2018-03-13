package main.com.roche.bos.impls;

import main.com.roche.constants.Constants;

public class BiochemistryTestBO extends TestBO{

	
	private int propTestBioA;
	private String propTestBioB;
	
	
	
	public BiochemistryTestBO(boolean passed,
			int propTestBioA, String propTestBioB) {
		super(passed, Constants.TEST_BIO);
		this.propTestBioA = propTestBioA;
		this.propTestBioB = propTestBioB;
	}
	
	public int getPropTestBioA() {
		return propTestBioA;
	}
	public void setPropTestBioA(int propTestBioA) {
		this.propTestBioA = propTestBioA;
	}
	public String getPropTestBioB() {
		return propTestBioB;
	}
	public void setPropTestBioB(String propTestBioB) {
		this.propTestBioB = propTestBioB;
	}
	
	
}
