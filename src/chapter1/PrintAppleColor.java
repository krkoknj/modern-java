package chapter1;

public class PrintAppleColor implements ApplePrint {

    @Override
    public String printApple(Apple apple) {
        return apple.getColor() + ",";
    }
}
