import java.util.Random;
import java.util.ArrayList;
/**
 * The AnswerBank class will randomly select an answer from the category determined previously
 * by the QuestionParser.
 * 
 * @author Chris Lindgren
 * @version 1.0
 */
public class AnswerBank
{
    Random rand;

    /**
     * The getAnswer method categorizes the proper type of question, then calls the proper method.
     * 
     * @param      int quesToAnswer - 
     * @return     String answer - 
     */
    public String getAnswer(int quesToAnswer)
    {
        String answer = new String();
        
        switch(quesToAnswer)
        {
            case 1: answer = what();     break;
            case 2: answer = when();     break;
            case 3: answer = where();    break;
            case 4: answer = why();      break;
            case 5: answer = how();      break;
            case 6: answer = who();      break;
            case 0: answer = generic();  break;
        }
        
        return answer;
    }
    
    /**
     * The what method returns a randomly generated answer from the "what" question category.
     * 
     * @return     String answer - a response for the UI.
     */
    private String what()
    {
        ArrayList<String> answer = new ArrayList<String>();
        Random rand = new Random();
        
        answer.add("There are ways, Dude. You don't wanna know about it, believe me.");
        answer.add("Dude.");
        answer.add("Mark it 8, Dude.");
        answer.add("OVER THE LINE!");
        answer.add("The medium is the message.");
        answer.add("The answers are always inside the problem, not outside.");
        answer.add("Mud sometimes gives the illusion of depth.");
        answer.add("Freedom is what you do with what's been done to you.");
        answer.add("We are responsible for what we are.");
        answer.add("Any actions that you might take are equivalent, and, on principle, doomed to failure.");
        answer.add("You must make abstract that which is concrete.");
        answer.add("One lives one's death. One dies one's life.");
        
        return answer.get(rand.nextInt(answer.size()));
    }
    
    /**
     * The when method returns a randomly generated answer from the "when" question category.
     * 
     * @return     String answer - a response for the UI.
     */
    private String when()
    {
        ArrayList<String> answer = new ArrayList<String>();
        Random rand = new Random();
        
        answer.add("Dude.");
        answer.add("Mark it 8, Dude.");
        answer.add("Mud sometimes gives the illusion of depth.");
        answer.add("I may be wrong, but I'm never in doubt: @midnight.");
        answer.add("This information is top security. When you have read it, destroy yourself.");
        answer.add("Freedom is what you do with what's been done to you.");
        answer.add("... dude, not sure. But when you know, let me know.");
        answer.add("Nothingness, you must embrace it.");
        
        return answer.get(rand.nextInt(answer.size()));
    }
    
    /**
     * The where method returns a randomly generated answer from the "where" question category.
     * 
     * @return     String answer - a response for the UI.
     */
    private String where()
    {
        ArrayList<String> answer = new ArrayList<String>();
        Random rand = new Random();
        
        answer.add("The closer we are to trouble, the farther we are from harm.");
        answer.add("Dude.");
        answer.add("This information is top security. When you have read it, destroy yourself.");
        answer.add("Just take it easy man.");
        answer.add("The dude abides.");
        answer.add("No finite point has meaning without an infinite reference point.");
        answer.add("Life begins on the other side of despair.");
        answer.add("Nothingness, you must embrace it.");
        
        return answer.get(rand.nextInt(answer.size()));
    }
    
    /**
     * The why method returns a randomly generated answer from the "why" question category.
     * 
     * @return     String answer - a response for the UI.
     */
    private String why()
    {
        ArrayList<String> answer = new ArrayList<String>();
        Random rand = new Random();
        
        answer.add("Dude.");
        answer.add("That's dangerous business!");
        answer.add("If it works, it's obsolete.");
        answer.add("I'm sorry, I wasn't listening.");
        answer.add("The missing link created far more interest than all the chains and explanations of being.");
        answer.add("I am the walrus.");
        answer.add("The answers are always inside the problem, not outside.");
        answer.add("Why is it so easy to acquire the solutions of past problems and so difficult to solve current ones?");
        answer.add("Mud sometimes gives the illusion of depth.");
        answer.add("Life begins on the other side of despair.");
        
        return answer.get(rand.nextInt(answer.size()));
    }
    
    /**
     * The how method returns a randomly generated answer from the "how" question category.
     * 
     * @return     String answer - a response for the UI. 
     */
    private String how()
    {
        ArrayList<String> answer = new ArrayList<String>();
        Random rand = new Random();
        
        answer.add("There are ways, Dude. You don't wanna know about it, believe me.");
        answer.add("Dude.");
        answer.add("OVER THE LINE!");
        answer.add("The missing link created far more interest than all the chains and explanations of being.");
        answer.add("The medium is the message.");
        answer.add("The answers are always inside the problem, not outside.");
        answer.add("Why is it so easy to acquire the solutions of past problems and so difficult to solve current ones?");
        answer.add("Mud sometimes gives the illusion of depth.");
        answer.add("I guess that's the way the whole darned human comedy keeps perpetuatin' itself.");
        answer.add("It's impossible to escape anguish, for we are anguish.");
        answer.add("DESPAIR!");
        answer.add("Life begins on the other side of despair.");
        answer.add("You must make abstract that which is concrete.");
        
        return answer.get(rand.nextInt(answer.size()));
    }
    
    /**
     * The who method returns a randomly generated answer from the "who" question category.
     * 
     * @return     String answer - a response for the UI.
     */
    private String who()
    {
        ArrayList<String> answer = new ArrayList<String>();
        Random rand = new Random();
        
        answer.add("You got the wrong guy. I'm the Dude, man.|");
        answer.add("The dude abides.");
        answer.add("Dude.");
        answer.add("Dude, I dig that person's work.");
        answer.add("You're in for a world of pain.");
        answer.add("Don't be fatuous.");
        answer.add("That question is ludicrous!");
        answer.add("The author is dead.");
        answer.add("It's not impossible.");
        answer.add("They exist, but it is soft, so soft, and so slow.");
        answer.add("What a suberb absence is their soul.");
        
        return answer.get(rand.nextInt(answer.size()));
    }
    
    /**
     * The generic method returns a randomly generated answer from the "generic" question/input category.
     * 
     * @return     String answer - a response for the UI.
     */
    private String generic()
    {
        ArrayList<String> answer = new ArrayList<String>();
        Random rand = new Random();
        
        answer.add("Uh, excuse me. Mark it zero. Next frame.");
        answer.add("Dude.");
        answer.add("Well, yeah!");
        answer.add("Okay, Dude. Have it your way.");
        answer.add("That's right, Dude. 100% certain.");
        answer.add("That's dangerous business!");
        answer.add("Let me tell ya something - I dig _your_ work.");
        answer.add("If it works, it's obsolete.");
        answer.add("You're in for a world of pain.");
        answer.add("Don't be fatuous.");
        answer.add("That question is ludicrous!");
        answer.add("I do not understand! I understand nothing!");
        answer.add("I cannot understand! Nor do I want to understand!");
        
        return answer.get(rand.nextInt(answer.size()));
    }
}
