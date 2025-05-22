package P10;

import java.io.IOException;
import java.util.Scanner;

public class PostFixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;

        while (true) {
            System.out.print("Enter postfix: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }
            ParsePost aparser = new ParsePost(input);
            output = aparser.doParse();
            System.out.println("Hasil Operasi: " + output);
        } 
    }
    public static String getString() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}
