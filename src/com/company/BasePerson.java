package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePerson {

    private String id;
    protected List<BasePerson> friends;
    private UserType userType;
    private int age;

    private String name;
    private String image;
    private String status;

    public BasePerson(String name, int age) throws Exception {
        this.name = name;
        this.setAge(age);
        this.friends = new ArrayList<BasePerson>();
    }

    public abstract boolean canHaveFriends();

    public boolean hasFriend(BasePerson person){
        return this.friends.contains(person);
    }

    public abstract boolean addFriend(BasePerson person);

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getId() {
        return this.id;
    }

    public List<BasePerson> getFriends() {
        return this.friends;
    }

    public int getAge() {
        return age;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAge(int age) throws Exception {
        this.age = age;
    }

    public UserType getUserType() {
        return this.userType;
    }

    @Override
    public String toString() {
        return String.format("%s \n%s %d \n%s %s\n", "Name: "+name, "Age: ", age, "Status: ", this.status != null ? this.status : "N/A");
    }
}