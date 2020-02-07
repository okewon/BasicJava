package e_oop;

import java.util.Scanner;

public class SimliTest {
	Scanner sc = new Scanner(System.in);
	String answer, type = null;
	
	void Q1(){
		System.out.println("나는 금사빠다");
		answer = sc.nextLine();
		if(answer.equals("y"))
			Q2();
		else
			Q4();
	}
	
	void Q2(){
		System.out.println("연애할 때 끌려다니는 타입이다.");
		answer = sc.nextLine();
		if(answer.equals("y"))
			Q5();
		else
			Q3();
	}
	
	void Q3(){
		System.out.println("데이터 코스는 미리 짜는게 편하다.");
		answer = sc.nextLine();
		if(answer.equals("y"))
			Q6();
		else
			Q5();
	}
	
	void Q4(){
		System.out.println("감정기복이 크지 않다.");
		answer = sc.nextLine();
		if(answer.equals("y"))
			Q7();
		else
			Q5();
	}
	
	void Q5(){
		System.out.println("감정 표현에 솔직한 편이다");
		answer = sc.nextLine();
		if(answer.equals("y"))
			Q8();
		else
			Q6();
	}
	
	void Q6(){ 
		System.out.println("활동적인 데이트가 좋다.");
		answer = sc.nextLine();
		if(answer.equals("y"))
			Q8();
		else
			Q9();
	}
	
	void Q7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다.");
		answer = sc.nextLine();
		if(answer.equals("y"))
			type = "A";
		else
			Q8();
	}
	
	void Q8(){
		System.out.println("이성친구는 존재할 수 없다.");
		answer = sc.nextLine();
		if(answer.equals("y"))
			Q9();
		else
			type = "B";
	}
	
	void Q9(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		answer = sc.nextLine();
		if(answer.equals("y"))
			type = "D";
		else
			type = "C";
	}
	
	void showType(String typeResult){
		if(typeResult.equals("A"))
			System.out.println("서로에 대한 신뢰감이 깊고 존중해주는 어른스러운 연애를 하는 타입!");
		else if(typeResult.equals("B"))
			System.out.println("구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
		else if(typeResult.equals("C"))
			System.out.println("이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
		else
			System.out.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
	}
	
	public static void main(String[] args) {
		SimliTest simli = new SimliTest();
		
		simli.Q1();
		String type = simli.type;
		System.out.println("당신은 " + type +"형입니다!");
		simli.showType(type);
		
		
	}
}
