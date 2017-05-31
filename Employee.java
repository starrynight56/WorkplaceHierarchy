/* Author: Rosanne Hu
 * 5/26/17
 * Filename:Employee.java
 */
import java.util.Random;

public class Employee{
  
  //instance Variables
  private int idnum;
  private String name;
  private String position;
  private int salary;//monthly
  private int[] salaryHist = new int[5];
  private int count=1; //number of previous salaries already had
  private int vacationBal;//in days
  private int annualBonus;
  private String password;

  /** 
   * Constructor for our method that takes in values for Salary, 
   * salary history, vacation balance, and annual bonus
   */
  public Employee(String name,String pos,int sal, int Vbal, int AnBon){
    Random rnd = new Random();
    this.idnum = 100000 + rnd.nextInt(900000);
    this.name = name;
    this.position = pos;
    this.salary = sal;
    this.vacationBal = Vbal;
    this.annualBonus = AnBon;
    this.password = "AJDLIAFYI";
    salaryHist[0] = salary;
  }
  //getters
  protected String getName(){
    return name;
  }
  protected int getSalary(){
    return salary;
  }
  protected int getVacationBalance(){
    return vacationBal;
  }
  protected int getannualBonus(){
    return annualBonus;
  }
  protected int getID(){
    return idnum;
  }
  //setters
  protected void setSalary(int newSalary){
    salary= newSalary;
    salaryHist[count]= newSalary;
    count++;
    
  }
  protected void setVacationBalance(int newVbal){
    vacationBal=newVbal;
  }
  protected void setannualBonus(int newBonus){
   annualBonus=newBonus;
  }
  protected void setName(String newName){
    name = newName;
  }
  private void setPW(String pass){
    password = pass;
  }
  
  //toString method that basically prints out all the persons information
  //except previous salary history
  public String toString(){
    String s = "";
    s+="Employee: "+name+"\n";
    s+="Employee ID: " + idnum +"\n";
    s+="Current Position: "+position+"\n";
    s+="Current Salary: $" +salary+"\n";
    s+="Vacation Balance: " + vacationBal+ " days\n";
    s+="Bonus: $" +annualBonus+"\n";
    return s;
  }
  public static void main(String[] args){
    Employee Joesph = new Employee("Joesph","Front Desk Clerk",10000,24, 1000);
    System.out.println(Joesph);
  }
}
