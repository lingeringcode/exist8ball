import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * The MagicEightBall class will have the user interface with the input/output functionality. 
 * 
 * @author Chris Lindgren
 * @version 1.0
 */
public class MagicEightBall
{
    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void shakeTheEightBall()
    {
        Scanner scan = new Scanner(System.in);
        QuestionParser qp = new QuestionParser();
        AnswerBank ab = new AnswerBank();
        QuestionArchive qa = new QuestionArchive();
        String input = "";
        String end = "x";
        String quesArch = "qa";
        String archiveQues = "aq";
        
        System.out.println("Virtual Magic Eight Ball." +
                "\nTo see the Eight Ball, use your vivid imagination." +
                "\nEnter e(x)it anytime to quit the program.");
        
        do
        {
            System.out.print("\nEnter <qa> to run the question archive" +
                "\nEnter <aq> to archive a question" +
                "\nEnter <x> anytime to exit the program." +
                "\nOr, Ask the Magic Eight Ball a question.: ");
            input = scan.nextLine();
            
            if(input.equalsIgnoreCase(quesArch))
            {
                System.out.print("\nAll questions or a random question? (All or Rand): ");
                input = scan.nextLine();
                
                if(input.equalsIgnoreCase("All"))
                {
                   String[] allQues = QuestionArchive.readQuestion();
                   
                   for(int i = 0; i < allQues.length; i++)
                   {
                           System.out.println("\n" + allQues[i]);
                           System.out.println(ab.getAnswer(qp.parseQuestion(allQues[i])));
                   }
                }
                
                if(input.equalsIgnoreCase("Rand"))
                {
                 String randQues = QuestionArchive.randomQuestion();  
                 System.out.println("\n" + randQues);
                 System.out.println(ab.getAnswer(qp.parseQuestion(randQues)));
                }
            }
            else if(input.equalsIgnoreCase(archiveQues))
            {
                System.out.print("\nEnter the question to be added to the archive: ");
                input = scan.nextLine();
                
                while(input.equals(""))
                {
                    System.out.print("\nWhoops! You didn't type anything. Try again.\n\n");
                    input = scan.nextLine();
                }
                
                qa.writeQuestion(input);
                System.out.print("\nThe question was successfully archived.");
            }
            else if(input.equalsIgnoreCase(end))
            {
                //ends game
                System.exit(0);
            }
            else if(input != archiveQues && input != quesArch)
            {
                System.out.println("\n" + ab.getAnswer(qp.parseQuestion(input)));
            }
        }
        while(input.toLowerCase() != "x");
        
        //ends game
        System.exit(0);
    }
}
