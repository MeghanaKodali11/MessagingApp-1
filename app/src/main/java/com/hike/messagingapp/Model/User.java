package com.hike.messagingapp.Model;

public class User {
    private String id;
    private String username;
    private String imageURL;
    private String isGoogleSignUp;
    private String Phone;


    public User(String id, String username, String imageURL, String isGoogleSignUp){
        this.id = id;
        this.username = username;
        this.imageURL = imageURL;
        this.isGoogleSignUp = isGoogleSignUp;
        this.Phone = isGoogleSignUp;
    }

    public User()
    {

    }

    public String getPhoneNumber() {
        return isGoogleSignUp;
    }

    public void setPhoneNumber(String phone) {
        this.isGoogleSignUp = isGoogleSignUp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getIsGoogleSignUp() {
        return isGoogleSignUp;
    }

    public void setIsGoogleSignUp(String isGoogleSignUp) {
        this.isGoogleSignUp = isGoogleSignUp;
    }
}