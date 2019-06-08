package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Main {

    public static void yell(String words) {
        Objects.requireNonNull(words, () -> "Created issue" + Main.createIssue());
    System.out.printf("%s!!!!!! %n", words.toUpperCase());
}

    private static String createIssue() {
        System.out.println("Some external API call to a bug tracker");
        return "#ABC123";
    }

    public static void main(String[] args) {



	    List<String> ingredients = Arrays.asList(
	            "flour",
                "salt",
                "baking powder",
                "butter",
                "eggs",
                "milk"
        );

	    // Imperative style
//	    for (String ingredient : ingredients) {
//            System.out.println(ingredient);
//        }


        // Declarative style
        Main.yell("But I want that cupcake");

        Consumer<String> printer = System.out::println;
//        ingredients.forEach(System.out::println);
        ingredients.forEach(Main::yell);

        Main.yell(null);

    }
}
