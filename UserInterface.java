
/**
 * Write a description of class UserInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
   import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface
{
    // instance variables - replace the example below with your own
    private AssetPool assetPool;
  
    public UserInterface(AssetPool apl)
    {
        // initialise instance variables
        this.assetPool = apl; 
    }
  
    public void run()
    {
        while(true)
            switch (menu() ) 
            {
                    case 1:                        
                         System.out.println("Press 1 for adding Laptop and Press 2 for adding Phone");
                         Scanner sc= new Scanner(System.in);
                         int a= sc.nextInt();
                         if(a== 1)
                         
                            addLaptop();
                         else
                            addPhone();
                         break;
                    case 2:
                       deleteAsset();
                        break;
                    case 3:
                        listAssets();
                        break;
                     case 4:
                        //findPart();
                        break;
                     case 7:
                        return;   
                     default:
                        System.out.println ( "Unrecognized option" );
                        break;
            }
    }
    
    private int menu()
    {   
            System.out.println 
            ("1) Add Asset\n2) Delete Asset\n3) List Assigned Assets\n4) Assign Asset\n5) Return Asset \n6) Search Asset \n7)Exit " );
            return IO_Support.getInteger("Select Option: ");
     }
    
    private void addLaptop()
    {
        // get details
        String type;
        String serNum;
        String lapBrand;
        String lapModel;
        String lapProcessor;
        String lapAssignedStatus;
        
        
        IO_Support.println("Add new asset");
        IO_Support.println("");
        type=IO_Support.getString("Enter L for Laptop and P for Phone");
         serNum = IO_Support.getString("Enter Laptop Serial Number:");
         lapModel = IO_Support.getString("Enter Laptop Model Number:");
         lapBrand = IO_Support.getString("Enter Laptop Brand:");
         lapProcessor = IO_Support.getString("Enter Laptop Processor:");
         //lapAssignedStatus = IO_Support.getString("Enter Laptop Assigned Status:");
         assetPool.addLaptop( new Laptop(type,serNum,lapModel,lapBrand,lapProcessor,"N"));
        System.out.println("Laptop Added Succesfully..");
     
    }
     private void addPhone()
    {
        // get details
        String type;
        String serNum;
        String phnBrand;
        String phnModel;
        String phnDisplay;
        String phnDimension;
        //String phnAssignedStatus;
        
         type=IO_Support.getString("Enter L for Laptop and P for Phone");
         serNum = IO_Support.getString("Enter Phone Serial Number:");
         phnModel = IO_Support.getString("Enter Phone Model Number:");
         phnBrand = IO_Support.getString("Enter Phone Brand:");
         phnDisplay = IO_Support.getString("Enter Phone Display:");
         phnDimension = IO_Support.getString("Enter Phone Dimension:");
        // phnAssignedStatus = IO_Support.getString("Enter Phone Assigned Status:";
         assetPool.addPhone( new Phone(type,serNum,phnModel,phnBrand,phnDisplay,phnDimension,"N"));
        System.out.println("Phone Added Succesfully..");
       
    }
    
   
         public void listAssets(){
       System.out.println("1) Press 1 to print assigned laptops");
       System.out.println("1) Press 2 to print assigned phones");
       int inp = IO_Support.getInteger(" ");
       if(inp == 1)
         this.listLaptops();
         else
        this.listPhones(); 
    }
      private void listLaptops()
    {
              //list to screen
       if(assetPool.getAllAssets() != null)
       {
           IO_Support.println("");
           IO_Support.println("Serial Number"+"   "+"Model"+"   "+"Brand"+"   "+"Processor"+"   "+"Status");
           for(Asset asp : assetPool.getAllAssets())
           {
            // System.out.println(asp.getLapAssignedStatus());if(
            Boolean assigned = false;
            String status = asp.getLapAssignedStatus().toString();
            if(status.equals("y"))
              assigned = true;
            
            if(assigned)
                IO_Support.println(asp.getSerNum()+"   "+asp.getLapModel()+"   "+asp.getLapBrand()+"   "+asp.getLapProcessor()+"   "+asp.getLapAssignedStatus());
            
           }
       }
       else
       {
           IO_Support.println("No assets to display.");
       }
   }
     private void listPhones()
    {
              //list to screen
       if(assetPool.getAllAssets() != null)
       {
           IO_Support.println("");
           IO_Support.println(
            "Serial Number"+
            "   "+
            "Model"+
            "   "+
            "Brand"+
            "   "+
            "Display"+
            "   "+
            "Dimensions"+
            "   "+
            "Assigned Status"
            );
           for(Asset asp : assetPool.getAllAssets())
           {
            // System.out.println(asp.getLapAssignedStatus());if(
            Boolean assigned = false;
            String status = asp.getLapAssignedStatus().toString();
            if(status.equals("y"))
              assigned = true;
            
            if(assigned)
                IO_Support.println(asp.getSerNum()+"   "+asp.getPhnModel()+"   "+asp.getPhnBrand()+"   "+asp.getPhnDisplay()+"   "+asp.getPhnAssignedStatus());
            
           }
       }
       else
       {
           IO_Support.println("No assets to display.");
       }
   }
    private void deleteAsset()
    {
        String find;
        find = IO_Support.getString("Enter Serial Number  you wish delete:");
        Asset ast = assetPool.findPart(find);
        if (ast == null)
            IO_Support.println("Asset not found");
        else
        {
              IO_Support.println(ast.toString());
              assetPool.removePart(ast);
              IO_Support.println("Asset Deleted");
        }       
    }
    /*
    private void findPart()
    {
        String find;
        find = IO_Support.getString("Enter Number of part you wish to find:");
        Part p = theCar.findPart(find);
        if (p == null)     
            IO_Support.println("Part not found");
        else
            IO_Support.println(p.toString());
    }
      */      
}
