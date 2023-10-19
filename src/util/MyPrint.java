package util;

public class MyPrint {

    public static void println(String text, PrintColor color) {
        System.out.println(color.getColor() + text + PrintColor.RESET.getColor());
    }

    public static void print(String text, PrintColor color) {
        System.out.print(color.getColor() + text + PrintColor.RESET.getColor());
    }

    public static void printf(String text, PrintColor color) {
        System.out.printf(color.getColor() + text + PrintColor.RESET.getColor());
    }
}
