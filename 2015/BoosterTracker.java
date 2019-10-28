import java.util.Scanner;
private class BoosterTracker{
    public static void main(String[] args){
        Scanner kboard = new Scanner(System.in);
        
        int weeks = 4;
        BandBooster booster1 = new BandBooster("Van");
        BandBooster booster2 = new BandBooster("Alex");
        BandBooster booster3 = new BandBooster("Tajh");

        for(int i = 0; i <= weeks; i++){
            System.out.println("Enter boxes: ");
            int boxes = Integer.parseInt(kboard.nextLine());
            System.out.println(boxes);
        }
        
        



    }



}