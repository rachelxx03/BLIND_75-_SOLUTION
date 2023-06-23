import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class guessinggame {
    public static void main(String[] args) {
        List<Boolean> v = new ArrayList<>(11);
        for (int i = 0; i <= 10; i++) {
            v.add(true);
        }

        Scanner scan = new Scanner(System.in);
        int n;

        while ((n = scan.nextInt()) != 0) {
            String trash = scan.next();
            String result = scan.next();

            if (result.equals("low")) {
                for (int i = 0; i <= n; i++) {
                    v.set(i, false);
                }
            } else if (result.equals("high")) {
                for (int i = n; i <= 10; i++) {
                    v.set(i, false);
                }
            } else {
                if (v.get(n)) {
                    System.out.println("Stan may be honest");
                } else {
                    System.out.println("Stan is dishonest");
                }

                v = new ArrayList<>(11);
                for (int i = 0; i <= 10; i++) {
                    v.add(true);
                }
            }
        }
    }
}
