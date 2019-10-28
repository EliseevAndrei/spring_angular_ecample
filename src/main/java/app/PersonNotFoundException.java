package app;

public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException(Integer id){
        super("Couldn't find person" + id);
    }
}
