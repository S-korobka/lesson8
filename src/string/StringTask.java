package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringTask {
    public static void main(String[] args) {
        String s = "Hey how are you";
        System.out.println("print the length of the string - " + s.length());
        //print the length of the string

        System.out.println("print the last char of the string - "+(s.charAt(s.length() - 1)));
        //print the last char of the string (use the previous method to calculate the index - do not use hardcoded indexes)

        System.out.println("print the index of 'a' - " + s.indexOf('a'));
        //print the index of 'a' (але виводить индекс лише першої а )

        System.out.println("substirng the string by the second space -  " + s.substring(0,s.indexOf(" ",s.indexOf(" ")+1)));
        //substirng the string by the second space " " - result should be "Hey how"

        System.out.println("check if the string start with 'h' - " + s.startsWith("h"));
        System.out.println("check if the string start with 'H' - " + s.startsWith("H"));
        System.out.println("check if the string end with '\\' - " +s.endsWith("\\"));
        //check if the string start with 'h', with 'H', end with '\'

        System.out.println("check if the string contains \"are you\" - " +s.contains("are you"));
        System.out.println("check if the string contains \"are you \" - " +s.contains("are you "));
        //check if the string contains "are you" contains "are you "

        System.out.println("replace \"how\" to \"who\" - " +s.replace("how", "who"));
        //replace "how" to "who"

        String[] split = s.split("\\s+");
        System.out.println("split the string via space \" \" and print each word from the new line: - [" + Arrays.stream(split).collect(Collectors.joining("]\n[")) + "]");
        //split the string via space " " and print each word from the new line

        System.out.println("create the method that takes String and char parameters and return the quantity of letters that exist in that string - "+getCharQuantityInTheString(s, 'o' ));
        //create the method that takes String and char parameters and return the quantity of letters that exist in that string

        greeting("sehii",33);
        //create the greeting method that takes name and age and print the string - "Hey, my name is Andrii, and I'm 41 years old"
        // (Use String.format function)
    }

    public static int getCharQuantityInTheString(String s, char c) {
        int len = s.length();
        int newlen = s.replaceAll(String.valueOf(c), "").length();
        return len - newlen;
    }

    public static void greeting(String name, int age) {
        String g = String.format("Hey, my name is %s, and I'm %d years old", name, age);
        System.out.println(g);
    }
}
