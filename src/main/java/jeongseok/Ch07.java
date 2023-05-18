package jeongseok;

public class Ch07 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displyCaption("Hello, World");
        stv.caption = true;
        stv.displyCaption("Hello, World");
    }
}
