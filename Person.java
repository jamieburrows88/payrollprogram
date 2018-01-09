/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 92017403
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String position;
    private Date dateOfBirth;
    private Date startedWorking;
    private TimePeriods salaryFrequency;
    private IManager manager;    
    
    public void setFirstName (String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    
    public String getLastName () {
        return lastName;
    }
    
    public void setPosition (String position) {
        this.position = position;
    }
    
    public String getPosition () {
        return position;
    }
    
    public void setDateOfBirth (Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public Date getDateOfBirth () {
        return dateOfBirth;
    }
    
    public void setStartedWorking (Date startedWorking) {
        this.startedWorking = startedWorking;
    }
    
    public Date getStartedWorking () {
        return startedWorking;
    }
    
    public void setSalaryFrequency (TimePeriods salaryFrequency) {
        this.salaryFrequency = salaryFrequency;
    }
    
    public TimePeriods getSalaryFrequency() {
        return salaryFrequency;
    }
    
    public void setManager (IManager manager) {
        this.manager = manager;
    }
    
    public IManager getManager () {
        return manager;
    }
    
    public String printFirstLastName () {
        return getFirstName() + "" + getLastName();
    }
    
}
