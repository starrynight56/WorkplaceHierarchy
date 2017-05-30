/*
 * Author: Rosanne Hu
 * Date: 5/27/17
 * Filename: HiringManager.java
 */
/** Hiring manager has acccess to all Managers and Employee information
  * has view and edit access
  */
import java.util.HashMap;
public class HiringManager extends Manager{
 //instance Variables
  protected HashMap<Integer,Manager> managerRoster=new HashMap<Integer,Manager>();
  protected HashMap<Integer,Employee> employeeRoster=new HashMap<Integer,Employee>();

  protected HiringManager(String name,String pos,int sal, int Vbal, int AnBon){
    super(name,pos,sal,Vbal,AnBon);
  }
  //Given a new employee with new information assign them a manager
  protected void AssignEmployee(int managerID,String name,String po,int sal, int Vbal, int AnBon){
    Employee person = new Employee(name,po, sal,Vbal,AnBon);//make a new Employee
    employeeRoster.put(person.getID(),person);
    managerRoster.get(managerID).getRoster().put(person.getID(),person);
    
  }
  //Given an exisiting employee under another manager 
  protected void AssignEmployee(int newmanagerID,int oldmanagerID, int employeeID){
    //get employee information from old managers roster
    Employee empInfo = managerRoster.get(oldmanagerID).getRoster().get(employeeID);
    //add it to new managers
    managerRoster.get(newmanagerID).addEmployee(employeeID,empInfo);
    //delete from old manager
    managerRoster.get(oldmanagerID).deleteEmployee(employeeID);
  }
  //getters
  protected HashMap<Integer,Manager> getManagerRoster(){
    return managerRoster;
  }
  protected HashMap<Integer,Employee> getEmployeeRoster(){
    return employeeRoster;
  }
  protected void setManagerRoster(HashMap<Integer,Manager> roster){
    managerRoster = roster;
  }
  protected void setEmployeeRoster(HashMap<Integer,Employee> roster){
    employeeRoster = roster;
  }
}