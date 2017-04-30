
/**
 * Write a description of class Laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.ArrayList;
public  class  Laptop extends Asset
{
    ArrayList al= new ArrayList();
    AssetPool asset= new AssetPool();
    private String type="not set";
    private String serialNumber = "not set";
    private String modelNumber = "not set";
    private String brand = "not set";
    private String processor = "not set";
    private String assignedStatus = "N";
    private String assignedDate="not set";
    private String dueDate="not set";
    private String assignedEmpNo="not set";
    private String assignedEmpName="not set";
    private String assignedEmpLocation="not set";
    
    
    /** This is the constructor for the Laptop class and its further calling the constructor of its super Asset class. It also initializes the cpu attribute. */
public Laptop (String type,String serialNumber,String modelNumber,String brand,String processor, String assignedStatus)
{
    super(type,serialNumber,modelNumber, brand,processor,assignedStatus);  
   assignedDate=this.assignedDate;
   dueDate=this.dueDate;
   assignedEmpNo=this.assignedEmpNo;
   assignedEmpName=this.assignedEmpName;
   assignedEmpLocation=this.assignedEmpLocation;
  // cpu=this.cpu;
}

  public void assignLaptop()
    {
        System.out.println("Enter laptop serial number:");
        serialNumber = sc.next();
        System.out.println("Enter Employee number:");
         assignedEmpNo =  sc.next();
        System.out.println("Enter Employee Name:");
         assignedEmpName = sc.next();
        System.out.println("Enter Employee Location:");
         assignedEmpLocation = sc.next();
        System.out.println("Enter Assigned Date:");
         assignedDate = sc.next();
        System.out.println("Enter Due Date:");
         dueDate = sc.next();
        
      al.add(serialNumber+"\n"+modelNumber+"\n"+brand+"\n"+processor+"\n"+assignedDate+"\n"+dueDate);
      System.out.println("----------------*-----------------");
      System.out.println("Laptop assigned to employee..");
      System.out.println("----------------*-----------------");
      asset.addAssetToAssetPool(al);
    }  
   
    
    
   /* public String toString()
    {
        return "Part : " + description +
        " No:" + partNumber + ", Cost: " + cost;
    }
    
    public void savePart(ArrayList<String> data)
    {
        data.add(partNumber + "," + description + "," + cost);
    }
    
    public int compareTo(Part aPart)
    {
        return this.getDescription().compareTo(aPart.getDescription());
    }
    */
    
}


