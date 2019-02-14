package mooc;

public class PlatformException extends Exception
{
    private final Person myStudent;
    private final Course  myCourse;
    
    public PlatformException(String message, Person s, Course c)
    {
        super(message);
        myStudent = s;
        myCourse = c;
    }
    
    public Person getStudent() {
        return myStudent; 
    } 

    public Course getCourse() { 
        return myCourse; 
    } 

}
