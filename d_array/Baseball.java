package d_array;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		int[] answer = new int[3];
		int[] userAnswer = new int[3];
		int strike = 0, out = 0, ball = 0;
		Scanner sc = new Scanner(System.in);
		int count = 0;

		for(int i = 0; i < answer.length; i++){
			answer[i] = (int) (Math.random() * 9) + 1;
		}

		do{
			answer[1] = (int) (Math.random()*9)+1;
		}while(answer[0] ==  answer[1] || answer[1] == answer[2]);

		do{
			answer[2] = (int) (Math.random()*9)+1;
		}while(answer[0] ==  answer[1] || answer[1] == answer[2]);

		do{
			for(int i = 0; i < userAnswer.length; i++){
				System.out.println((i + 1) + "번째 수를 입력하세요.");
				userAnswer[i] = Integer.parseInt(sc.nextLine().trim());   
			}

			if(userAnswer[0] == answer[0]){
				strike++;
			}else if(userAnswer[0] == answer[1] || userAnswer[0] == answer[2]){
				ball++;
			} else {
				out++;
			}

			if(userAnswer[1] == answer[1]){
				strike++;
			}else if(userAnswer[1] == answer[0] || userAnswer[1] == answer[2]){
				ball++;
			} else {
				out++;
			}

			if(userAnswer[2] == answer[2]){
				strike++;
			}else if(userAnswer[2] == answer[0] || userAnswer[2] == answer[0]){
				ball++;
			} else {
				out++;
			}

			if(strike == 3){
				System.out.println(++count + "회 시도하셨습니다!");
				System.out.print("정답은 ");
				for(int i = 0; i < answer.length; i++){
					System.out.print(answer[i] + "\t");
				}
				System.out.println("입니다.");
				break;
			} else{
				System.out.println(strike + "S " + ball +"B " + out + "O");
			}


			count++;
			out = 0;
			strike = 0;
			ball = 0;
		}while(strike != 3);
	}

}
