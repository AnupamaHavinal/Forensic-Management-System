package net.javaguides.springboot.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="lab")
public class Lab {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lab_id")
    private int id;
	
    @Column(name = "address", nullable = false)
    private String address;
    

    @Column(name = "specialist")
    private String specialist;

    
    @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="lab")
    private List<Evidence> evidence=new ArrayList<>();
    
   

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getSpecialist() {
		return specialist;
	}


	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}


	public List<Evidence> getEvidence() {
		return evidence;
	}


	public void setEvidence(List<Evidence> evidence) {
		this.evidence = evidence;
	}
    
    
    
    
    
}
