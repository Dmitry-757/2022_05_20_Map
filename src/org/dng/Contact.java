package org.dng;

import java.util.HashSet;

public class Contact {
    private HashSet<Integer> phoneSet = new HashSet<>();
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public void addNewNumber(String contactName, int phoneNumber) throws Exception {

        if (Main.phoneBook.isNumberPresent(phoneNumber)){
            throw new Exception("This number is already present!");
        }

        if (phoneSet.contains(phoneNumber)){
            throw new Exception("This contact is already present!");
        }
        phoneSet.add(phoneNumber);
        Main.phoneBook.addNewRecord(phoneNumber, this);
    }
}
