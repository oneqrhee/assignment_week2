public class Bus extends Transport {
    int maxPassenger = 30;
    int presentPassenger;
    String busStatus = "운행";
    int fee;

    public Bus(int id) {
        this.id = id;
        System.out.println("a. 버스번호 = "+this.id);
    }

    public void getPassenger(int presentPassenger) {
        this.presentPassenger += presentPassenger;
        if (presentPassenger > maxPassenger) {
            this.presentPassenger -= presentPassenger;
            System.out.println("최대 승객 수 초과");
        } else {
            this.fee = this.presentPassenger * 1000;
            System.out.println("a. 탑승 승객 수 = " + this.presentPassenger);
            System.out.println("b. 잔여 승객 수 = " + (this.maxPassenger - this.presentPassenger));
            System.out.println("c. 요금 = " + this.fee);
        }
    }

    public void getFuel(int fuel) {
        this.fuel += fuel;
        if (this.fuel < 10) {
            this.busStatus = "차고지행";
        }
        System.out.println("a. 주유량 = " + this.fuel);
        System.out.println("b. 상태 = " + this.busStatus);
        if (this.fuel < 10) {
            System.out.println("주유 필요");
        }
    }

    public void changeTransportStatus(String busStatus) {
        if (busStatus.equals("운행") && this.fuel < 10) {
            this.busStatus = "차고지행";
            System.out.println("주유량을 확인해주세요");
        } else {
            this.busStatus = busStatus;
        }
    }
}
