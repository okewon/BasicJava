package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 *  << OOP(Object Oriented Programming) : 객체지향 프로그래밍 >>
		 *  - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체 간의 상호작용으로 보는 것.
		 *  - 코드의 재사용성이 높고 유지보수가 용이하다.
		 *  
		 *  << 객체 생성(인스턴스화) >>
		 *  - 클래스를 사용하기 위해 메모리(Heap영역)에 올려 놓은 것.
		 *  - new 클래스명(); -> 객체가 저장된 메모리 주소 반환
		 *  - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메소드에 접근할 수 있다.
		 *  - 객체는 생성될 때 마다 새로운 객체가 생성되고, 여러 개의 객체가 동시에 존재할 수 있다.
		 */
		
		SampleClass sc = new SampleClass();
		sc.method1();
		sc.method2(5);
		String returnString = sc.method3();
//		String returnString = "명령 수행 후 결과물을 돌려주는 메소드";
		System.out.println(returnString);
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		sc.flowTest1(); //호출했을 때 출력되는 문장에 번호를 붙여주세요
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요
		//객체가 저장된 변수를 통해 메소드들을 호출해주세요
		//파라미터가 있는 메소드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메소드는 리턴한 값을 출력해주세요
		
		ClassMaker maker = new ClassMaker();
		maker.method();
		String str = maker.returnString();
		System.out.println(str);
		maker.nonRetrun("Hello World");
		int multiply = maker.returnInt(2, 45);
		System.out.println(multiply);
		
		//다음을 한줄씩 계산해서 최종 결과 값을 출력해주세요
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		Calculator cal = new Calculator();
		long plusResult = cal.plus(123456, 654321);
		long multiplyResult = cal.multiply(plusResult, 123456);
		long divisionResult = (int) cal.division(multiplyResult, 123456);
		long minusResult = cal.minus(divisionResult, 654321);
		long remainderResult = cal.remainder(minusResult, 123456);
		
		System.out.println(plusResult);
		System.out.println(multiplyResult);
		System.out.println(divisionResult);
		System.out.println(minusResult);
		System.out.println(remainderResult);
	}

}
