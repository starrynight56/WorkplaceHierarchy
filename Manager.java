/* Author: Rosanne Hu
 * Date: 5/26/17
 * Filename: Managers.java
 */
import java.util.HashMap;
public class Manager extends Employee{
  //Each manager has one or more employees reporting to them
  private HashMap<Integer,Employee> roster=new HashMap<Integer,Employee>();
  
  public Manager(String name,String pos,int sal, int Vbal, int AnBon){
    super(name,pos,sal,Vbal,AnBon);
  }
  //adds employee to the roster of people the manager has 
  //for a completely new employee
  public void addEmployee(String name,String po,int sal, int Vbal, int AnBon){
    Employee person = new Employee(name,po, sal,Vbal,AnBon);
    roster.put(person.getID(),person);
  }
  //existing employee
  public void addEmployee(int employeeID,Employee employee){
    roster.put(employeeID,employee);
  }
  //get the roster
  public HashMap<Integer,Employee> getRoster(){
    return roster;
  }
  //delete employee from a roster
  public void deleteEmployee(int idnum){
    roster.remove(idnum);
  }
  
  public String toString(){
    String s = "";
    s+=super.toString();
    for(int key:roster.keySet()) {
        s+= roster.get(key).toString();
      }
    return s;
  }
  public static void main(String[] args){
    Manager Tom = new Manager("Tom","Manager of Finance",1000, 10, 100);
    Tom.addEmployee("Joesph","Front Desk Clerk", 10000,24, 1000);
    System.out.print(Tom);
  }
}