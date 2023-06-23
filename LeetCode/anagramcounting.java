import java.math.BigInteger;
import java.util.*;

public class anagramcounting {
    public static BigInteger factorial(long number) {
        BigInteger factorial = new BigInteger("1");
        if (number == 0 || number == 1) return factorial;
        for (int i = 1; i <= number; i++) {
            factorial =  factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static BigInteger anagramCount(String word) {
        BigInteger result = factorial(word.length());

        HashMap<Character, Integer> wordMap = new HashMap<Character, Integer>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!wordMap.containsKey(c)){wordMap.put(c, 1);}
            else {wordMap.put(c,wordMap.get(c) +1);}
        }

        for (int i : wordMap.values()) {
             result = result.divide(factorial(i))  ;


        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfWords = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            // Process the input line
            listOfWords.add(input);
        }

        for (String word : listOfWords) {
            System.out.println(anagramCount(word));
        }
    }
}
