package com.ta.mobile.result;

import java.util.List;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class TestResult extends MyResult<String,List<String>> {

	public TestResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestResult(String key, List<String> value) {
		super(key, value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TestResult | " + key + " -> " + value ;
	}	

}
