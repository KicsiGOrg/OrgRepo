import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-mm-DD");
        Date birthDate = dateFormat.parse("1985-01-01");

		User user = new User();
		user.fisrtName = "Mezei";
		user.lastName = "Virág";
		user.loginName = "Mezei_Virag85";
		user.password = "********";
		user.confirmPassword = "********";
		user.phoneNumber = "+36701234567";
		user.emailAddress = "virag.mezei85@gmail.com";
		user.billingAddressSameDeliveryAddress = true;
		user.birthDate = birthDate;
		
		Address userAddress = new Address();
		userAddress.addressType = AddressType.BILLING;
		userAddress.zipCode = 1111;
		userAddress.city = City.BUDAPEST;
		userAddress.street = Street.ETELE;
		userAddress.streetType = StreetType.ÚT;
		userAddress.streetNumber = "50";
		userAddress.floor = "FÉLEMELET";
		userAddress.door = "8/A";
		
	}
}