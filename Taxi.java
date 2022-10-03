package S.A;

public class Taxi extends publictransport {

    //택시
    public void taximain(){
        passangermax = 4;
        mainpay = 3000;
        pathkm = 1;
        paykm = 1000;
        maxoil = 100;
        variation = "일반";
        speed = 0;
    }
    public void taxion(){
        passangerin=2;
        passangermax-= passangerin;
        mainpay=3000;
        path = "서울역";
        pathkm= 2;
        finpay = 4000;
        variation="운행중";
    }
    public void payon(){
        maxoil-=80;
        finpay=4000;
    }
    public void passmax(){
        passanger=5;
        //alert 호출
        if (passanger > 4){
            System.out.println("최대 승객 수 초과");
        }
    }
    public void taxion2(){
        passangerin=3;
        passangermax-= passangerin;
        mainpay=3000;
        path = "구로디지털단지역";
        pathkm= 12;
        finpay = 14000;
        variation="운행중";
    }
    public void minusoil(){
        maxoil=0;
        variation="운행불가";
        finpay = 18000;
        //alert 호출
        if (maxoil==0){
            System.out.println("주유 필요");
        }
    }



}
