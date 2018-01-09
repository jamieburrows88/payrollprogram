package oca.project;

import java.util.ArrayList;



/**
 * Main class that creates all employees and specifies their managers
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating Forms
        MainForm mainForm = new MainForm();
        AssignBonusForm assignBonusForm = new AssignBonusForm();
        CreatePaymentsForm createPaymentsForm = new CreatePaymentsForm();
        PersonalInfoForm personalInfoForm = new PersonalInfoForm();
        PayrollReportsForm payrollReportsForm = new PayrollReportsForm();
        
        //Setting which forms to be visible on start-up
        mainForm.setVisible(true);
        assignBonusForm.setVisible(false);
        createPaymentsForm.setVisible(false);
        personalInfoForm.setVisible(false);
        payrollReportsForm.setVisible(false);
    }
    
}
