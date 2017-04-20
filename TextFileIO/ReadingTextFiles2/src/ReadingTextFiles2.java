import java.util.Scanner;
import java.io.FileReader;

public class ReadingTextFiles2 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter name of textfile to read: ");
        String filename = kb.nextLine();
        
        try 
        {
            Scanner inputFile = new Scanner(new FileReader(filename)); 
            while ( inputFile.hasNextLine() )
            {
                int value1 = inputFile.nextInt();
                int value2 = inputFile.nextInt();
                int value3 = inputFile.nextInt();
                
                System.out.printf("%8d\t%8d\t%8d%n",value1, value2, value3);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
