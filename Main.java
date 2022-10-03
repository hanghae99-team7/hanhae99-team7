//버스 main


public class Main {
    public static void main(String[] args) {


        Bus bus1 = new Bus(165);        //bus1 생성, 고유번호 165
        Bus bus2 = new Bus(270);        //bus2 생성, 고유번호 270


//실행
        bus1.start(165,270);
        bus1.Onboard(2);
        bus1.oilChange(-50);
        bus1.statusChange();
        bus1.oilChange(10);
        bus1.statusChange();
        bus1.Onboard(45);
        bus1.Onboard(5);
        bus1.oilChange(-55);


    }
}