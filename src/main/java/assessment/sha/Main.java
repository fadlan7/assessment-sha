package assessment.sha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static void characterCounting(String text) {
        int upperCase = 0;
        int lowercase = 0;
        int number = 0;
        int symbol = 0;
        String regexSymbol = "[+\\-×÷=<>.,;:?!=\\-\\u20AC\\u00A3\\u00A5@#^&*()]";

        Pattern pattern = Pattern.compile(regexSymbol);
        Matcher matcher = pattern.matcher(text);

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if (Character.isLowerCase(character)) {
                lowercase++;
            } else if (Character.isUpperCase(character)) {
                upperCase++;
            } else if (Character.isDigit(character)) {
                number++;
            } else if (matcher.find()) {
                symbol++;
            }
        }

        System.out.println("uppercase : " + upperCase);
        System.out.println("lowercase : " + lowercase);
        System.out.println("angka : " + number);
        System.out.println("symbol : " + symbol);
    }

    public static void main(String[] args) {
        characterCounting("pemrogramanDasarJava1");
    }
}