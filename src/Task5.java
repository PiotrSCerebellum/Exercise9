
import java.io.*;

public class Task5 {

    public static void main (String args[])  {
        String welcome="Enter first 3 digit account number";
        String dataLocation="C:\\Users\\Woda\\Desktop\\BankData.txt";
        String results=" ";
        String query="";
        System.out.println(welcome);
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            query= reader.readLine();
            //System.out.println(query);
        }
        catch (IOException e) {
            System.out.println("IOerror");
        }
        try(BufferedReader fis=new BufferedReader(new FileReader(dataLocation)))
        {
            while(true)  {

                results= fis.readLine();
                if(results==null)
                {
                    System.out.println("Found nothing");
                    return;
                }
                if(results.substring(0,3).equals(query))
                {
                    System.out.println(results.substring(0,results.indexOf("                ")));
                    return;
                }

            }
        }catch (FileNotFoundException e)
        {
            System.out.println("File not found");
            return;
        } catch (IOException e) {
            System.out.println("IO error");
        }

    }
}