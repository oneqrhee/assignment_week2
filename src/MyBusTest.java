public class MyBusTest {
    public static void main(String[] args){
        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(2);
        //<< 승객 +2 >>
        bus1.getPassenger(2);

        //<< 주유량 -50 >>
        bus1.getFuel(-50);

        //<< 상태변경 - 차고지행 >>
        bus1.changeTransportStatus("차고지행");

        //<< 주유량 +10 >>
        bus1.getFuel(10);

        //<< 상태변경 - 운행 >>
        bus1.changeTransportStatus("운행");

        //<< 승객 +45 >>
        bus1.getPassenger(45);

        //<< 승객 +5 >>
        bus1.getPassenger(5);

        //<< 주유량 -55 >>
        bus1.getFuel(-55);
    }
}
