import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHash512 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String generateHash = passwordHash("admin");
        System.out.println (generateHash);
    }

    public static String passwordHash(String input) throws NoSuchAlgorithmException {
            MessageDigest objSHA = MessageDigest.getInstance("SHA-512");
            byte[] bytSHA = objSHA.digest(input.getBytes());
            BigInteger intNumber = new BigInteger(1, bytSHA);
            String strHashCode = intNumber.toString(16);

            // pad with 0 if the hexa digits are less then 128.
        while (strHashCode.length() < 128) {
                strHashCode = "0" + strHashCode;
            }
            return strHashCode;

        }
}