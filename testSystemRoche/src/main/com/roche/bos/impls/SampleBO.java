package main.com.roche.bos.impls;

import java.math.BigDecimal;

public abstract class SampleBO {

	private BigDecimal quantity;

	
	public SampleBO(BigDecimal quantity) {
		super();
		this.quantity = quantity;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	
}
