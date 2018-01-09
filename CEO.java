/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 92017403
 */
public class CEO extends Person implements IManager {
    
    private TimePeriods salaryFrequency;
    private double currentBonus;
    private final double baseSalary = 110000;
    private double bonusFund = 5000;
    private Date startedWorking;
    private ArrayList<ISubordinate> subordinateList;
    
    
    
    @Override
    public void setSalaryFrequency (TimePeriods salaryFrequency) {
        this.salaryFrequency = salaryFrequency;
    }
    
    @Override
    public TimePeriods getSalaryFrequency () {
        return salaryFrequency;
    }
    
    public void setCurrentBonus (double currentBonus) {
        this.currentBonus = currentBonus;
    }
    
    public double getCurrentBonus () {
        return currentBonus;
    }
    
    public double getBaseSalary () {
        return baseSalary;
    }
    
    public double getBonusFund () {
        return bonusFund;
    }
    
    @Override
    public void setStartedWorking (Date startedWorking) {
        this.startedWorking = startedWorking;
    }
    
    @Override
    public Date getStartedWorking () {
        return startedWorking;
    }
    
    @Override
     public ArrayList<ISubordinate> getSubordinateList(){
         return subordinateList;
     }
     
    @Override
     public double calculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception {
         return SalaryPaymentCalculator.calculatePay((ISalariedPerson) this);
      }
     

     public String assignBonus (ISubordinate subordinate, double bonus) {
         return BonusUpdater.assignBonus(this, subordinate, bonus);
     }

     public void applyBonus (double bonus) {
         bonusFund = bonusFund - bonus;
     }
}

