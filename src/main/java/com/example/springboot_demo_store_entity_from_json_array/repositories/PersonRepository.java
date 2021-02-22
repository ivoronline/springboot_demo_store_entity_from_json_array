package com.example.springboot_demo_store_entity_from_json_array.repositories;

import com.example.springboot_demo_store_entity_from_json_array.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }
