
/**
 * Write a description of class IO_Support here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;

/**
 * This class is a support class which defines methods to read and write different forms of program input.
 * 
 * @author Amanpreet Singh
 * @version 1.0
 */

public class IO_Support
{
    private static Scanner in = new Scanner(System.in);
    
    /** getString(String prompt) prompts the user for an input, 
     * reads it as a String object and returns it.
     * 
     * @param   prompt  A String which promts for user input
     * @return  String  An object which holds the user input
     */
    public static String getString(String prompt)
    {
        System.out.print(prompt + " ");
        return in.nextLine();
    }
    
    /** getDouble(String prompt) prompts the user for an input 
     * and parses the input to Double object.
     * 
     * @param   prompt  A String which promts for user input
     * @return  Double  An object which holds the user input
     */
    public static Double getDouble(String prompt)
    {
        Double d = 0.00;
        while(true)
        {
            try
            {
                System.out.print(prompt + " ");
                d = Double.parseDouble(in.nextLine());
                break;
            }
            catch(Exception e)
            {
                  System.out.println("Not a valid Double");
            }
        }
        return d;  
    }
    
    /** getInteger(String prompt) prompts the user for an input 
     * and parses the input to an Integer object.
     * 
     * @param   prompt  A String which promts for user input
     * @return  Integer An object which holds the user input
     */
     public static Integer getInteger(String prompt)
    {
        Integer i = 0;
        while(true)
        {
            try
            {
                System.out.print(prompt + " ");
                i = Integer.parseInt(in.nextLine());
                break;
            }
            catch(Exception e)
            {
                System.out.println("Not a valid Integer");
            }
        }
        return i;  
    }
    
     /** println(String toPrint) prints the argument passed to the method. 
      * 
     * @param   toPrint A String that should be printed to the stdout
     */
    public static void println(String toPrint)
    {
        System.out.println(toPrint);
    }
   
    /** getInteger() promts the user for an integer input and 
     * parses the input to an Integer object.
     * 
     * @return Integer  An object which holds the user input
     */
    public static Integer getInteger()
    {
        Integer i = 0;
        while(true)
        {
            try
            {
                System.out.print("Please enter an integer");
                i = Integer.parseInt(in.nextLine());
                break;
            }
            catch(Exception e)
            {
                System.out.println("Not a valid Integer");
            }
        }
        return i;  
    }
    
    /** saveData(String fileName, ArrayList<String> data) writes the list of Strings in data ArrayList 
     * to the file specified.
     * 
     * @param   fileName  The file name(may include tha path) to which data is written
     * @param   data  An array list of Strings which consists of object data to be saved
     * 
     */
    public static void saveData(String fileName, ArrayList<String> data) throws IOException
    {
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(fileName,true));
            for(String s : data)
            {
                pw.println(s);
            }
            pw.close();
        }catch(Exception ex)
        {
        }
    }
    
    /** readData(String fileName) reads object data from the file specified to an ArrayList of Strings.
     * 
     * @param   fileName  The file name(may include tha path) from which object data is read
     * @return  ArrayList<String>  An array list of Strings which consists of object data that is read from the file
     * 
     */
    public static ArrayList<String> readData(String fileName) throws Exception
    {
        ArrayList<String> data = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        
        String temp = in.readLine(); 
        while (temp != null)
        {
            data.add(temp);
            temp = in.readLine();
        }
        in.close();
        return data;
    }

}// end of class



