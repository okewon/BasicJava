package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		
		String str = "수박수박수박수박수박수박수박";
		System.out.println(str.substring(0, 5));
		/*
		 *  << 정렬 >>
		 *  - 선택 정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은 수와 자리 바꾸기를 반복해
		 *  	앞에서부터 작은 수를 채워나가는 방식
		 *  - 버블 정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리 바꾸기를 반복해
		 *  	뒤에서부터 큰 수를 채워나가는 방식
		 *  - 삽입 정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고 중간에 삽입하는 방식
		 *  
		 *  - 석차 구하기 : 모든 정수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 */
		
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = i + 1;
		}
		
		shuffle(numbers);
		System.out.println("Shuffle : " + Arrays.toString(numbers)); //정렬 전
		
		shuffle(numbers);
		printRank(numbers);
//		System.out.println("print Rank : " + Arrays.toString(numbers));
		
		shuffle(numbers);
		System.out.println("Before Select Sort : " + Arrays.toString(numbers));
		selectSort(numbers);
		System.out.println("After Select Sort : " + Arrays.toString(numbers));
		
		shuffle(numbers);
		System.out.println("Before Bublle Sort : " + Arrays.toString(numbers));
		bubbleSort(numbers);
		System.out.println("After Bublle Sort : " + Arrays.toString(numbers)); //정렬 후
		
		shuffle(numbers);
		System.out.println("Before Insert Sort : " + Arrays.toString(numbers));
		insertSort(numbers);
		System.out.println("After Insert Sort : " + Arrays.toString(numbers));
		
		
	}

	private static void insertSort(int[] numbers) {
		// TODO Auto-generated method stub
		for(int i = 1; i < numbers.length; i++){
			int temp = numbers[i];
			int j = 0;
			for(j = i - 1; j >= 0; j--){
				if(temp < numbers[j]){
					numbers[j + 1] = numbers[j];
				} else{
					break;
				}
			}
			numbers[j + 1] = temp;
		}
	}

	private static void bubbleSort(int[] numbers) {
		// TODO Auto-generated method stub
		int temp;
		
		for(int i = 0 ; i < numbers.length - 1 ; i ++) {
			boolean changed = false;
			for(int j = 0 ; j < numbers.length -i -1 ; j ++) {
				if(numbers[j]>numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					changed = true;
				}
			}
//			if(changed){
//				break;
//			}
		}
	}

	private static void selectSort(int[] numbers) {
		// TODO Auto-generated method stub
		int temp, n = 0;
		
		for(int i = 0 + n; i < numbers.length; i++){
			for(int k = 0; k < numbers.length; k++){
				if(numbers[k] > numbers[i]){
					temp = numbers[i];
					numbers[i] = numbers[k];
					numbers[k] = temp;
				}
			}
			n++;
		}
	}

	private static void printRank(int[] numbers) {
		// TODO Auto-generated method stub
		int[] rank = new int[10];
		
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}
		
		for(int i = 0; i < numbers.length; i++ ){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] < numbers[j]){
					rank[i]++;
				}
			}
		}
		
		for(int i = 0; i < rank.length; i++){
			System.out.println(numbers[i] + " : " + rank[i] + "등");
		}
	}

	private static void shuffle(int[] numbers) {
		// TODO Auto-generated method stub
		for(int i = 0; i < numbers.length; i++){
			int random = (int) (Math.random() * numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
	}

}
