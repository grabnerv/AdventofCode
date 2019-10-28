private class BandBooster{
    private String name;
    private int boxesSold;

    public BandBooster(String name){
        boxesSold = 0;
    }

    public String getName(){
        return name;
    }

    public updateSales (int newBoxes){
        boxesSold += newBoxes;
    }

    public String toString(){
        return name + ": " + boxesSold + "boxes";
    }



}