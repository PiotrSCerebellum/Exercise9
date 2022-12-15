import java.io.*;


public class Task3 {
    public static void main(String[] args)
    {
        FileInputStream fis;
        FileOutputStream fos;
        String fileInLocation="C:\\Users\\Woda\\Desktop\\aa.txt";
        String fileOutLocation="C:\\Users\\Woda\\Desktop\\aaOut.txt";

        CopyFile(fileInLocation,fileOutLocation);
    }

    private static void CopyFile(String fileINLocation,String fileOutLocation) {
        String str = " ";
        String line;
        try(BufferedReader fis=new BufferedReader(new FileReader(fileINLocation)))
        {
            while ((line = fis.readLine()) != null) {
                // buffer.append(line);
                str += line;}
        }catch (FileNotFoundException e)
        {
            System.out.println("File not found");
            return;
        } catch (IOException e) {
            System.out.println("IO error");
        }
        str=str.replace(' ','-');

        try(BufferedWriter fos=new BufferedWriter(new FileWriter(fileOutLocation)))
        {
            fos.write(str);
        }
        catch (IOException e)
        {
            System.out.println("Error while reading file");
        }



    }



}
