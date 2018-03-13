package main.com.roche.bos.impls;

public abstract class TestBO {

	private boolean passed;
	private String identifier;
	
	
	public TestBO(boolean passed, String identifier) {
		super();
		this.passed = passed;
		this.identifier = identifier;
	}


	public boolean isPassed() {
		return passed;
	}
	
	
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	
}
