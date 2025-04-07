package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Title");
        String title = scan.nextLine();
        String val = "--title=" + title;
        Application.launch(UserTitle.class, val);
    }

}
