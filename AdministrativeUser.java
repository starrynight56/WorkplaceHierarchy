/*
 * Author: Rosanne Hu
 * Date: 5/27/17
 * Filename: HiringManager.java
 */
import java.util.HashMap;
public class AdministrativeUser extends HiringManager{
  /**
   * Administrative Users have all access
   */
  private HashMap<Integer,HiringManager> hmanagerRoster=new HashMap<Integer,HiringManager>();
  
  private AdministrativeUser(String name,String pos,int sal, int Vbal, int AnBon){
    super(name,pos,sal,Vbal,AnBon);
  }
  /** 
   * makes a new hiring manager and gives them current list of all managers and employees
   */
  private void addNewHiringManager(String name,String pos,int sal, int Vbal, int AnBon){
    HiringManager hman = new HiringManager(name,pos,sal,Vbal,AnBon);
    int count =0;
    if(hmanagerRoster.size()!=0 && count==0){
      for(int key: hmanagerRoster.keySet()){
        hman.setManagerRoster(hmanagerRoster.get(key).getManagerRoster());
        hman.setEmployeeRoster(hmanagerRoster.get(key).getEmployeeRoster());
        count++;
      }
    }
    hmanagerRoster.put(hman.getID(),hman);
    employeeRoster.put(hman.getID(),hman);
  }
  
}