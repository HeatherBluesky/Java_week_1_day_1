public class Waterbottle {
    private int volume;

    public Waterbottle(int volume){
        this.volume= volume;
    }

    public int getVolume(){
        return volume;
    }

    public void takeDrink(){
        this.volume -= 10;
    }

    public void finishDrink(){

        this.volume = 0;
    }

    public void anotherDrink(){

        this.volume = 100;
    }

}
