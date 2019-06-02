package pageObjects;

public class FlightFinderObj {

	public static final String link_Flight = "//a[contains(text(),'Flights')]";
	public static final String radiobutton_Roundtrip = "//input[contains(@value,'roundtrip')]";
	public static final String dropdown_Passengers = "//select[contains(@name,'passCount')]";
	public static final String dropdown_DepartingFrom = "//select[contains(@name,'fromPort')]";
	public static final String dropdown_DepartingOnMonth = "//select[contains(@name,'fromMonth')]";
	public static final String dropdown_DepartingOnDate = "//select[contains(@name,'fromDay')]";
	public static final String dropdown_ArrivingIn = "//select[contains(@name,'toPort')]";
	public static final String dropdown_ReturningOnMonth = "//select[contains(@name,'toMonth')]";
	public static final String dropdown_ReturningOnDate = "//select[contains(@name,'toDay')]";
	
	public static final String radiobutton_FirstClass = "//input[contains(@value,'First')]";
	public static final String button_Continue = "//input[contains(@name, 'findFlights')]";
}
