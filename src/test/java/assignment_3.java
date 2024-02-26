import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class assignment_3 {
    public static void main(String[] args) {
        //Hash the password using a random salt . Submit code for hashing and matching password with the salted hash .
        //The algorithm for matching password should return the result in constant time.
        String password = "sahanaPandith";
        String salt = generateSalt();
        String hashedPassword = hashPassword(password, salt);
        System.out.println("Password: " + password);
        System.out.println("Salt: " + salt);
        System.out.println("Hashed password: " + hashedPassword);

        //Verify the entered password against the stored hash and salt
        boolean passwordMatch = verifyPassword(password, hashedPassword, salt);
        System.out.println("Password Match: " + passwordMatch);
    }

    private static String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] saltBytes = new byte[16];
        random.nextBytes(saltBytes);
        return bytesToHex(saltBytes);
    }

    private static String hashPassword(String password, String salt) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            String input = password + salt;
            byte[] hashBytes = digest.digest(input.getBytes());
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password: ", e);
        }
    }

    private static boolean verifyPassword(String enteredPassword, String storedHash, String salt) {
        String hashedEnteredPassword = hashPassword(enteredPassword, salt);
        return MessageDigest.isEqual(hexStringToByteArray(hashedEnteredPassword), hexStringToByteArray(storedHash));
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder hexStringBuilder = new StringBuilder();
        for (byte b : bytes) {
            hexStringBuilder.append(String.format("%02x", b));
        }
        return hexStringBuilder.toString();
    }

    private static byte[] hexStringToByteArray(String hexString) {
        int len = hexString.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4) + Character.digit(hexString.charAt(i + 1), 16));
        }
        return data;
    }
}