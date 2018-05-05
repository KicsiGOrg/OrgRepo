import java.security.NoSuchAlgorithmException;

public class Main {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		String str = "Teszt1234";
		byte[] hash = Sha256Crypter.Sha256(str);
		System.out.println(hash);
		
		// 369D3CE0EE61B5D3E4192160BC57D51D904C8D5E8748D834142DCFCA044BDC28
		
	}

}
