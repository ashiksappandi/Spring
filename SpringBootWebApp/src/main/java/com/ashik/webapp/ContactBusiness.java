package com.ashik.webapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by narayaa on 03-06-2019.
 */
public class ContactBusiness {
    public List<Contact> getContactList(){
        List<Contact> listContact = new ArrayList<>();
        listContact.add(new Contact("Hilton", "hilton@gmail.com", "Bangalore"));
        listContact.add(new Contact("Bilton", "bilton@gmail.com", "Vegas"));
        listContact.add(new Contact("Milton", "milton@gmail.com", "London"));
        listContact.add(new Contact("Tilton", "tilton@gmail.com", "Spain"));
        return listContact;
    }
}
