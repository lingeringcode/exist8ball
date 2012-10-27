import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 * The QuestionArchive class will handle all file operations.
 * 
 * @author Chris Lindgren
 * @version 1.0
 */
public class QuestionArchive
{   
    //private String[] readQues;
    
    /**
     * The readQuestion method
     * 
     * @return String readQues - 
     */
    public static String[] readQuestion()
    {
        //String[] readQues = new String[];
        String[] readQues = null;
        
        try
        {
            Scanner fileQues = new Scanner(new File("quesArchive.txt"));
            int count = 0;
            
            while(fileQues.hasNext())
            {
                count++;
            }
            
            readQues = new String[count];
            fileQues = new Scanner(new File("quesArchive.txt"));
            
            for(int i = 0; i < readQues.length; i++)
            {
                readQues[i] = fileQues.nextLine();
            }
            
            fileQues.close();
        }
        
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Unable to find quesArchive.txt, exiting.");
        }
        
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        
        return readQues;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @return     the sum of x and y 
     */
    public static String randomQuestion()
    {
        //  A random question from the file will be returned.
        String[] randQues = null;
        //String[] readQues = new String[0]; //is this the problem?
        String[] readQues = null;
        
        try
        {
            Scanner fileQues = new Scanner(new File("quesArchive.txt"));
            Random rand = new Random();
            //String[] readQues;
            
            randQues = readQues[(rand.nextInt(readQues.length))]; //do i need length-1?
            //System.out.println(readQues);
            
            fileQues.close();
        }
        
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Unable to find quesArchive.txt, exiting.");
        }
        
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
        
        return randQues;
    }
    
    /**
     * The writeQuestion method takes the input from the UI to append to the quesArchive.txt file.
     * 
     * @param String readQues
     */
    public static void writeQuestion(String input)
    {
        // The question input by the user will be sent to this method and appended to the file.
        try
        {
            FileOutputStream fos = new FileOutputStream("quesArchive.txt", true);
            
            PrintWriter pw = new PrintWriter(fos);
            
            pw.println(input);
            
            pw.close();
        }
        
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Unable to find quesArchive.txt, exiting.");
        }
    }
}
