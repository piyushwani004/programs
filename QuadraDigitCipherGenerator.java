import java.util.*;

public class QuadraDigitCipherGenerator {
    // Step 1. Generate 16 digit wich is not duplicated
    // Step 2. divide by 4 digit

    private static List<Integer> pickRandomIndex (String original, int count) {
        List<Integer> randIndices = new ArrayList<Integer>();
        Set<Integer> noDuplicateIndices = new HashSet<Integer>();
        System.out.println(noDuplicateIndices.size() + "    " + count);
        while (noDuplicateIndices.size() < count){
            System.out.println(noDuplicateIndices.size() + "    " + count);
            int randNumber = (int)(Math.random() * original.length());
            noDuplicateIndices.add(randNumber);
        }
        randIndices.addAll(noDuplicateIndices);
        return randIndices;
    }

    // FROM 97 - 122
    private static char convertDigit2Char(char digit) {
        return (char)(17 + digit);
    }

    private static String generateCode(int digit, int charCnt) {
        long nano = System.nanoTime();
        StringBuilder util = new StringBuilder(String.valueOf(nano));
        util = util.reverse();
        List<Integer> convertIndices = pickRandomIndex(util.toString(), charCnt);
        System.out.println("Below indices will be casting to Alphabet " + convertIndices);

        for(Integer i : convertIndices){
            char target = util.charAt(i);
            util.setCharAt(i, convertDigit2Char(target));
        }
        return util.toString();
    }

    private static String beautifyDigits(String original, int term){
        System.out.println("original " + original);
        return original.substring(0, term) + "-" + original.substring(term, 2*term)
                + "-" + original.substring(2*term, 3*term) + "-" + original.substring(3*term, 4*term);
    }


    public static void main(String argv[]) throws Exception {
        int digit = 16;
        System.out.println(digit + " digits random code > " + beautifyDigits(generateCode(16, 4), 4));
    }
}