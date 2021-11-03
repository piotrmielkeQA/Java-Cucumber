package org.example;

public class Logowanie {

    private String currentUsername;
    private String currentPassword;
    private String msg;
    private boolean isLoggedIn;

    public void setUserInDatabase(String username, String password) {
        this.currentUsername = username;
        this.currentPassword = password;
    }

    public void logIn(String username, String password) {
        if (username.equals(currentUsername) && password.equals(currentPassword)) {
            this.msg = "Udało Ci się zalogować";
            this.isLoggedIn = true;
        } else {
            this.msg = "Nie udało Ci się zalogować";
            this.isLoggedIn = false;
        }
    }

    public String getMsg() {
        return msg;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public String getCurrentUsername() {
        return currentUsername;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }
}
