package Notebook.model.DB;

public class NotUniqueNickException extends Exception{
    private String nick;
    public String getNick(){
        return nick;
    }
    public NotUniqueNickException(String message, String nick){
        super(message);
        this.nick = nick;
    }
}
