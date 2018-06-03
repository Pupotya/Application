package Application;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        Reader reader = new Reader();
        Registration registration = new Registration();
        System.out.println("Type your name");
        String name = reader.scanUserInput();
        System.out.println("Type Password");
        String pass = reader.scanUserInput();
        System.out.println("Verify Your Pass");
        String verifiedPass = reader.scanUserInput();
        registration.addUser(name,pass,verifiedPass);
    }
}
