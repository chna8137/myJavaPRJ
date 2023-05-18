package jeongseok;

public class SmartTv extends Tv{
    boolean caption;
    void displyCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
}
