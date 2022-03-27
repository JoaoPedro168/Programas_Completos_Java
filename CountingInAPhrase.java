import java.util.*;

//This program has two functions 
//one counts the ocurrence of words in a text
//the other counts the ocurrence of each letter 

public class CountingInAPhrase {
    public static void main(String[] args) {
        CountingInAPhrase.ocurrencesOfLetters();
    }

    public static void ocurrencesOfWord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence");
        String phrase = scan.nextLine();
        phrase.trim().toLowerCase();
        String[] chars = phrase.split("[ \n\t\r.,;:!?(){]");

        SortedMap<String, Integer> characters = new TreeMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!characters.containsKey(chars[i])) {
                characters.put(chars[i], 1);
            } else if (characters.containsKey(chars[i])) {
                int value = characters.get(chars[i]);
                value++;
                characters.replace(chars[i], value);
            }
        }
        System.out.println(characters.toString());
        scan.close();
    }

    public static void ocurrencesOfLetters() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a sentence");
        String phrase = scan.nextLine();
        String[] chars = phrase.toLowerCase()
                .replaceAll("[\\W\\d]", "")
                .split("");
        SortedMap<String, Integer> characters = new TreeMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!characters.containsKey(chars[i])) {
                characters.put(chars[i], 1);
            } else if (characters.containsKey(chars[i])) {
                int value = characters.get(chars[i]);
                value++;
                characters.replace(chars[i], value);
            }
        }
        System.out.println(characters.toString());
        scan.close();
    }
}
