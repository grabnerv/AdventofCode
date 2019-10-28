import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



public class Day2{

    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("inputs/Day2.txt"));
        while(file.hasNextLine()){
            String line = file.nextLine();
            int x1 = line.indexOf("x");
            int x2 = line.lastIndexOf("x");
            
            
            int l = Integer.parseInt(line.substring(0, x1));
            int w = Integer.parseInt(line.substring(x1 + 1, x2));
            int h = Integer.parseInt(line.substring(x2 + 1));
            
            System.out.println((2*l*w) + (2*w*h) + (2*w*h));



        }


        file.close();


    }
    
}