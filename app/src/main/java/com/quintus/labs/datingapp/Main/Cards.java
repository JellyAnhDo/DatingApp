package com.quintus.labs.datingapp.Main;


/**
 * DatingApp
 * https://github.com/quintuslabs/DatingApp
 * Created on 25-sept-2018.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */

public class Cards {
    private String userId;
    private String name, profileImageUrl, bio, interest;
    private int age;
    private int distance;
    private String status;
    private String company;
    private String school;
    private String job;
    private boolean movie;
    private boolean fishing;
    private boolean travel;
    private boolean sport;
    private boolean music;

    public Cards(String userId, String name, int age, String profileImageUrl, String status, String company, String school, String job, boolean movie, boolean fishing, boolean travel, boolean sport, boolean music) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.profileImageUrl = profileImageUrl;
        this.bio = bio;
        this.status = status;
        this.company = company;
        this.school = school;
        this.job = job;
        this.movie = movie;
        this.fishing = fishing;
        this.music = music;
        this.travel = travel;
        this.sport = sport;
    }

    public Cards(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public int getDistance() {
        return distance;
    }

    public String getBio() {
        return bio;
    }

    public String getInterest() {
        return interest;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
