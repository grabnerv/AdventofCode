import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Day1{


     public static void main(String[] args) throws FileNotFoundException {
         Scanner file = new Scanner(new File("inputs/Day1.txt"));
         
          int floor = 0;
          int solution = 0;
          String line = file.nextLine();
          System.out.println(line.charAt(0));

          for(int i = 0; i < line.length(); i++){

               char c = line.charAt(i);
               if (c == '('){
                    floor++;
               }else{
                    floor--;
               }

               if (floor < 0){
                    System.out.println(i + 1);
                    break;
               }

          }
               
          
         


        file.close();
     }


}