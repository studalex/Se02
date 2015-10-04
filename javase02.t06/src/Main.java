
public class Main {
    public static void main(String... arg){
        Uranium uranium = new Uranium(10, 235);
        NuclearBoat nuclearBoat = new NuclearBoat();

        nuclearBoat.fillBoat(uranium);
        nuclearBoat.startButton();
    }
}
