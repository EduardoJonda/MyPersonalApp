package tecsup.teoria04.eduardo.jonda.com.mypersonalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static List<User> users = new ArrayList<>();

    static{  //id, username, passward, nombre
        users.add(new User(100, "user01", "1234", "Anonymoues 01"));
        users.add(new User(200, "user02", "1234", "Anonymoues 02"));
        users.add(new User(300, "user03", "1234", "Anonymoues 03"));
    }

    public static User login(String username, String password){
        for (User user : users){
            if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public static User getUser(String username){
        for (User user : users){
            if(user.getUsername().equalsIgnoreCase(username)){
                return user;
            }
        }
        return null;
    }

    public static User Registro(String username, String password, String nombre){
        int i =1;
        users.add(new User(i, username, password, nombre ));
        i++;
        return null;
    }


}
