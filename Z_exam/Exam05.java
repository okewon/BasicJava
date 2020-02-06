package Z_exam;

public class Exam05 {

	public static void main(String[] args) {
		
//		[5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.
//		a. int[] arr[];				※ a,b
//		b. int[] arr = {1,2,3,};
//		c. int[] arr = new int[5];
//		d. int[] arr = new int[5]{1,2,3,4,5};
//		e. int arr[5];
//		f. int[] arr[] = new int[3][];
		
//		[5-2] 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
//		int[][] arr = {				※ arr[3].length = 2
//		{ 5, 5, 5, 5, 5},
//		{ 10, 10, 10},
//		{ 20, 20, 20, 20},
//		{ 30, 30}
//		};
		
//		[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
//		[연습문제]/ch5/Exercise5_3.java
//			class Exercise5_3 {
//				public static void main(String[] args){
//					int[] arr = {10, 20, 30, 40, 50};
//					int sum = 0;
//					for(int i = 0; i < arr.length; i++){
//						sum += arr[i];
//					}
//					System.out.println("sum="+sum);
//				}
//			}
//		[실행결과]
//		sum=150
		
//		[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
//		[연습문제]/ch5/Exercise5_4.java
//			class Exercise5_4 {
//				public static void main(String[] args) {
//					int[][] arr = {
//					{ 5, 5, 5, 5, 5},
//					{10,10,10,10,10},
//					{20,20,20,20,20},
//					{30,30,30,30,30}
//					};
//					int i;
//					int total = 0;
//					float average = 0;
//					for(i = 0; i < arr.length; i++){
//						for(int j = 0; j < arr[i].length; j++){
//							total += arr[i][j];
//						}
//					}
//					
//					average = total / (float) (arr.length * arr[i].length);
//					System.out.println("total="+total);
//					System.out.println("average="+average);
//				} // end of main
//			} // end of class
//		[실행결과]
//		total=325
//		average=16.25
		
//		[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
//		로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//		[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
//		[연습문제]/ch5/Exercise5_5.java
//			class Exercise5_5 {
//				public static void main(String[] args) {
//					int[] ballArr = {1,2,3,4,5,6,7,8,9};
//					int[] ball3 = new int[3];
//					// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
//					for(int i=0; i< ballArr.length;i++) {
//						int j = (int)(Math.random() * ballArr.length);
//						int tmp = 0;
//						
//						tmp = ballArr[j];
//						ballArr[j] = ballArr[i];
//						ballArr[i] = tmp;
//					}
//					for(int i = 0; i < ball3.length; i++){
//						ball3[i] = ballArr[i];
//					}
//					for(int i=0;i<ball3.length;i++) {
//						System.out.print(ball3[i]);
//					}
//				} // end of main
//			} // end of class
//		[실행결과]
//		486
					
//		[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
//		단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
//		[연습문제]/ch5/Exercise5_6.java
//			class Exercise5_6 {
//				public static void main(String args[]) {
//					int[] coinUnit = {500, 100, 50, 10};
//					int[] needCoin = new int[4];
//					
//					int money = 2680;
//					System.out.println("money = " + money);
//					
//					for(int i = 0; i < coinUnit.length; i++){
//						needCoin[i] = money / coinUnit[i];
//						money %= coinUnit[i];
//					}
//					
//					for(int i = 0; i < needCoin.length; i++){
//						System.out.println(coinUnit[i] + "원 : " + needCoin[i]);
//					}
//				} // main
//			}
//		
//		[실행결과]
//		money=2680
//		500원: 5
//		100원: 1
//		50원: 1
//		10원: 3
		
//		[5-7] 문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄
//		금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
//		돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을 지불
//		한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣
//		어서 프로그램을 완성하시오.
//		[연습문제]/ch5/Exercise5_7.java
//			class Exercise5_7 {
//				public static void main(String args[]) {
//					if(args.length!=1) {
//						System.out.println("USAGE: java Exercise5_7 3120");
//						System.exit(0);
//					}
//					// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
//					int money = Integer.parseInt(args[0]);
//					System.out.println("money="+money);
//					int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
//					int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
//					for(int i=0;i<coinUnit.length;i++) {
//						int coinNum = 0;
//						/* (1) 아래의 로직에 맞게 코드를 작성하시오.
//						1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
//						2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
//						(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
//						3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
//						*/
//						System.out.println(coinUnit[i]+"원: "+coinNum);
//					}
//					if(money > 0) {
//						System.out.println("거스름돈이 부족합니다.");
//						System.exit(0); // 프로그램을 종료한다.
//					}
//					System.out.println("=남은 동전의 개수 =");
//					for(int i=0;i<coinUnit.length;i++) {
//						System.out.println(coinUnit[i]+"원:"+coin[i]);
//					}
//				} // main
//			}
//		C:\jdk1.8\work\ch5>java Exercise5_7
//		USAGE: java Exercise5_7 3120
//		C:\jdk1.8\work\ch5>java Exercise5_7 3170
//		money=3170
//		500원: 5
//		100원: 5
//		50원: 3
//		10원: 2
//		=남은 동전의 개수 =
//		500원:0
//		100원:0
//		50원:2
//		10원:3
//		C:\jdk1.8\work\ch5>java Exercise5_7 3510
//		money=3510
//		500원: 5
//		100원: 5
//		50원: 5
//		10원: 5
//		거스름돈이 부족합니다.
		
//		[5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
//		[연습문제]/ch5/Exercise5_8.java
//			class Exercise5_8 {
//				public static void main(String[] args) {
//					int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
//					int[] counter = new int[4];
//					for(int i=0; i < answer.length;i++) {
//						
//					}
//					for(int i=0; i < counter.length;i++) {
//						/*
//						(2) 알맞은 코드를 넣어 완성하시오.
//						*/
//						System.out.println();
//					}
//				} // end of main
//			} // end of class
//		
//		[실행결과]
//		3***
//		2**
//		2**
//		4****	
					

	}

}
