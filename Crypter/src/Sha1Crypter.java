import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;

public class Sha1Crypter {

	public static void main(String[] args) {
		String str = "Teszt1234";
		String encode = SHA1Str(str);
		System.out.println(encode);
	}

	private static String SHA1Str(String str) {
		String sha1 = str;
		try {
			MessageDigest crypt = MessageDigest.getInstance("SHA-1");
			crypt.reset();
			crypt.update(str.getBytes("UTF-8"));
			sha1 = byteToHex(crypt.digest());
		} catch (NullPointerException e) {
			System.out.println("Error in get SHA1: encoded string is null!");
		} catch (NoSuchAlgorithmException e) {
			System.out.println("Error in get SHA1 from [" + str + "]");
		} catch (UnsupportedEncodingException e) {
			System.out.println("Eencoding error in get SHA1 from [" + str + "]");
		}
		return sha1;
	}

	private static String byteToHex(byte[] digest) {
		Formatter formatter = new Formatter();
		for (byte b : digest) {
			formatter.format("%02x", b);
		}
		String result = formatter.toString();
		formatter.close();
		return result;
	}
}