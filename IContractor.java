package oca.project;

import java.util.Date;

/**
 *
 * Interface to be implemented by all people working at the company 
 */
public interface IContractor {
    
    
    //this method should be used by all paied people
    //to calculate the pay earned over a period of time
    public double calculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception ;
}
