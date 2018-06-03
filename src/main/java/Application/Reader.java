package Application;

import java.util.Scanner;

public class Reader {

    public String scanUserInput() {
        Scanner reader = new Scanner(System.in);
        return reader.nextLine();
    }
}