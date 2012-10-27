import java.util.Scanner;
/**
 * The QuestionParser class will evaluate the input String and assign the question to a category.
 * 
 * @author Chris Lindgren
 * @version 1.0
 */
public class QuestionParser
{
    /**
     * The parseQuestion method parses the input from the MagicEightBall to extract the type of question
     * for the program to return the proper random response from the AnswerBank.
     * 
     * @param   String input        a string from the scanner; user asking a question
     * @return  int quesToAnswer    int returned for 
     */
    public int parseQuestion(String input)
    {
        String what = "what";
        String when = "when";
        String where = "where";
        String how = "how";
        String why = "why";
        String who = "who";
        String whom = "whom";
        String other = input;
        String firstWord = input.toLowerCase();
        String delim = "[ ']+";
        String[] qta = firstWord.split(delim);
        int quesToAnswer = 0;
        
        if(qta[0].equalsIgnoreCase(what))
        {
            quesToAnswer = 1;
        }
        else if(qta[0].equalsIgnoreCase(when))
        {
            quesToAnswer = 2;  
        }
        else if(qta[0].equalsIgnoreCase(where))
        {
            quesToAnswer = 3;
        }
        else if(qta[0].equalsIgnoreCase(why))
        {
            quesToAnswer = 4;
        }
        else if(qta[0].equalsIgnoreCase(how))
        {
            quesToAnswer = 5;
        }
        else if(qta[0].equalsIgnoreCase(who) || qta[0].equalsIgnoreCase(whom))
        {
            quesToAnswer = 6;
        }
        else if(qta[0] != when || qta[0] != what || qta[0] != how || qta[0] != where || 
                qta[0] != why || qta[0] != who || qta[0] != whom)
        {
            quesToAnswer = 0;
        }
        
        return quesToAnswer;
    }
}
