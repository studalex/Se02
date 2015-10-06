

public class Main {
    public static void main(String... arg) {
        //Создаем 10 кг урана
        Uranium uranium = new Uranium(10, 235);
        //Создаем лодку
        NuclearBoat nuclearBoat = new NuclearBoat();

        //Заправляем лодку ураном
        nuclearBoat.fillBoat(uranium);
        //Запускаем лодку в плавание
        nuclearBoat.startButton();
    }
}
