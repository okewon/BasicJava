import java.util.Scanner;


public class ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 문제1. arr배열의 모든 값을 더하는 프로그램을 작성하세요
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		System.out.println("sum = " + sum);
		
		//문제2. 5명의 이름을 입력받아 배열에 저장하는 프로그램을 작성하세요
		String[] name = new String[5];
		for(int i = 0; i < name.length; i++){
			System.out.print((i + 1) + "번째 사람의 이름을 입력하시오. >> ");
			name[i] = sc.nextLine();
		}
		
		for(int i = 0; i < name.length; i++){
			System.out.print(name[i] + "\t");
		}
		System.out.println();
		
		//문제3. score배열의 최대값, 최소값 구하기
		int[] score = { 79, 88, 97, 33, 100, 55, 95 };
		int max = score[0];
		int min = score[0];
		
		for(int i : score){
			if(max > i){
				max = max;
			}
			if(min > i){
				min = i;
			}
		}
		
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		//문제4. 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성하세요
		int sum1 = 0;
		float avg = 0.0f;
		int[][] arr2 = {{5,5,5,5,5},{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}};
		for(int i = 0; i < arr2.length; i++){
			for(int j = 0; j < arr2[i].length; j++){
				sum += arr2[i][j];
			}
		}
		avg = sum / (float) (arr2.length * arr2[0].length);
		System.out.println("arr2에 담긴 모든 값의 총합은 " + sum +", 평균은 " + avg + "입니다.");
		
		//문제5. answer 배열의 각 숫자의 갯수를 세어 count 배열에 넣고 count 배열의 각 숫자만큼씩 * 를 출력한다.
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		for(int i=0; i < answer.length;i++) {
			for(int j = 1; j <= 4; j++){
				if(answer[i] == j){
					counter[j - 1]++;
				}
			}
		}
		for(int i=0; i < counter.length;i++) {
			System.out.print(counter[i]);
			for(int j = 0; j < counter[i]; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//문제6. menu배열에서 메뉴이름과 가격 중 메뉴이름을 추출하는 프로그램을 작성하세요.
		String menu[] ={ "아메리카노 3000원", "카푸치노 4000원", "카페라떼 3500원"};
		for(int i = 0; i < menu.length; i++){
			String name2 = menu[i].substring(0, menu[i].indexOf(" "));
			System.out.print(name2 + "\t");
		}
		System.out.println();
		
		//문제7. str변수에서 java의 위치를 찾아 출력하는 프로그램을 작성하세요
		String str = "i Love java";
		int idx = str.indexOf("java");
		System.out.println(idx);		
		
		//문제8. s변수에서 lang 문자열을 추출하는 프로그램을 작성하세요
		String str10 = "java.lang.Object";
		String str11 = str10.substring(str10.indexOf("lang"), str10.indexOf("lang") + "lang".length());
		System.out.println(str11);
		
		//문제9. animals 변수에서 ,를 기준으로 문자열을 분리해서 3개의 단어로 각각 출력하는 프로그램을 작성하세요
		String animals = "dog,cat,bear";
		String[] str7 = new String[3];
		String arr5[] = animals.split(",");
		for (int i = 0; i < str7.length; i++){
			System.out.println(arr5[i]);
		}
		
		
		//문제10. str 문자열에서 ,을 .으로 바꾸어 출력하는 프로그램을 작성하세요
		String str4 = "java,lang,Object";
		String str5 = str4.replace(",", ".");
		System.out.println(str5);
		
	}

}
