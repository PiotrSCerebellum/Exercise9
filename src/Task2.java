import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Task2 {
    public static void main(String[] args)
    {
        FileInputStream fis;
        int bajt=0;
        try
        {
            fis= new FileInputStream("C:\\Users\\Woda\\Desktop\\aa.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
            return;
        }
        try(fis)
        {
            do
            {
                bajt=fis.read();
                if (bajt!=-1) System.out.println(((char) bajt));

            }while (bajt!=-1);

        }
        catch (IOException e)
        {
            System.out.println("Error while reading file");
        }
        finally {
            try{fis.close();}
            catch (IOException e)
            {
                System.out.println("Error while reading file");
            }
        }
    }
}
