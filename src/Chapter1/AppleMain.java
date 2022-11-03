package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AppleMain {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple("green", 80),
                new Apple("green", 155),
                new Apple("red", 120)
        );
        List<Apple> filterApples = filterApples(inventory);
        System.out.println("filterApples = " + filterApples);

        List<Apple> filterHeavyApples = filterHeavyApples(inventory);
        System.out.println("filterHeavyApples = " + filterHeavyApples);

        List<Apple> filterApplesGreen = filterApples(inventory, Apple::isGreenApple);
        System.out.println("filterApplesGreen = " + filterApplesGreen);

        List<Apple> filterApplesWeight = filterApples(inventory, Apple::isHeavyApple);
        System.out.println("filterApplesWeight = " + filterApplesWeight);
    }

    public static List<Apple> filterApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }



    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}

