package com.contact.controller;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/user/{userId}")
    public Contact saveUser(@RequestBody Contact contact, @PathVariable("userId") Long userId){
        contactService.saveData(contact);
        return contact;
    }

    @GetMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId) {

        return contactService.fetchUser(userId);
    }

}
