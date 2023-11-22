package com.example.soap;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Soap {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer soapId;
	
    public Integer getSoapId() {
		return soapId;
	}
    
	public void setSoapId(Integer soapId) {
		this.soapId = soapId;
	}
	
	public String getSoapName() {
		return soapName;
	}
	
	public void setSoapName(String soapName) {
		this.soapName = soapName;
	}
	
	private String soapName;
	
	

}
