import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SUM {

    public static void main(String[] args) {
        byte[] hash = new byte[0];
        StringBuilder hexString = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            hash = digest.digest("admin".getBytes("UTF-8"));
            hexString = new StringBuilder();
            for (byte aHash : hash) {
                String hex = Integer.toHexString(0xff & aHash);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        System.out.println(hexString.toString());

    }
}
