import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class headguard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            lines.add(line);
        }

        for (String line : lines) {
            headguard(line);
        }
    }


    public static void headguard (String code) {
        Character currentChar = code.charAt(0) ;
        int count = 1 ;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < code.length(); i++){
            char nextChar = code.charAt(i);
            if(nextChar == currentChar){
                count++;
            }else {
                result.append(count).append(currentChar);
                currentChar = nextChar;
                count = 1;
            }
            if(i == code.length()-1){
                result.append(count).append(currentChar);
            }
        }
        System.out.println(result);
    }
}
