package com.harry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by patharh on 12-11-2016.
 */
@RequestMapping("/persons")
@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("")
    public List<Person> personList() {
        return personRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Person getById(@PathVariable Integer id) {
        return personRepository.findOne(id);
    }
}
