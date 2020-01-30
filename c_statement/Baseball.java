package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		int num1 = (int) (Math.random()*9)+1, 
				num2 = (int) (Math.random()*9)+1,
				num3 = (int) (Math.random()*9)+1;
		int out = 0,strike = 0,ball = 0;
		int answer1 = 0, answer2 = 0, answer3 = 0;
		int count = 0;
		Scanner s = new Scanner(System.in);


		do{
			System.out.print("숫자 세개를 입력해주세요. >> ");
			answer1 = Integer.parseInt(s.nextLine());
			answer2 = Integer.parseInt(s.nextLine());
			answer3 = Integer.parseInt(s.nextLine());


			if(num1 == answer1){
				strike++;
			}else if(num1 == answer2 || num1 == answer3){
				ball++;
			}else{
				out++;
			}

			if(num2 == answer2){
				strike++;
			}else if(num2 == answer1 || num2 == answer3){
				ball++;
			}else{
				out++;
			}

			if(num3 == answer3){
				strike++;
			}else if(num3 == answer1 || num3 == answer2){
				ball++;
			}else{
				out++;
			}
			if(strike == 3){
				System.out.println(++count + "회 시도하셨습니다!");
				System.out.println("정답은 " + num1 + ", " + num2 + ", " + num3 + "입니다.");
				break;
			} else{
				System.out.println(strike + "S " + ball +"B " + out + "O");
			}
			
			strike = 0;
			ball = 0;
			out = 0;
			count++;
		} while(strike != 3);
		System.out.println(num1 + ", " + num2 + ", " + num3);
	}

}
