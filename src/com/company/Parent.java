package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parent extends BasePerson {

    private List<Child> children;

    public Parent(String name, int age, Child... children) throws Exception {
        super(name, age);
        this.setUserType(UserType.ADULT);
        if (children != null) {
            this.children = Arrays.asList(children);
        } else {
            this.children = new ArrayList<>();
        }
    }

    @Override
    public boolean canHaveFriends() {
        return true;
    }

    public List<Child> getChildren() {
        return children;
    }

    public boolean removeChild(Child child) {
        if (this.children != null && this.children.size() > 0) {
            return this.children.remove(child);
        }
        return false;
    }

    @Override
    public boolean addFriend(BasePerson person) {
        if (person.getAge() < 16) {
            this.friends.add(person);
            return true;
        }
        return false;
    }

}
