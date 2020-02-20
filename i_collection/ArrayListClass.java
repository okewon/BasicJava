package i_collection;

import java.util.ArrayList;

import d_array.Array;

public class ArrayListClass {
	
	public static void main(String[] args) {
		/*
		 *  add()		: 마지막 위치에 객체를 추가
		 *  get()		: 지정된 위치의 객체를 반환
		 *  set()		: 지정된 위치에 주어진 객체를 저장(수정)
		 *  remove()	: 지정된 위치의 객체를 제거
		 *  size()		: 저장된 객체의 수를 반환
		 */
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(10);
		list.add("ABC");
		list.add(true);
		list.add(new ArrayListClass());
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.add(1, "456");
		
		for(int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		}
		
		list2.remove(0);
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>(); //2차원 배열
		
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(10);
		list4.add(20);
		
		list3.add(list4);
		
		
		list4 = new ArrayList<>();
		list4.add(30);
		list4.add(40);
		
		list3.add(list4);
		
		//정수를 저장할 수 있는 ArrayList를 생성해 1 ~ 100사이의 랜덤한 값을 5번 저장해주세요
		
		ArrayList<Integer> list5 = new ArrayList<>();
		for(int i = 0 ; i < 5; i++){
			list5.add((int) (Math.random() * 101));
			System.out.println(list5.get(i));
		}
		
		//위에서 만든 ArrayList에 저장된 값들의 합계와 평균을 출력해주세요
		int sum = 0;
		float avg;
		for(int i = 0; i < list5.size(); i++){
			sum += list5.get(i);
		}
		
		avg = sum / (float) list5.size();
		System.out.println("합계 : " + sum + " 평균 : " + avg);
		
		//위에서 만든 ArrayList에 저장된 값들 중 최소값과 최대값을 출력해주세요
		int max = list5.get(0), min = list5.get(0);
		for(int i = 0; i < list5.size(); i++){
			if(max < list5.get(i))
				max = list5.get(i);
			
			if(min > list5.get(i))
				min = list5.get(i);
		}
		
		System.out.println("최대값 : " + max + " 최소값 : " + min);
	}
}
