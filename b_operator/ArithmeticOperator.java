package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * << 산술 연산자 >>
		 * - + : 더하기
		 * - - : 빼기
		 * - * : 곱하기
		 * - / : 나누기
		 * - % : 나머지
		 * - 이항 연산자는 양쪽의 피연산자의 타입이 일치해야 연산이 가능하다.
		 */
		int a = 10+20-10*5/10%2;
		//*, /, % 연산자가 +, - 보다 연산의 우선순위가 높다.
		//우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
		System.out.println(a);
		
		double d = 10 + 20.3;
		System.out.println(d);
		//피연산자의 타입이 서로 다를 경우 표현범위가 큰 쪽으로 형변화 후 연산이 수행된다.
		// 따라서 연산의 결과도 표현범위가 큰 쪽의 타입이 된다.
		
		byte b = 10;
		short c = 20;
		
		a = c - b;
		//4byte보다 작은 정수 타입은 4byte(int)로 형변환 후 연산이 수행된다.
		
		long e1 = 1000000 *1000000;
		System.out.println(e1);	//오버플로우 발생
		long e2 = 1000000 * 1000000L; //피연산자 중 하나는 long이어야 결과로 long을 얻는다.
		System.out.println(e2);
		
		double f1 = 10/4;
		System.out.println(f1);	
		double f2 = 10/4.0;
		System.out.println(f2);
		int f3 = 10%4;	//10을 4로 나눈 나머지
		System.out.println(f3);
		
		//정수는 0으로 나눌 수 없다.
//		int g1 = 10/0;
//		System.out.println(g1); //런타임 에러 발생
		float g2 = 10.0f/0;
		System.out.println(g2);
		float g3 = 0/0f;
		System.out.println(g3); //NaN : Not a Number
		
		int h1 = 'A'+1;
		System.out.println(h1);
	}

}
