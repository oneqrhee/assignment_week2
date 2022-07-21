public class Taxi extends Transport {
    String toGo;
    int distance;
    int defaultDistance = 1;
    int defaultFee = 3000;
    int feePerKm = 1000;
    int maxPassenger = 4;
    String taxiStatus = "일반";
    int totalFee;

    public Taxi(int id) {
        this.id = id;
        System.out.println("a. 택시번호 = " + this.id);
        System.out.println("b. 주유량 = " + this.fuel);
        System.out.println("c. 상태 = " + this.taxiStatus);
    }

    public void getPassenger(int passenger, String toGo, int distance) {
        if (passenger > maxPassenger) {
            System.out.println("최대 승객 수 초과");
        } else {
            this.taxiStatus = "운행중";
            this.toGo = toGo;
            this.distance = distance;
            int fee;
            if (this.distance <= 1) {
                fee = defaultFee;
            } else {
                fee = defaultFee + (this.distance - defaultDistance) * feePerKm;
            }
            this.totalFee += fee;
            System.out.println("a. 탑승 승객 수 = " + passenger);
            System.out.println("b. 잔여 승객 수 = " + (maxPassenger - passenger));
            System.out.println("c. 기본 요금 확인 = " + defaultFee);
            System.out.println("d. 목적지 = " + this.toGo);
            System.out.println("e. 목적지까지의 거리 = " + this.distance + "km");
            System.out.println("f. 지불할 요금 = " + fee);
            System.out.println("g. 상태 = " + this.taxiStatus);
        }
    }

    public void getFuel(int fuel) {
        this.fuel += fuel;
        if (this.fuel <= 0) {
            this.taxiStatus = "운행불가";
        }
    }

    public void payment() {
        if (!this.taxiStatus.equals("운행불가")) {
            this.taxiStatus = "일반";
        }
        System.out.println("a. 주유량 = " + this.fuel);
        System.out.println("b. 상태 = " + this.taxiStatus);
        System.out.println("c. 누적 요금 = " + this.totalFee + "원");
        if (this.taxiStatus.equals("운행불가")) {
            System.out.println("주유 필요");
        }
    }
}
