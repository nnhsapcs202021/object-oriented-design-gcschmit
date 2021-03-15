
/**
 * A FillInQuestion is constructed with a string that contains the answer surrounded by
 *     '_'. For example, "The inventor of Java is _James Gosling_." The question should
 *     be displayed as: "The inventor of Java is _____."
 *
 * @author gcschmit
 * @version 15 March 2021
 */
/*
 * The FillInQuestion class extends (i.e., is a subclass of, is derived from) the
 *     Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * DO NOT declare instance variables to text and answer! The text and answer instance
     *     variables are inherited from the Question class!
     */
    
    /**
     * Constructs a FillInQuestion object with the specified text that contains the answer.
     * 
     * @param question the specified question text with embedded answer
     */
    public FillInQuestion(String question)
    {
        /*
         * Explictly call the Question class's constructor that takes a single parameter.
         *     Calling a superclass's constructor *must* be the first line of code in
         *     the subclass's constructor.
         *     
         * If we don't explicilty call a superclass's constructor, Java will automatically
         *     call the superclass's default (i.e., no parameters) constructor.
         */
        super(question);
    }
    
    
}



