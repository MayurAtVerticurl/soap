package com.example.soap;

import com.example.soap.Soap;
import com.example.soap.SoapRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class SoapService {

	private SoapRepository repository;
	
	public SoapService(SoapRepository repository) {
		this.repository = repository;
	}
	
	public Soap create(Soap soap) {
		return repository.save(soap);
	}
	
	public Optional<Soap> get(Integer soapId) {
		Optional<Soap> optionalSoap = repository.findById(soapId);
		return optionalSoap;
	}
	
    public List<Soap> getAll() {
        List<Soap> soaps = null;
        // try {
            soaps = repository.findAll();
        /* } catch (Exception e) {
            System.out.println("STackTrace: " + Arrays.toString(e.getStackTrace()));
            System.out.println("Caught an Exception....");
            soaps = new ArrayList<>();
        } */
        return soaps;
    }
    
    public Soap update(Integer soapId, Soap soap) {
        if (soapId != soap.getSoapId()) {
           // throw new SoapValidationException("Mismatch in SoapId");
        }
        Optional<Soap> soapOptional = repository.findById(soapId);
        if (soapOptional.isPresent()) {
            return repository.save(soap);
        }
        else {
           //throw new SoapNotFoundException("Soap Not found: " + soapId);
        	return null;
        }
    }
	
}
