package ee.taltech.calculator.theory.a_theory2.question2contribution;

import ee.taltech.calculator.theory.a_theory2.question2contribution.classes.Cake;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class API2_Cakes {

    // todo this is contribution question
    //  this assignment is only for one team member (if this code is not committed by that team member how do I know this code was theirs?)

    // todo
    //  this assignment consists of 2 parts
    //  practical assignment A, B, C, D, E
    //          All classes are available in classes package
    //          If you want to test these practical assignments add these to your project.
    //          Example: If you Application.java is in the package ee.taltech, make sure theory is in package ee.taltech as well (ee.taltech.theory)
    //  theoretical assignment F, G, H

    //todo practical assignment
    // Management wants to define an API endpoint so frontend can display data about cakes (think cake e-shop)
    // A Add necessary annotations to this class so this class can serve data

    //todo B Add a method to query all the cakes (method content is not important - I am grading urls, annotations, names, and parameters)

    @GetMapping(value = "/cakes")
    public List<Cake> allCakes() {
        List<Cake> cakes = new ArrayList<>();
        return cakes;
    }

    //todo C Add a method to query a single cake by it's unique identifier (method content is not important - I am grading urls, annotations, names, and parameters)

    @GetMapping(value = "/cakes")
    public List<Cake> getCake(@RequestParam Long id, @RequestParam Optional<String> weight, @RequestParam Optional<String> name) {
        List<Cake> queryCakes = new ArrayList<>();
        for (Cake cake : allCakes()) {
            Long queryId = cake.getId();
            Optional<String> queryWeight = Optional.ofNullable(cake.getWeight());
            Optional<String> queryName = Optional.ofNullable(cake.getName());
            if (weight == queryWeight)
                queryCakes.add(cake);
            else if (name == queryName)
                queryCakes.add(cake);
            else if (id == queryId)
                queryCakes.add(cake);
        }
        return queryCakes;
    }


    //todo D Modify an existing method to query/filter cakes by weight while keeping existing functionality

    //todo E Modify an existing method to query/filter cakes by name while keeping existing functionality


    //todo theoretical assignment
    //
    //  F write pseudocode for saving a new cake (add annotations or http method names, urls, necessary parameters)
    //  @PutMapping /newCake?input=
    //  @Pathvariable
    //  create cake
    //  set cake.id = input.id
    //  set cake.sweetness = input.sweetness
    //  set cake.size = input.size
    //  set cake.weight = input.weight
    //  set cake.rating = input.rating
    //  return cake

    // G write pseudocode for updating existing cake (add annotations or http method names, urls, necessary parameters)
    //  @PutMapping updateCake/{id}?input=
    //  @RequestParam(value="id")Long , @PathVariable List param
    //  List result = param.stream()
    //  if stream includes id
    //      get cake by id
    //      setSweetness("10")
    //      return cake
    //  else
    //      return cake not found

    //  H write pseudocode for deleting a cake (add annotations or http method names, urls, necessary parameters)
    //  @DeleteMapping /deleteCake/{id}
    //  @RequestParam id
    //  for cake in cakes
    //      if cake.id == id
    //      delete cake
    //  else
    //      return cake not found

}
