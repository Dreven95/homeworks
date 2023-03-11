package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strings {

    public static void main(String[] args) throws IOException {
        //Ex 1
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        {
            System.out.println("Введите строку: ");
            String s = reader.readLine();
            String result = s.substring(0, 1).toUpperCase() + s.substring(1);
            System.out.println(result);
        }
        //Ex 1.2
        {
            System.out.println("Введите строку: ");
            String s = reader.readLine();
            int counter = 0;
            char[] chars = s.toCharArray();
            for (char element : chars) {
                if (element == ' ') {
                    counter++;
                }
            }
            System.out.println(counter);
        }
        //Ex 2
        {
            String history = "History is always written by the winners!" +
                    " When two cultures clash, the loser is obliterated," +
                    " and the winner writes the history books - books which glorify their own cause and disparage the conquered foe." +
                    " As Napoleon once said, 'What is history, but a fable agreed upon?'";
            String[] strArr = history.split("\\s+");
            System.out.println(strArr.length);
            char[] chars = history.toCharArray();
            int numberOfChars = 0;
            for (char element: chars) {
                numberOfChars++;
            }
            System.out.println(numberOfChars);
            int numberOfCharsWithoutSpaces = 0;
            for (char element: chars) {
                if (element == ' ') {
                    continue;
                }
                numberOfChars++;
            }
            System.out.println(numberOfCharsWithoutSpaces);
        }

        {
            countLetters("aaaaaAAAAaaaAaAaA");
            System.out.println(isPalindrome("казак"));
            alternationOfUppercaseAndLowercaseLetters("Привет, Мир!");
        }

    }
    //Ex 3
    public static void countLetters(String str) {
        int lowerCount = 0;
        int upperCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //Первое условие это проверка является буква английской или нет
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (Character.isLowerCase(c)) {
                    lowerCount++;
                } else if (Character.isUpperCase(c)) {
                    upperCount++;
                }
            }
        }

        System.out.println("Количество строчных букв: " + lowerCount);
        System.out.println("Количество заглавных букв: " + upperCount);
    }

    //Ex 4
    // Тут можно было заморочиться и решить по-другому, на каждой итерации цикла мы каждый раз создаём
    // новый объект класса String
    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        String reverseStr = "";
        for (int i = chars.length - 1; i >= 0 ; i--) {
            reverseStr += chars[i];
        }
        if (str.equals(reverseStr)) {
            return true;
        }
        else {
            return false;
        }
    }

    //Ex 5
    public static void alternationOfUppercaseAndLowercaseLetters(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                result += String.valueOf(chars[i]).toUpperCase();
            }
            else {
                result += String.valueOf(chars[i]).toLowerCase();
            }
        }
        System.out.println(result);
    }

}
