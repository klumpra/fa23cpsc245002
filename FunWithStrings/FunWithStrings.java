// Ray Klump
// Illustrates using String and Random
import java.util.Random;

public class FunWithStrings {
    public static void main(String[] args) {
        System.out.println("This illustrates using String and Random classes.");
        String phrase = "It is a gloomy Monday, and the Bears suck.";
        int charCount = phrase.length();
        String chars16To30 = phrase.substring(16,30);
        System.out.printf("There are %d characters in the string, and this is the substring: %s.\n", charCount, chars16To30);
        String shouted = phrase.toUpperCase();
        System.out.println(shouted);
        Random randy = new Random();
        
    }
}