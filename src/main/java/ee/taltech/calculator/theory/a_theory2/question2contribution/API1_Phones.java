package ee.taltech.calculator.theory.a_theory2.question2contribution;

import ee.taltech.calculator.theory.a_theory2.question2contribution.classes.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("phone")
public class API1_Phones {

    // todo this is contribution question
    //  this assignment is only for one team member (if this code is not committed by that team member how do I know this code was theirs?)

    // todo
    //  this assignment consists of 2 parts
    //  practical assignment A, B, C, D, E
    //     * All classes are available in classes package
    //     * If you want to test these practical assignments add these to your project.
    //       Example: If you Application.java is in the package ee.taltech, make sure theory is in package ee.taltech as well (ee.taltech.theory)
    //  theoretical assignment F, G, H

    //todo practical assignment
    // Management wants to define an API endpoint so frontend can display data about phones (think phone e-shop)
    // A Add necessary annotations to this class so this class can serve data
    // Added @Service to this class.
    @Autowired

    //todo B Add a method to query all the phones (method content is not important - I am grading urls, annotations, names, and parameters)

    @GetMapping(value = "/phones")
    public List<Phone> getAllPhones(@RequestParam Optional<String> manufacturer,@RequestParam Optional<String> year) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone());
        phones.add(new Phone());

        if (manufacturer.isPresent())
            return phones
                    .stream()
                    .filter(phone -> phone.getManufacturer().equals(manufacturer))
                    .collect(Collectors.toList());
        else if (year.isPresent())
            return phones
                    .stream()
                    .filter(phone -> phone.getReleaseYear().equals(year))
                    .collect(Collectors.toList());
        return phones;
    }
    //todo C Add a method to query a single phone by it's unique identifier (method content is not important - I am grading urls, annotations, names, and parameters)

    @GetMapping(value = "/phones/{id}")
    public List<Phone> getPhone(@PathVariable Long id) {

        return getAllPhones(null,null)
                .stream()
                .filter(phone -> phone.getId().equals(id))
                .collect(Collectors.toList());
    }


    //todo D Modify an existing method to query/filter phones by manufacturer while keeping existing functionality
    //todo E Modify an existing method to query/filter phones by release year while keeping existing functionality

    //todo theoretical assignment
    //todo F write pseudocode for saving a new phone (add annotations or http method names, urls, necessary parameters)
    //  *
    // @RestController
    // @PostMapping ("/newPhone")
    // @Pathvariable List input
    // create new phone
    // set id to phone
    // set input.manufacturer to phone
    // set input.modelNr to phone
    // set input.rating to phone
    // set input.releaseYear to phone
    // return new phone

    //todo G write pseudocode for updating existing phone (add annotations or http method names, urls, necessary parameters)
    //  *
    //  @PutMapping("/phones/{id}")
    //  @RequestParam id
    //  @PathVariable List input
    //  List result = input stream
    //  if stream contains id
    //      get phone by id
    //      if manufacturer in stream
    //          get phones manufacturer
    //          set (change) manufacturer
    //      return phone
    //  else return phone not found


    //todo H write pseudocode for deleting a phone (add annotations or http method names, urls, necessary parameters)
    //  *
    //  @DeleteMapping(value = ("/phones/{id}")
    //  @RequestParam id
    //  if phone by id
    //      delete
    //  else return phone not found

}
