package pageObjects;

public class RegisterObj {
// Contact information
	public static final String textbox_FirstName = "//input[contains(@name,'firstName')]";
	
	public static final String textbox_LastName = "//input[contains(@name,'lastName')]";
	
	public static final String textbox_Phone = "//input[contains(@name,'phone')]";
	
	public static final String textbox_Email = "//input[contains(@id,'userName')]";
	
	
	// Mailing Information
	
	public static final String textbox_Address = "//input[contains(@name,'address1')]";
	public static final String textbox_City = "//input[contains(@name,'city')]";
	public static final String textbox_State = "//input[contains(@name,'state')]";
	public static final String testbox_PostalCode = "//input[contains(@name,'postal')]";
	public static final String Dropdow_Country = "//select[contains(@name,'country')]";
	
	// User Information
	
	
	public static final String textbox_Username = "//input[contains(@name,'email')]";
	public static final String textbox_Password = "//input[contains(@name,'password')]";
	public static final String textbox_ConfirmPassword = "//input[contains(@name,'confirmPass')]";
	
	
	
	public static final String Link_Submit = "//input[contains(@name,'register')]";
	
	
}
