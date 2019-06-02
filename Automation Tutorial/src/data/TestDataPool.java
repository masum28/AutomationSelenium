package data;

import java.util.HashMap;

import utils.ExcelUtils;

public class TestDataPool {

public static HashMap<String, String> tcData = new HashMap<>();
	public TestDataPool() {
		try {
			tcData = ExcelUtils.getTestDataXls(Constants.DATAPOOL_PATH, "Automation", 0, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
		// This is Parameterized construcotr to read any test case data
			public TestDataPool(int tcRowNumber) {
				try {
					tcData = ExcelUtils.getTestDataXls(Constants.DATAPOOL_PATH, "Automation", 0, tcRowNumber);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
