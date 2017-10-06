import java.util.*;
import java.io.*;

public class JohnTohnk {

    public static void main(String args[]) {
        final int WORDCOUNT = 983;
        final int[] WORDCOUNTS = {9,181,135,9,85,23,5,15,519};

        Scanner[] scans = new Scanner[9];

        for (int s = 0; s < scans.length; s++) {
            try {
                scans[s] = new Scanner(new File("thonk" + s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        String output = "";

        for (int a = 0; a < WORDCOUNT; a++) {
            for (int b = 0; b < scans.length; b++) {
                if (a % (WORDCOUNT/WORDCOUNTS[b]) == 0 && scans[b].hasNext()) {
                    output += scans[b].next() + " ";
                }
            }
            if (a % (WORDCOUNT / 10) == 0)
                output += "\n\n";
        }

        System.out.println(output);
    }
}
