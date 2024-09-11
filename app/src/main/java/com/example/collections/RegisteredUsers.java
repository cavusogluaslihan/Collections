package com.example.collections;

public class RegisteredUsers {
    private String userName;
    private int userId;
    private String countryOfTheUser;
    private int ageOfTheUser;

    public RegisteredUsers() {
    }

    public RegisteredUsers(String userName, int userId, String countryOfTheUser, int ageOfTheUser) {
        this.userName = userName;
        this.userId = userId;
        this.countryOfTheUser = countryOfTheUser;
        this.ageOfTheUser = ageOfTheUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCountryOfTheUser() {
        return countryOfTheUser;
    }

    public void setCountryOfTheUser(String countryOfTheUser) {
        this.countryOfTheUser = countryOfTheUser;
    }

    public int getAgeOfTheUser() {
        return ageOfTheUser;
    }

    public void setAgeOfTheUser(int ageOfTheUser) {
        this.ageOfTheUser = ageOfTheUser;
    }
}
