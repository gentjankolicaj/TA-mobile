package com.ta.mobile.result;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class StepResult extends MyResult<String, String> {
	

	public StepResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StepResult(String key, String value) {
		super(key, value);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "StepResult | " + key + " -> " + value ;
	}

	
}
