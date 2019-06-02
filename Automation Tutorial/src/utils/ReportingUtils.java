package utils;

public class ReportingUtils { 

	public static void  reportResult (String reportComment, String expectedValue, String actualValue) {

		if(expectedValue.equals(actualValue))

			System.out.println("Pass - "+reportComment + ": Expected = "+expectedValue+"& actual = "+actualValue);

		else
			System.out.println("Fail - "+reportComment + ": Expected = "+expectedValue+"is NOT same as actual = "+actualValue);
	}

		

			public static void  reportResult (String reportComment, int expectedValue, int actualValue) {

				if(expectedValue == actualValue)

					System.out.println("Pass - "+reportComment + ": Expected = "+expectedValue+"& actual = "+actualValue);

				else
					System.out.println("Fail - "+reportComment + ": Expected = "+expectedValue+"is NOT same as actual = "+actualValue);
	}
		}

