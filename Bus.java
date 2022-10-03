package S.A;

public class Bus extends publictransport {
    //버스
    public void busmain(){
        passangermax = 30;
        variation = "운행";
        price =1000;
    }

    public void busin(){
        passangerin=2;
        passangermax=30-passangerin;
        price=passangerin*price;
    }
    public void oilout(){
        maxoil-=50;
    }
    public void busvariation(){
        variation= "차고지행";
    }
    public void oilplus(){
        maxoil+=10;
        variation = "운행중";
    }
    public void passangerplus(){
        passanger+=45;
        //alert호출
        if(passanger>30){
            System.out.println("최대 승객 수 초과");
        }
    }
    public void passangerplus2(){
        passangerin=5;
        passanger-=passangerin;
    }
    public void oilminus(){
        maxoil-=55;
        variation="차고지행";
        //alert 호출
        if(maxoil <10){
            System.out.println("주유 필요");
        }
    }
}
