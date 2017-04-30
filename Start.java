
/**
 * Write a description of class Start here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Start
{
    public static void main(String[] args)
    {
        try
        {
            AssetPool asl = new AssetPool();
            UserInterface UI = new UserInterface(asl);
            UI.run();    
            asl.writeAllAssetsToFile();
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }       
    }
}
