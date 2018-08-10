package Samples;

import java.util.regex.Pattern;

/**
 * Created by expertzlab12 on 7/19/18.
 */
public class RegexEx {
    public static void main(String[] args) {
        boolean b= Pattern.matches("..s","ass");
        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","axx099"));
        System.out.println(Pattern.matches("[\\d]*","12334567"));
        System.out.println(Pattern.matches("[\\da-z@#$%^]*[@][a-z]{5}[.][com]{3}","sreekuttybabu0304@gmail.com"));
        System.out.println(Pattern.matches("[0-9]{2}[:/.][0-9]{2}[:/.][0-9]{4}","03/04/1998"));
    }
}