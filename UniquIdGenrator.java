// Your own package

// Import required class
import java.security.SecureRandom;

/**
 * Basic example of random strings with SecureRandom
 *
 */
public class Index {

    public static String generateRandomString(int length) {
	        String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
	        String CHAR_UPPER = CHAR_LOWER.toUpperCase();
	        String NUMBER = "0123456789";

	        String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
	        SecureRandom random = new SecureRandom();

	        if (length < 1) throw new IllegalArgumentException();

	        StringBuilder sb = new StringBuilder(length);

	        for (int i = 0; i < length; i++) {
	            // 0-62 (exclusive), random returns 0-61
	            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
	            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

	            sb.append(rndChar);
	        }

	        return sb.toString();
    }

    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            System.out.println("Random string: " + generateRandomString(10));
            System.out.println("\n");
        }
    }
}