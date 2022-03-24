package com.contact.service;

import com.contact.entity.Contact;

import java.util.List;

public interface ContactService {


    void saveData(Contact contact);

    List<Contact> fetchUser(Long userId);
}
