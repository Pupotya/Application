package Application;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileStorage {

    public void insert(User user) throws IOException {
        Gson gson = new Gson();
        String vv = gson.toJson(user);
        BufferedWriter output = null;
        try {
            File file = new File("user.json");
            output = new BufferedWriter(new FileWriter(file));
            output.append(vv);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Registration successful");
            output.close();
        }

    }
}
