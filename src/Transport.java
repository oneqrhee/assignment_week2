public class Transport {
    int id;
    int fuel;
    int speed;
    int maxPassenger;
    String status;

    public void changeSpeed(int speed){
        this.speed += speed;
    }
}
