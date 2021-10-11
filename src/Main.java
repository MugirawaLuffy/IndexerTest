
public class Main {

    public static void main(String args[])
    {
        //start with query
        //keyword:
        // 'flags': reminder is options


        //Entry Point

        InputHandler handler = new InputHandler();

        if(args[0] == "visual")
        {
            handler.HandleVisual();
        }else
        {
            handler.HandleConsoleInp(args);
        }

    }
}
