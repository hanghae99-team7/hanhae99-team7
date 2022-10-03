// Transport의 자식 class

public class Taxi extends Transport {           //상속
    int remainingSeats = 4;        //남은 좌석 재설정
    int distance;                  //거리 변수 추가

    public Taxi(int num) {       //Transport 생성자 호출
        super(num);
    } //super()은 부모 클래스의 생성자를 호출하는 메서드이다.
    //위와 같이 자식 클래스의 생성자 안에 써야하고, 반드시 첫 줄에 써야한다.

    //택시의 status="일반","운행중","운행불가"

    public void start(int number1, int number2) {

        if (number1 != number2) {            //차량번호 확인
            status = "일반";
            System.out.println("택시 " + 5678 + " 배차되었습니다.");
            System.out.println("택시 " + 1234 + " 배차되었습니다.");
            System.out.println("주유량 = " + this.oil);
            System.out.println("상태 = " + this.status);

            System.out.println();
        } else {
            System.out.println("같은 택시입니다.");
            System.out.println();
        }
    }

    public void Onboard(int person, String destination, int distance) {
        //탑승
    //overloading(1. method이름이 동일                    (동일하다)
    ////          2. 매개 변수의 개수나 혹은 type이 달라야함.(1개 -> 3개))
        if (status == "일반") {
            if (person <= 4) {      //최대 4명까지 탑승 가능
                this.inPassenger += person;
                this.remainingSeats -= person;
                this.status = "운행중";
                this.distance = distance;
                this.fee += 3000 + 1000 * (this.distance - 1);  //최초 기본주행거리=> 1km(기본요금)

                System.out.println("탑승 승객 수 = " + this.inPassenger);
                System.out.println("잔여 승객 수 = " + this.remainingSeats);
                System.out.println("기본 요금 확인 = " + 3000);
                System.out.println("목적지 = " + destination);
                System.out.println("목적지까지 거리 = " + this.distance + "km");
                System.out.println("지불할 요금 = " + this.fee);
                System.out.println("상태 = " + this.status);
                System.out.println();

            } else {
                System.out.println("최대 승객 수 초과");
                System.out.println();
            }
        } else {
            System.out.println("탑승 불가");
            System.out.println();
        }
    }


    public void pay() {
        // 결제
        if (status == "운행중") {
            if (oil < 10) {
                status = "운행불가";
                System.out.println("주유량 = " + this.oil);
                System.out.println("상태 = " + this.status);
                System.out.println("누적 요금 = " + this.fee);
                System.out.println("주유가 필요합니다.");
                System.out.println();
                // 운행 마치고 기름이 다 떨어졌을 때, 출력
            } else {
                this.status = "일반";
                System.out.println("주유량 = " + this.oil);
                System.out.println("누적 요금 = " + this.fee);
                System.out.println();
                //운행 마치고 출력
            }
            //결제완료 후 초기화
            this.fee = 0;
            this.remainingSeats = 4;
            this.inPassenger = 0;
            this.status = "일반";
            this.distance = 0;
        }
    }
}