package com.example.demojavaspring.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
    
    @GetMapping("v1/person")
    public Person_v1 personV1() {
        return new Person_v1("Bob Charlie");
    }

    @GetMapping("v2/person")
    public Person_v2 personV2() {
        return new Person_v2(new Name("Charlie", "Bob"));
    }

    @GetMapping(value = "/person/param", params = "version=1")
    public Person_v1 paramV1() {
        return new Person_v1("Bob Charlie");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public Person_v2 paramV2() {
        return new Person_v2(new Name("Charlie", "Bob"));
    }


}
