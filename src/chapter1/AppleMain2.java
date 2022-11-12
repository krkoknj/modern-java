package chapter1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleMain2 {


    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple("GREEN", 80),
                new Apple("GREEN", 155),
                new Apple("RED", 120)
        );

//        List<Apple> apples = filterGreenApple(inventory, new AppleGreenColorPredicate());
        List<Apple> apples = filterGreenApple(inventory, new AppleHeavyWeightPredicate());
        System.out.println("apples = " + apples);

        prettyPrintApple(inventory, new PrintAppleColor());
        prettyPrintApple(inventory, new PrintAppleWeight());
    }

    private static List<Apple> filterGreenApple(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    private static void prettyPrintApple(List<Apple> inventory, ApplePrint applePrint) {
        for (Apple apple : inventory) {
            String output = applePrint.printApple(apple);
            System.out.println(output);
        }
    }

}

