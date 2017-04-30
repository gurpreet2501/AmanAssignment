
/**
 * Write a description of class Phone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public  class Phone extends Asset
{
    private String type="not set";
    private String serialNumber = "not set";
    private String modelNumber = "not set";
    private String brand = "not set";
    private String display = "not set";
    private String dimension="not set";
    private String assignedStatus = "N";
    
    
    
    /** This is the constructor for the Laptop class and its further calling the constructor of its super Asset class. It also initializes the cpu attribute. */
public Phone (String type,String serialNumber,String modelNumber,String brand,String display,String dimension, String assignedStatus)
{
    super(type,serialNumber,modelNumber, brand,display,dimension,assignedStatus);  
  // cpu=this.cpu;
}

   
    
    
    
    
}
