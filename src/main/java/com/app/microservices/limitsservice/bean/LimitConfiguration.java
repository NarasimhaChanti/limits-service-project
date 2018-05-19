package com.app.microservices.limitsservice.bean;

public class LimitConfiguration {
	
	private Integer minimum;
	private Integer Maximum;
	
	public LimitConfiguration() {
		
	}

	public LimitConfiguration(Integer minimum, Integer maximum) {
		super();
		this.minimum = minimum;
		Maximum = maximum;
	}

	public Integer getMinimum() {
		return minimum;
	}

	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}

	public Integer getMaximum() {
		return Maximum;
	}

	public void setMaximum(Integer maximum) {
		Maximum = maximum;
	}

	@Override
	public String toString() {
		return "LimitConfiguration [minimum=" + minimum + ", Maximum="
				+ Maximum + "]";
	}
	
}
