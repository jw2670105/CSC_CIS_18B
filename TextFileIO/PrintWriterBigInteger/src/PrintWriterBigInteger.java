import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.math.BigInteger;

public class PrintWriterBigInteger {
    
    private static BigInteger[] fact(int n)
    {           
        int i=0;
        System.out.print("Building big lookup table, please wait ");
        BigInteger[] result=new BigInteger[n+1];
        result[0] = BigInteger.ONE;

            if (n>0)
            {
                for(i=1;i<=n;i++)
                {         
                    if ( i%10000==0 ) System.out.print(".");

                    result[i]=result[i-1].multiply(BigInteger.valueOf(i));
                }
            }
        System.out.println();
        return result;
    }

    public static void main(String[] args) {

        BigInteger[] factorial = fact(30000);
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter name of file to write: ");
        String filename = kb.nextLine();
        
        try
        {
            PrintWriter output = new PrintWriter(new File(filename));
            for(int i=0;i<=30000;i++)
            {
                if ( i % 1000 == 0 ) System.out.print(".");
                output.println(factorial[i]);
            }
            
            output.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
