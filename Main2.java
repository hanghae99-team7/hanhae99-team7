//택시 main

public class Main2 {
    public static void main(String[] args) {

        Taxi taxi1 = new Taxi(5678);        //taxi1 생성, 고유번호 5678
        Taxi taxi2 = new Taxi(1234);        //taxi2 생성, 고유번호 1234


//실행
        taxi1.start(5678,1234);
        taxi1.Onboard(2,"서울역",2);
        taxi1.oilChange(-80);
        taxi1.pay();
        taxi1.Onboard(5,"",0);
        taxi1.Onboard(3,"구로디지털단지역",12);
        taxi1.oilChange(-20);
        taxi1.pay();

    }
}
