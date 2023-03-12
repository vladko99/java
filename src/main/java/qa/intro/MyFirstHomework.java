package qa.intro;

import java.util.Scanner;

public class MyFirstHomework {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userName = scanner.nextLine();
        System.out.println("Nice to meet you," + userName + "!");
        System.out.println("What is your favourite hobby? :");
        String userHobby = scanner.nextLine();
        System.out.println("My favourite hobby is:" + userHobby + "!");

        }
}
