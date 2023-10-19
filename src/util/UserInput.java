package util;

import java.util.Scanner;

public class UserInput {
    public static Scanner scanner = new Scanner(System.in);

    public static int userInput(int menuSize) {
        int userInput = -1;
        while (userInput == -1) {
            try {
                userInput = scanner.nextInt();
                if (isInvalidInput(userInput, menuSize)) {
                    userInput = -1;
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException exception) {
                MyPrint.println("잘못된 입력입니다. 메뉴에 존재하는 숫자를 입력하세요.", PrintColor.RED);
                System.out.print("번호를 입력해주세요. ");
            }
        }
        return userInput - 1; // 메뉴가 1부터 시작해서 1 줄임
    }

    private static boolean isInvalidInput(int input, int menuSize) {
        if (input < 0 || input > menuSize) {
            return true;
        }
        return false;
    }
}
