public class MyTaxiTest {
    public static void main(String[] args){
        Taxi taxi1 = new Taxi(1);
        Taxi taxi2 = new Taxi(2);

        //<< 승객 +2 >>
        taxi1.getPassenger(2, "서울역", 2);

        //<< 주유량 -80 >>
        taxi1.getFuel(-80);

        //<< 요금 결제 >>
        taxi1.payment();

        //<< 승객 +5 >>
        taxi1.getPassenger(5, "구로디지털단지역", 12);

        //<< 승객 +3 >>
        taxi1.getPassenger(3, "구로디지털단지역", 12);

        //<< 주유량 -20 >>
        taxi1.getFuel(-20);

        //<< 요금 결제 >>
        taxi1.payment();
    }
}
