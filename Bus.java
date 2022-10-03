// Transport의 자식 class

public class Bus extends Transport {           //상속
    int remainingSeats = 30;        //남은 좌석 재설정(30좌석)


    public Bus(int num) {       //Transport 생성자 호출
        super(num);
    } //super()은 부모 클래스의 생성자를 호출하는 메서드이다.
    //위와 같이 자식 클래스의 생성자 안에 써야하고, 반드시 첫 줄에 써야한다.

    public void start(int number1, int number2) {
// 버스 운행 시작
        if (number1 != number2) {       //차량번호 확인
            System.out.println("버스 " + 165 + "번이 배차되었습니다.");
            System.out.println("버스 " + 270 + "번이 배차되었습니다.");
            System.out.println();
            status = "운행중";
        } else {
            System.out.println("같은 버스입니다..");
            System.out.println();
        }
    }

@Override
//overriding : 부모 class로부터 상속받은 method를 똑같이 자식 class에 정의하는 것.
//             즉, 덮어버리는것. 부모에 있던 원래 함수의 내용은 없는 셈 치게 된다.
    public void Onboard(int person) {
        //탑승
        if (status == "운행중") {
            if (person <= 30) {      //최대 30명까지 탑승 가능
                this.inPassenger += person;
                this.remainingSeats -= person;
                this.fee += 1000 * person;      //인당 1000원
                System.out.println("탑승 승객 수 = " + this.inPassenger);
                System.out.println("잔여 승객 수 = " + this.remainingSeats);
                System.out.println("요금 확인 = " + this.fee);
                System.out.println();

            } else {
                System.out.println("최대 승객 수 초과");
                System.out.println();
            }
        }
    }
@Override
    public void oilChange(int amount) {
        this.oil += amount;
        if(amount < 0){     //기름을 썼을 때
            if (this.oil < 10) {
                status = "차고지행";
                System.out.println("주유량 = " + oil);
                System.out.println("상태 = " + status);
                System.out.println("주유가 필요합니다.");
                System.out.println();
                //기름이 다 떨어졌을 때, 차고지행으로 상태변경 및 정보 출력
            }else{
                System.out.println("주유량 = " + oil);
                System.out.println();
                //남은 기름 표시
            }
        }else{      //기름을 넣을 때
            System.out.println("상태 = " + status);
            System.out.println("주유량 = " + oil);
            System.out.println();
        }
    }



    public void statusChange() {
        // 상태변경, status="운행중","차고지행"
        if (status == "차고지행") {
            if (oil >= 10) {
                status = "운행중";

            } else {        // 차고지로 가는 경우, 승객 모두 하차
                status = "차고지행";
                this.inPassenger=0;
                this.remainingSeats=30;
                this.fee=0;
            }
        } else {        // 차고지로 가는 경우, 승객 모두 하차
            status = "차고지행";
            this.inPassenger=0;
            this.remainingSeats=30;
            this.fee=0;
        }
    }
}
