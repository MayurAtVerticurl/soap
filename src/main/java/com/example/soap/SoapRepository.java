package com.example.soap;

import com.example.soap.Soap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoapRepository extends JpaRepository<Soap, Integer>{

}
