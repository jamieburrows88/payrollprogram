/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author 92017403
 */
public class SalaryPaymentCalculator {

    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static final int MONTHS_IN_YEAR = 12;
    static final int FORTNIGHTS_IN_YEAR = 26;
    DecimalFormat df = new DecimalFormat("##.##");
    static double salaryWithIncrease;
    
    public static long yearsBetween(Date date1, Date date2){
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        long difference =  ((date1.getTime()-date2.getTime())/86400000) * 365;
        difference = Integer.parseInt(formatter.format(difference));
        return Math.abs(difference);
    }
    
    public static double calculateCurrentSalaryWithIncrease(double baseSalary, Date startedWorking){
        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = new Date(01, 01, 2015);
        Integer.parseInt(formatter.format(date1));
        long yearsWorking = yearsBetween( date1, startedWorking);
        
        if (yearsWorking < 2){
            return baseSalary;
    }
        else if (yearsWorking >= 2){
            salaryWithIncrease = ((yearsWorking / 2) * 0.1) * baseSalary;
        }
        
        return salaryWithIncrease;
    }
  
    
    public static double calculateFinalYearlyPay(ISalariedPerson person){
        double currentBonus = person.getCurrentBonus();
        double baseSalary = person.getBaseSalary();
        Date startedWorking = person.getStartedWorking();
        double finalYearlyPay = calculateCurrentSalaryWithIncrease(baseSalary, startedWorking) + currentBonus;
        
        return finalYearlyPay;
    }
        
    
    public static double calculatePay(ISalariedPerson person){
        double pay = 0;
        if (person.getTimePeriod() == TimePeriods.FORTNIGHTLY){
            pay = calculateFinalYearlyPay(person)/FORTNIGHTS_IN_YEAR;
        }
        else if (person.getTimePeriod() == TimePeriods.MONTHLY){
            pay = calculateFinalYearlyPay(person)/MONTHS_IN_YEAR;
        }
            return pay;
    }
}
