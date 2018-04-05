import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.Formatter;

public class PasswordHash512_256 {

    public static void main(String args[]) {
        String Password = "8ddnh5gjn0";
        System.out.println(PasswordHash512_256.SHAStr(Password));

    }

    public static String SHAStr(String str) {
        Security.addProvider(new BouncyCastleProvider());
        String sha = "";
        try {
            MessageDigest crypt = MessageDigest.getInstance("SHA-512/256");
            crypt.reset();
            crypt.update(str.getBytes("UTF-8"));

            sha = byteToHex(crypt.digest());
        } catch (NullPointerException e) {
            System.out.println("Error in get SHA-512_256: encoded string is null!");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error in get SHA-512/256 from [" + str + "]");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Encoding error in get SHA-512/256 from [" + str + "]");
        }

        return sha.toString();
    }

    public static String byteToHex(final byte[] hash) {

        Formatter formatter = new Formatter();
        for (byte b : hash) {
            byte[] valami = new byte [1];
            valami[0] = b;
            formatter.format("%02x", new Object[]{b});
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

}
