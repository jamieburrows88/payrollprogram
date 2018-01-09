package oca.project;

/**
 *
 * Interface to be implemented by all people working at the company 
 * who have a manager
 */
public interface ISubordinate extends IContractor {
    
    IManager getManager();
}
