package e_oop;

public class AirConditioner {
	boolean power; //전원
	int temperature; //온도
	int airVolume; //풍량
	final int MAX_TEMPERATURE = 30;
	final int MIN_TEMPERATURE = 18;
	
	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//전원 버튼
	void power(){
		power = !power;
		System.out.println("POWER : " + ( power ? "ON" : "OFF"));
	}
	
	//온도 + 버튼
	void temperatureUp(){
		if(power){
			temperature += temperature < MAX_TEMPERATURE && temperature > MIN_TEMPERATURE ? 1 : 0;
		}
		showCurrentStatus();
	}
	
	//온도 - 버튼
	void temperatureDown(){
		if(power){
			temperature -= temperature < MAX_TEMPERATURE && temperature > MIN_TEMPERATURE ? 1 : 0;		
		}
		showCurrentStatus();
	}
	
	//풍량 버튼
	void airVolume(){
		if(power){
			if( 3 < ++airVolume){
				airVolume = 1;
			}
		}
		showCurrentStatus();
	}
	
	void showCurrentStatus(){
		System.out.println("현재 설정 온도  : " + temperature);
		System.out.println("현재 설정 풍량 : " + airVolume);
	}
	
	//온도가 18 ~ 30 까지만 변경할 수 있게 해주시고,
	//전원을 켰을 때만 버튼들이 작동되도록 메소드들을 변경해주세요.
	
	public static void main(String[] args) {
		AirConditioner air = new AirConditioner();
		air.power();
		air.power();
		air.power();
		air.temperatureUp();
		air.temperatureDown();
		air.airVolume();
	}
}
