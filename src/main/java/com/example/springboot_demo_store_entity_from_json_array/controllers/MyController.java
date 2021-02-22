package com.example.springboot_demo_store_entity_from_json_array.controllers;

import com.example.springboot_demo_store_entity_from_json_array.entities.Person;
import com.example.springboot_demo_store_entity_from_json_array.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

  @Autowired PersonRepository personRepository;

  @ResponseBody
  @RequestMapping("/AddPersons")
  public String addPersons(@RequestBody List<Person> persons) {

    //STORE PERSON ENTITY
    personRepository.saveAll(persons);

    //RETURN SOMETHING TO BROWSER
    return "Persons added to DB";

  }

}


