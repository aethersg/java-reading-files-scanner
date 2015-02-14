
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //String fileName = "/Users/judetan/git/jude-github/java-reading-files-scanner/JavaReadFileScanner/example.txt";
        /*
         this will read from the root folder. if we do not specific the absolute path.
         */
        String fileName = "example.txt";
        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        /*
         this will not read the new line byte.
         as such we will need to place in.nextline()
         */
        int value = in.nextInt();
        System.out.println("Read Value :" + value);
        in.nextLine();
        int count = 2;
        while (in.hasNextLine())
        {
            String line = in.nextLine();
            System.out.println(count + ":" + line);
            count++;
        }
        in.close();
    }

}
