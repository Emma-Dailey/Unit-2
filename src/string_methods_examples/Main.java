package string_methods_examples;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //String with constructor vs string literal
        String myFirstName = new String("Arcturus");
        String myLastName = "Dailey";
        String anotherFirstName = new String("Arcturus");
        String anotherLastName = "Dailey";

        System.out.println(myFirstName == anotherFirstName);
        System.out.println(myLastName == anotherLastName);

        //to compare two objects, use .equals not ==. == is only for primitives
        System.out.println(myFirstName.equals(anotherFirstName));

        //String length
        System.out.println(myFirstName.length());

        //substring method
        //first 4 chars of my name. These are at
        //indices 0, 1, 2, 3 - notice we had to use 4 below
        System.out.println(myFirstName.substring(0, 4));

        //Get "urus"
        System.out.println(myFirstName.substring(4, 8));
        System.out.println(myFirstName.substring(4, myFirstName.length()));

        //indexOf - finds location of first occurence of char
        System.out.println(myFirstName.indexOf("u"));
        System.out.println(myFirstName.indexOf("ctu"));

        //compareTo
        System.out.println(myFirstName.compareTo(anotherFirstName));
        System.out.println("a".compareTo("h"));
        System.out.println("b".compareTo("a"));
        //capitals are different
        System.out.println("a".compareTo("H"));
        System.out.println((int)'a');
        System.out.println((int)'h');

        //equals method

        //compareTo

    }
}
