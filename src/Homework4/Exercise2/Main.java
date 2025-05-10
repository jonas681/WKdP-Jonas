package Homework4.Exercise2;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * Returns true if the two strings are anagrams of each other.
     */
    public static boolean isAnagram(String a, String b) {
        //int[] countStringA = countLetters(a); //überflüssig
        //int[] countStringB = countLetters(b);
        //Implementierung mit .toLowerCase eigentlich hier reinschieben(Liegt in der Main ist aber unpraktisch)
        if (Arrays.equals(countLetters(a), countLetters(b))) {
            return true;
        }else return false;
    }
    /**
     * Helper method to count how many times each letter (a-z) appears.
     */
    public static int[] countLetters(String s) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a'; //Mit ASCII-Werten arbeiten, a=97, b=98
            counts[index]++;

        }

        return counts;
    }

    /**
     * Print only letters that appear in the string with their counts.
     */
    public static void printLetterCounts(String s) {

        for (int i = 0; i < countLetters(s).length; i++) {
            if(countLetters(s)[i] != 0){
                char buchstabe = (char)(i+'a');
                System.out.println(buchstabe + ":" + countLetters(s)[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1;
        String string2;

        System.out.println("Enter String1: ");
        string1 = scanner.nextLine();
        string1.toLowerCase();
        string1.replaceAll("\\s+", "");

        System.out.println("Enter String2: ");
        string2 = scanner.nextLine();
        string2.toLowerCase();
        string2.replaceAll("\\s+", "");

        System.out.println("Are they anagrams? " + isAnagram(string1, string2));
        printLetterCounts(string1);



    }
}
