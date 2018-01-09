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
public class Manager extends SalariedSubordinate implements IManager{
    
    private ArrayList<ISubordinate> subordinateList;
    private double bonusFund = 5000;
    
    public Manager (double baseSalary, IManager manager, ArrayList<ISubordinate> subordinateList){
        super(baseSalary, manager);
        this.subordinateList = subordinateList;
    }
    
    
    public Manager (double baseSalary, IManager manager) {
        this(baseSalary, manager, new ArrayList<ISubordinate>());
    }
    
    
    @Override
     public ArrayList<ISubordinate> getSubordinateList(){
         return subordinateList;
     }
     
     
     public double getBonusFund () {
         return bonusFund;
     }
     
     
     @Override
     public double calculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception {
          return SalaryPaymentCalculator.calculatePay(this);
      }
     
     
     public String assignBonus(ISubordinate subordinate, double bonus) {
         return BonusUpdater.assignBonus(this, subordinate, bonus);
     }
     
     
     public void applyBonus (double bonus) {
         bonusFund = bonusFund - bonus;
     }
}
