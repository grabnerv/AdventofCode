import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Day2{

    public static void main(String[] args) throws FileNotFoundException {
        
        int total = 0;
        int step = 0;
        int smallest = 0;

        Scanner file = new Scanner(new File("inputs/Day2.txt"));

        while(file.hasNextLine()){

            String line = file.nextLine();
            int x1 = line.indexOf("x");
            int x2 = line.lastIndexOf("x");
            
            int l = Integer.parseInt(line.substring(0, x1));
            int w = Integer.parseInt(line.substring(x1 + 1, x2));
            int h = Integer.parseInt(line.substring(x2 + 1));
            
            int s1 = 2*l*w;
            int s2 = 2*w*h;
            int s3 = 2*h*l;

            if (s1 < s2){
                smallest = s1;
            }else if (s2 < s3){
                smallest = s2;
            }else{
                smallest = s3;
            }


            step = (s1 + s2 + s3);
            total += step;



        }

    System.out.println(total);

    file.close();


    }
    
}