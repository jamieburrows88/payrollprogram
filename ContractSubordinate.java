/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author 92017403
 */
public class ContractSubordinate extends Person implements IContractor{
    
    
    private IManager manager;
    private double hourlyRate;
    
    public void setManager (IManager manager) {
        this.manager = manager;
    }
    
    public IManager getManager() {
        return manager;
    }
    
    public void setHourlyRate (double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    public double getHourlyRate () {
        return hourlyRate;
    }
    
    public ContractSubordinate(double hourlyRate, IManager manager){
        this.hourlyRate = hourlyRate;
        this.manager = manager;
    }
    
     @Override
     public double calculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception {
         double pay = 0.0;
         
         if (numberOfHours <= 160) {
             pay = numberOfHours * hourlyRate;
         }
         
         else if (numberOfHours > 160) {
             pay = (160 * hourlyRate) + ((numberOfHours - 160) * (hourlyRate * 1.1));
         }
         
         DecimalFormat df = new DecimalFormat("##.##");
         
         return Double.valueOf(df.format(pay));
         
        
     }
}
