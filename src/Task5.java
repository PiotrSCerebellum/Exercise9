
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Task5 {

    public static void main (String[] args)  {
        String welcome = "Enter first 3 digit account number";

        String results;
        String query = "";
        System.out.println(welcome);
        URL dataLocation = null;
        try
        {
            dataLocation = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        }
        catch (MalformedURLException e) {
            System.out.println("Wrong URL");
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            query = reader.readLine();
        }
        catch (IOException e)
        {
            System.out.println("IOerror");
        }
        try (BufferedReader fis = new BufferedReader(new InputStreamReader(dataLocation.openStream())))
        {
            while (true)
            {

                results = fis.readLine();
                if (results == null) {
                    System.out.println("Found nothing");
                    return;
                }
                if (results.substring(0, 3).equals(query)) {
                    System.out.println(results.substring(0, results.indexOf("                ")));
                    return;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO error");
        }

    }
}