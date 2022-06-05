package org.dng;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<Integer,Contact> phoneBookMap = new HashMap<>();

    public boolean isNumberPresent(int phoneNumber){
        return phoneBookMap.containsKey(phoneNumber);
    }

    public void addNewRecord(int phoneNumber, Contact contact) throws Exception {
        if (phoneBookMap.containsKey(phoneNumber)){
            throw new Exception("This number is already present!");
        }
        phoneBookMap.put(phoneNumber, contact);
    }



}
