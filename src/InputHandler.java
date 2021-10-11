import java.io.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class InputHandler {
    public InputHandler()
    {
        String[] supFiles = new String[]{               //just basic files
                "pdf", "pptx", "docx", "txt",
                "cpp", "h", "c", "hpp",
                "log", "java"
        };

        includedFiles = (ArrayList<String>) Arrays.asList(supFiles);
    }

    String input;



    private ArrayList<String> includedFiles;



    public void HandleVisual()
    {
        input = JOptionPane.showInputDialog("Input filter");
    }

    public void HandleConsoleInp(String args[])
    {
        for(int i = 0; i < args.length; i++)
            input += args[i] + " ";

        input = input.trim();
    }
}
