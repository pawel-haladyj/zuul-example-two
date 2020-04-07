package pl.haladyj.ingnoredservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;

@RestController
@RequestMapping("/cont")
public class IgnoredController {

    @GetMapping("/name/{name}")
    public String getIgnored(@PathVariable String name){
        return name+" you are ignored";
    }
}
