package Application;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifiedPassword() {
        return verifiedPassword;
    }

    public void setVerifiedPassword(String verifiedPassword) {
        this.verifiedPassword = verifiedPassword;
    }

    private String password;
    private String verifiedPassword;

    public User(String name,String password,String verifiedPassword) {
        this.name = name;
        this.password = password;
        this.verifiedPassword = verifiedPassword;
    }





}
