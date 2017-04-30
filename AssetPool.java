
/**
 * Write a description of class AssetPool here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.List;
//import java.util.Collections;
import java.io.*;
import java.util.*;
public class AssetPool
 {
  // private ArrayList<Asset> assetList;
    
   Scanner sc= new Scanner(System.in);
    private ArrayList assetDetailInfo = new ArrayList();
    private String type;
   private String serNum;
   private String lapBrand;
   private String lapModel;
   private String lapProcessor;
   private String lapStatus;
   private String phnBrand;
   private String phnModel;
   private String phnNum;
   private String phnDisplay;
   private String phnDimension;
   private String phnStatus;
   
   private String assetSerial;
   private ArrayList<Asset> assetList=new ArrayList<Asset>();
    
   
   /** Constructor for the Asset class */
     AssetPool()
       {
         try
        {
            assetList = new ArrayList<Asset>(); 
            readAllAssetsFromFile();
        }
        catch(Throwable ex)
        {
            System.out.println(ex);
        }    
    }
    /** It initializes the details of laptop*/
   AssetPool(String type,String lapNum,String lapBrand,String lapModel,String lapProcessor,String lapStatus)
   {
       this.type=type;
       this.serNum=lapNum;
       this.lapBrand=lapBrand;
       this.lapModel=lapModel;
       this.lapProcessor=lapProcessor;
       this.lapStatus=lapStatus;
    }
    
   /** It initializes details of phone*/
   AssetPool(String type,String phnNum,String phnModel,String phnBrand, String phnDiasplay,String phnDimension,String phnStatus )
   {
       this.type=type;
       this.serNum=phnNum;
       this.phnModel=phnModel;
       this.phnBrand=phnBrand;
       this.phnDisplay=phnDisplay;
       this.phnDimension=phnDimension;
       this.phnStatus=phnStatus;
   }
    
  /** This method calculates the overdue fee */
 /* public double getOverdueFee()
  {
    Double fees=0.000000;
    for(int i = 0;i<assetList.size();i++)
        {
           String str = (String) assetList.get(i);
           //String ar [] =  str.split("\n");
           Double d= Double.parseDouble(str);
            fees= d*10;
           System.out.println(fees);
           
        }
         System.out.println("--------------------------------");
         return fees;
  }
  */
  /** This method sorts the assetList  /*
   * 
   */
  /*/public void sortAssets()
  {
      Collections.sort(assetList);
  }*/
 
    public void addLaptop(Asset asset)
    {
        assetList.add(asset);
        //Collections.sort(assetList);
    }
     public void addPhone(Asset asset)
    {
        assetList.add(asset);
        //Collections.sort(assetList);
    }
    
    public ArrayList<Asset> getAllAssets()
    {
        //Collections.sort(assetList);
        return assetList;
    }

   
    public Asset findPart(String number)
    {
        for(Asset ast : assetList)
        {
            if(ast.getSerNum().equals(number))
            return ast;
        }
    
        return null;
    }   
    public void removePart(Asset partToRemove)
    {
        assetList.remove(partToRemove);
    }
  
  public void writeAllAssetsToFile() throws Exception
    {
        
         ArrayList<String> dataList = new ArrayList<String>();
        
         
      System.out.println();
        
        
        for(Asset obj : assetList)
        {   
            String str = obj.toString();
            if(str.matches("Laptop(.*)"))
                obj.saveAssetLaptop(dataList);
            else
                obj.saveAssetPhone(dataList);
        }
       
        IO_Support.saveData("AssetData.txt",dataList);
        }
        public void writeAllPhoneToFile() throws Exception
    {
        
         ArrayList<String> dataList = new ArrayList<String>();
    
        for(Asset obj : assetList)
        {
            obj.saveAssetPhone(dataList);
        }
       
        IO_Support.saveData("AssetData.txt",dataList);
        }
      
    
    
    
  public void readAllAssetsFromFile()throws Exception
    {
        ArrayList<String> data = IO_Support.readData("AssetData.txt");
    
        for(String s : data)
        {
            assetList.add(new Asset(s));
        }  
    }
}
   


