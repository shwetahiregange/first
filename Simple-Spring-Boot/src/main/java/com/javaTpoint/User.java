package com.javaTpoint;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  
public class User {  
	@Id
	public int id;
    public String name;  
    public User(){}  
    
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }

}  