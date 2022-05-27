package org.launchcode.spaday;

import org.launchcode.spaday.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Micah Young
 */
public class UserData {
    private static ArrayList<User> users = new ArrayList<>();

    public static void add(User user) {
        users.add(user);
    }

    public static List<User> getAll() {
        return users;
    }

    public static User getById(int id){
        User user1 = null;
        for(User user : users) {
            if (id == user.getId()) {
                user1 = user;
            } else {
                return null;
            }
        }
        return user1;
    }
}
