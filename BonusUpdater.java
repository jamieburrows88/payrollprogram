/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.util.ArrayList;

/**
 *
 * @author 92017403
 */
public class BonusUpdater {
 
    public static String assignBonus(IManager manager, ISubordinate subordinate, double bonus){
    
        for (ISubordinate sub : manager.getSubordinateList()){
            int subCount = 0;
            String msg = "The bonus of " + bonus + " has been assigned to " + subordinate;
            if (sub == subordinate) {
                subCount++;
                try{
                if(subCount == 0){
                    throw new IllegalArgumentException();
                     }
                }
                catch (IllegalArgumentException iae){
                    iae.printStackTrace();
                }
            }
            
            else if (subCount > 0) {
                if (manager.getBonusFund() > bonus){
                  String message = "Manager cannot allocate more than " + manager.getBonusFund();
                }
                else if (manager.getBonusFund() <= bonus){
                    
                    }
      }   
    }
  }
}