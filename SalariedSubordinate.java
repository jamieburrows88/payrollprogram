/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.util.Date;

/**
 *
 * @author 92017403
 */
public class SalariedSubordinate extends Person implements ISalariedPerson {
    
    
    private Date startedWorking;
    IManager manager;
    private TimePeriods timePeriod;
    private double baseSalary;
    private double currentBonus;
    
    
    
    @Override
    public TimePeriods getTimePeriod(){
        return timePeriod;
    }
    
    @Override
    public void setTimePeriod(TimePeriods timePeriod){
        this.timePeriod = timePeriod;
    }
    
    
    @Override
    public void setCurrentBonus(double currentBonus){
        this.currentBonus = currentBonus;
    }
    
    @Override
    public double getCurrentBonus(){
        return currentBonus;
     }
    
    public SalariedSubordinate(double baseSalary, IManager manager){
        this.baseSalary = baseSalary;
        this.manager = manager;
    }
    
    
    @Override
     public double calculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception {
         return SalaryPaymentCalculator.calculatePay(this);
     }


    @Override
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * @return the startedWorking
     */
    @Override
    public Date getStartedWorking() {
        return startedWorking;
    }

    /**
     * @param startedWorking the startedWorking to set
     */
    @Override
    public void setStartedWorking(Date startedWorking) {
        this.startedWorking = startedWorking;
    }
}
