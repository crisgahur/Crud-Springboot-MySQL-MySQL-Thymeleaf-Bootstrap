package com.newAgenda.web.controller;

import com.newAgenda.web.Entity.Person;
import com.newAgenda.web.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author usuario
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping({"/people", "/"})
    public String listPoeple(Model model) {
        model.addAttribute("people", service.listAllPeople());
        return "people";
    }

    @GetMapping("/people/new")
    public String displayPersonRegistrationForm(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "create_person";
    }

    @PostMapping("/people")
    public String savePerson(@ModelAttribute("person") Person person) {
        service.savePerson(person);
        return "redirect:/people";
    }

    @GetMapping("/people/edit/{id}")
    public String displayEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("person", service.getPersonById(id));
        return "edit_person";
    }

    @PostMapping("/people/{id}")
    public String updatePerson(@PathVariable Long id, @ModelAttribute("person") Person person, Model model) {
        Person existsPerson = service.getPersonById(id);
        existsPerson.setId(id);
        existsPerson.setName(person.getName());
        existsPerson.setEmail(person.getEmail());
        existsPerson.setBorndate(person.getBorndate());
        existsPerson.setNumber(person.getNumber());

        service.updatePerson(existsPerson);

        return "redirect:/people";
    }

    @GetMapping("/people/{id}")
    public String deletePerson(@PathVariable Long id) {
        service.deletePerson(id);
        return "redirect:/people";
    }
}


