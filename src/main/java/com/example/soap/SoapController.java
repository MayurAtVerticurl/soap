package com.example.soap;

import com.example.soap.Soap;
import com.example.soap.SoapService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/soap")
@RestController
public class SoapController {
	
    private SoapService service;

    public SoapController(SoapService service) {
        this.service = service;
    }
    
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Soap> getSoap(@PathVariable("id") Integer soapId) {
        return service.get(soapId);
    }
    
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Soap updateSoap(@PathVariable("id") Integer soapId, @RequestBody Soap soap) {
        return service.update(soapId, soap);
    }
    
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Soap> getAll() {
        return service.getAll();
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Soap createSoap(@RequestBody Soap soap) {
        Soap createdSoap = service.create(soap);
        return createdSoap;
    }
    

}
