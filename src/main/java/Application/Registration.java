package Application;

import java.io.IOException;

public class Registration {

    public void addUser(String n, String p, String vp) throws IOException {


        FileStorage fileStorage = new FileStorage();
        if (validation(p, vp)) {
            fileStorage.insert(new User(n, p, vp));
        }else{
            System.out.println("password not equals!");
        }
    }

    public boolean validation(String pass, String verifiedPass) {

        if(!(pass.length() >= 8)) {
            System.out.println("pass is too short!");
            return false;
        }else{
            return (pass.equals(verifiedPass));
        }
    }

}
