package chapter1;

public class PrintAppleWeight implements ApplePrint {

    @Override
    public String printApple(Apple apple) {
        if (apple.getWeight() > 150) {
            return "Apple is heavy " + apple.getWeight();
        } else {
            return "Apple is light " + apple.getWeight();
        }
    }
}
