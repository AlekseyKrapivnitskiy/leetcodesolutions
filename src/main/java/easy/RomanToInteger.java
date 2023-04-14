package easy;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(romanToInt(scanner.nextLine()));
    }

    public static int romanToInt(String s) {
        int result = 0;

        if(s.matches("^[IVXMCDL]*$") && s.length() <= 15) {
            if(s.contains("IV")) {
                result +=4;
                s = s.replaceFirst("IV", "");
            }
            if(s.contains("IX")) {
                result +=9;
                s = s.replaceFirst("IX", "");
            }
            if(s.contains("XL")) {
                result +=40;
                s = s.replaceFirst("XL", "");
            }
            if(s.contains("XC")) {
                result +=90;
                s = s.replaceFirst("XC", "");
            }
            if(s.contains("CD")) {
                result +=400;
                s = s.replaceFirst("CD", "");
            }
            if(s.contains("CM")) {
                result +=900;
                s = s.replaceFirst("CM", "");
            }
            result += sumRomanCharsFromString(s);
        } else {
            System.out.println("Input should contain only characters: 'I', 'V', 'X', 'L', 'C', 'D', 'M' and should be " +
                    "more or equal 1 and less or equal 15");
        }
        return result;
    }

    public static int sumRomanCharsFromString(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            sum += getIntFromRoman(Character.toString(str.charAt(i)));
        }
        return sum;
    }
    public static int getIntFromRoman(String roman) {
        return switch (roman) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };
    }
}
