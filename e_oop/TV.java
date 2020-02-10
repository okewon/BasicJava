package e_oop;

public class TV {
	boolean power = false;
	int channel = 5;
	int volume = 5;
	final int MIN_VOLUME = 0, MAX_VOLUME = 10;
	final int MIN_CHANNEL = 0, MAX_CHANNEL = 80; 
	
	//TV와 최대한 비슷하게 TV클래스를 만들어주세요
	void power(){
		power = !power;
		System.out.println("POWER : " + (power ? "ON" : "OFF"));
	}
	
	void volumeUp(){
		if(power){
			volume += volume > MIN_VOLUME && volume < MAX_VOLUME ? 1 : 0;
		}
		showCurrentStatus();
	}
	
	void volumeDown(){
		if(power){
			volume -= volume > MIN_VOLUME && volume < MAX_VOLUME ? 1 : 0;
		}
		showCurrentStatus();
	}
	
	void channelUP(){
		if(power){
			channel += channel > MIN_CHANNEL && channel < MAX_CHANNEL ? 1 : 0;
		}
		showCurrentStatus();
	}
	
	void channelDown(){
		if(power){
			channel -= channel > MIN_CHANNEL && channel < MAX_CHANNEL ? 1 : 0;
		}
		showCurrentStatus();
	}
	
	void showCurrentStatus(){
		System.out.println("현재 채널은 " + channel +"번 입니다.");
		System.out.print("현재 음량은 ");
		for(int i = MIN_VOLUME; i < MAX_VOLUME; i++){
			if(i < volume)
				System.out.print("■");
			else
				System.out.print("□");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TV tv = new TV();
		tv.power();
		tv.volumeUp();
		tv.volumeDown();
		tv.channelUP();
		tv.channelDown();
	}
}
