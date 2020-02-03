package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 *  << 배열 >>
		 *  - int[] number = new int[5];
		 *  - int[] number = new int[]{10, 20, 30, 40, 50};
		 *  - int[] number = {10, 20, 30, 40, 50};
		 */
		
		//배열은 참조형 타입입니다.
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 변환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장된다.
		
		System.out.println(array);
		
		System.out.println(array[0]); //실제 값에 접근하기 위해서는 index를 지정해줘야 한다.
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int의 최대값(약 20억)이다.
		
		
		String arrayStr = Arrays.toString(array); //배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int[]{1, 2, 3}; //값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = {1, 2, 3}; //선언과 초기화를 동시에 해야한다.
		int[] iArray3;
//		iArray3 = {1, 2, 3}; //컴파일 에러 발생
		
		array[0] = 10; //인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
//		array[5] = 60; 	//ArrayIndexOutOfBoundsException 발생
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int[] iArray4 = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		System.out.println(Arrays.toString(iArray4));
		
		//모든 인덱스에 있는 값을 변경해주세요.
		iArray4[0] = 100;
		iArray4[1] = 90;
		iArray4[2] = 80;
		iArray4[3] = 70;
		iArray4[4] = 60;
		iArray4[5] = 50;
		iArray4[6] = 40;
		iArray4[7] = 30;
		iArray4[8] = 20;
		iArray4[9] = 10;
		System.out.println(Arrays.toString(iArray4));
		
		//모든 인덱스에 있는 값을 더해주세요.
		int sum = 0;
		sum = iArray4[0] + iArray4[1] + iArray4[2] + iArray4[3] + iArray4[4] + iArray4[5] + iArray4[6] + iArray4[7] + iArray4[8] + iArray4[9];
		System.out.println(sum);
		
		for(int i : iArray4){
			sum += i;
		}
		
		System.out.println(sum);
		
		for(int i = 0; i < iArray4.length; i++){
			System.out.println(iArray4[i]);
		}
		
		for(int i = 0; i < iArray4.length; i++){
			iArray4[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(iArray4));
		
		//배열에 숫자를 저장하고 합계와 평균을 구해보자
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int) (Math.random() * 100) + 1;
		}
		
		System.out.println(Arrays.toString(numbers));
		
		sum = 0;
		for(int i : numbers){
			sum += i;
		}
		
		System.out.println("합계 : " + sum + ", 평균 : " + sum / (double) numbers.length);
		
		//향상된 for문
		for(int number : numbers){ //배열에 있는 값을 차례대로 변수에 넣는다.
			System.out.println(number);
		}
		
		for(int number : numbers){
			number = 0; //numbers의 값은 변경되지 않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));
		
		//배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요
		int max = numbers[0], min = numbers[0];
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] < min)
				min = numbers[i];
			
			if(numbers[i] > max)
				max = numbers[i];
		}
		
		System.out.println("최대값은 " + max + " 최소값은 " + min);
		
		int[] shuffle = new int[30];
		for(int i = 0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		System.out.println("Before Shuffle : " + Arrays.toString(shuffle));
		
		int bucket;
		for(int i : shuffle){
			int random1 = (int) (Math.random()*shuffle.length);
			bucket = shuffle[0];
			shuffle[0] = shuffle[random1];
			shuffle[random1] = bucket;
		}
		System.out.println("After Shuffle : " + Arrays.toString(shuffle));
		
		
		//1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요
		int[] cnt = new int[10];
		int[] iArray5 = new int[500];
		for(int i = 0; i < 500; i++){
			iArray5[i] = (int) (Math.random() * 10) + 1;
		}
		
		for(int i : iArray5){
			if(i == 1)
				cnt[0]++;
			else if(i == 2)
				cnt[1]++;
			else if(i == 3)
				cnt[2]++;
			else if(i == 4)
				cnt[3]++;
			else if(i == 5)
				cnt[4]++;
			else if(i == 6)
				cnt[5]++;
			else if(i == 7)
				cnt[6]++;
			else if(i == 8)
				cnt[7]++;
			else if(i == 9)
				cnt[8]++;
			else if(i == 10)
				cnt[9]++;
		}
		System.out.println(Arrays.toString(cnt));
		
		Scanner s = new Scanner(System.in);
		//위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요
		System.out.println("최대값과 최솟값, 반복횟수를 입력하시오. >> ");
		max = Integer.parseInt(s.nextLine());
		min = Integer.parseInt(s.nextLine());
		int repeatCnt = Integer.parseInt(s.nextLine());
		int[] cnt2 = new int[max-min + 1];
		
		for(int i = 0; i < repeatCnt; i++){
			int random = (int) (Math.random() * max - min + 1) + min;
			cnt2[random - min]++;
		}
		System.out.println(Arrays.toString(cnt2));
		
		
	}
}
