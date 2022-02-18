package com.arrays;

import java.util.ArrayList;

public class MobilePhone{
    private String myNumber;
    private ArrayList<Contact> myContacts;
    public MobilePhone(String num) {
        this.myNumber = num;
        this.myContacts = new ArrayList<Contact>();
    }
    public boolean addNewContact(Contact name){
        if(findContact(name.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(name);
        return true;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String name){
        for(int i =0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName()+", was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName()+", was replaced with "+newContact.getName());
        return true;
    }
}