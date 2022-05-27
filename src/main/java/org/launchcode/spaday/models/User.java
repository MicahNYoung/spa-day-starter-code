package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by Micah Young
 */
public class User {
    @NotBlank(message = "Username is required.")
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters long.")
    private String username;

    @Size(min = 6, message = "Password must be at least 6 characters")
    @NotBlank(message = "Password required")
    private String password1;

    private String password2;
    @Email
    private String email;

    private int id;
    private int nextId = 1;
//    public User(){
//        return null
//    }
//

    public User(String username, String password1, String password2, String email) {
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
        this.email = email;
        this.id = nextId;
        nextId++;
    }

    public User(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }
}
