public class Televisor {

    boolean power;

    void turnOn(){ // włącza telewizor

        power = true;

    }

    void turnOff(){ // wyłącza telewizor

        power = false;

    }


    void showStatus(){ // wyświetla informację, czy telewizor jest włączony, czy wyłączony
        System.out.println(power);
    }
}
