import org.w3c.dom.ls.LSOutput;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static SecureRandom rand = new SecureRandom();

    private static final String lettersCapped = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String letters = "abcdefghijklmnopqrstuvwxyz";
    private static final String numbers = "123456789";
    private static final String specialCharacters = "!@#$%^&*";

    public static String generatePassword(int size, String dic) {
        String result = "";
        for (int i = 0; i < size; i++) {
            int index = rand.nextInt(dic.length());
            result += dic.charAt(index);
        }
        return result;
    }

    public static void main(String[] args) {
        String password = generatePassword(10, letters + numbers);
        System.out.println(password);
    }
}
