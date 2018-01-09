package oca.project;

import java.util.ArrayList;

/**
 *
 * Interface that all the managers should implements
 */
public interface IManager extends IContractor {
    
    ArrayList<ISubordinate> getSubordinateList();
    
    double getBonusFund ();
   
}
