
/**
 * Write a description of class Asset here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Asset 
{
     Scanner sc= new Scanner(System.in);
   private String serNum;
   private String lapBrand;
   private String lapModel;
   private String lapProcessor;
   private String lapAssignedStatus;
   //private String phnNum;
   private String phnBrand;
   private String phnModel;
   private String phnDimension;
   private String phnDisplay;
   private String phnAssignedStatus;
   private String type;
   
   
   
    public Asset(String data)
    {
        
        
        String[] list = data.split(",");
        type=list[0];
        serNum = list[1];
        lapModel = list[2];
        lapBrand = list[3];
        lapProcessor = list[4];
        lapAssignedStatus = list[5];
               
    }
    public Asset(String data,String a)
    {
        
        
        String[] list = data.split(",");
        type=list[0];
        serNum = list[1];
        phnModel = list[2];
        phnBrand = list[3];
        phnDisplay = list[4];
        phnDimension=list[5];
        phnAssignedStatus = list[6];
               
    }
    
    
    
    /** It initializes the details of laptop*/
   Asset(String type, String lapNum,String lapBrand,String lapModel,String lapProcessor,String lapStatus)
   {
       this.type=type;
       this.serNum=lapNum;
       this.lapBrand=lapBrand;
       this.lapModel=lapModel;
       this.lapProcessor=lapProcessor;
       this.lapAssignedStatus=lapStatus;
    }
    
    /** It initializes the details of phone*/
   Asset(String type,String phnNum,String phnBrand,String phnModel,String phnDisplay,String phnDimension,String phnStatus)
   {
       this.type=type;
       this.serNum=phnNum;
       this.phnBrand=phnBrand;
       this.phnModel=phnModel;
       this.phnDisplay=phnDisplay;
       this.phnDimension=phnDimension;
       this.phnAssignedStatus=phnStatus;
    }
    
     
    public void settype(String type)
    {
        this.type = type;
    }
    
    public String getType()
    {
        return type;
    }
     public void setserNum(String laptopSerialNumber)
    {
        this.serNum = laptopSerialNumber;
    }
    
    public String getSerNum()
    {
        return serNum;
    }
    
    public void setlapModel(String laptopModel)
    {
        this.lapModel = laptopModel;
    }
    
    public String getLapModel()
    {
        return lapModel;
    }
     public void setlapBrand(String laptopBrand)
    {
        this.lapBrand = laptopBrand;
    }
    
    public String getLapBrand()
    {
        return lapBrand;
    }
     public void setlapProcessor(String laptopProcessor)
    {
        this.lapProcessor = laptopProcessor;
    }
    
    public String getLapProcessor()
    {
        return lapProcessor;
    }
     public void setlapAssignedStatus(String laptopStatus)
    {
        this.lapAssignedStatus = laptopStatus;
    }
    
    public String getLapAssignedStatus()
    {
        return lapAssignedStatus;
    }
    
   
    
    public void setphnModel(String phoneModel)
    {
        this.phnModel = phoneModel;
    }
    
    public String getPhnModel()
    {
        return phnModel;
    }
     public void setphnBrand(String phoneBrand)
    {
        this.phnBrand = phoneBrand;
    }
    
    public String getPhnBrand()
    {
        return phnBrand;
    }
     public void setphnDisplay(String phoneDisplay)
    {
        this.phnDisplay = phoneDisplay;
    }
    
    public String getPhnDisplay()
    {
        return phnDisplay;
    }
     public void setphnDimension(String phoneDimension)
    {
        this.phnDimension = phoneDimension;
    }
    
    public String getPhnDimension()
    {
        return phnDimension;
    }
     public void setphnAssignedStatus(String phoneStatus)
    {
        this.phnAssignedStatus = phoneStatus;
    }
    
    public String getPhnAssignedStatus()
    {
        return phnAssignedStatus;
    }
    
    public void saveAssetLaptop(ArrayList<String> data)
    {
        data.add(type+ "," +serNum + "," + lapModel + "," + lapBrand + "," + lapProcessor + "," + lapAssignedStatus);
    }
    public void saveAssetPhone(ArrayList<String> data)
    {
        data.add(type + ","+serNum + "," + phnModel + "," + phnBrand + "," + phnDisplay + "," + phnDimension  + "," + phnAssignedStatus);
    }
    
    
    
    
}


