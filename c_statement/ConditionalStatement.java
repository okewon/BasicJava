package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 *  << if문 >>
		 *  - if		: 조건식의 결과가 true이면 블럭 안의 문장을 수행한다.
		 *  - else if	: 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 *  - else		: 결과가 true이면 조건식이 하나도 없는 경우를 위해 추가한다.
		 */
		
		int a = 10;
		
		if(a < 100){
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a < 10){
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}
		
		int regNo = 3;	//주민등록번호 뒷자리
		String gender = null;
		
		if(regNo == 1){
			gender = "남자";
		} else if(regNo == 2){ //if 블럭 뒤에 else if로 조건을 추가할 수 있다.
			gender = "여자";
		} else if(regNo == 3){
			gender = "남자";
		} else if(regNo == 4){
			gender = "여자";
		} else{ //true인 조건식이 하나도 없을 때 수행된다.
			gender = "확인불가";
		}
		
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		regNo = 1;
		gender = null;
		//수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합할 수 잇다.
		if(regNo == 1 || regNo ==3) //수행할 내용이 한문장일 경우 블럭을 생략할 수 있다.
			gender = "남자";
		else if(regNo == 2 || regNo == 4)
			gender = "여자";
		else //true인 조건식이 하나도 없을 때 수행된다.
			gender = "확인불가";
		
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		//성적에 등급을 부여하는 프로그램
		int score = 88;
		String grade = null;
		
		if(score <= 100 && score >= 90)
			grade = "A";
		else if(score < 90 && score >= 80)
			grade = "B";
		else if(score < 80 && score >= 70)
			grade = "C";
		else if(score < 70 && score >= 60)
			grade = "D";
		else if(score >= 0 && score < 60)
			grade = "F";
		else
			grade = "범위 밖의 점수";
		
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		score = 100;
		grade = null;
		
		if(90 <= score){
			grade = "A";
			if(97 <= score){
				grade += "+";
			} else if(score <= 93){
				grade += "-";
			} else{
				grade += "0";
			}
		} else if(score >= 80){
			grade = "B";
			if(87 <= score){
				grade += "+";
			} else if(score <= 83){
				grade += "-";
			} else{
				grade += "0";
			}
		}  else if(score >= 70){
			grade = "C";
			if(77 <= score){
				grade += "+";
			} else if(score <= 73){
				grade += "-";
			} else{
				grade += "0";
			}
		}  else if(score >= 60){
			grade = "D";
			if(67 <= score){
				grade += "+";
			} else if(score <= 63){
				grade += "-";
			} else{
				grade += "0";
			}
		} else{
			grade = "F";
		}
		
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		/*
		 *  << switch문 >>
		 *  - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 *  - 조건식의 결과는 정수의 문자열(JDK1.7부터 문자열 허용) 허용한다.
		 */
		
		regNo = 5;
		gender = null;
		
		switch(regNo){
		case 1:
		case 3:
			gender = "남자";
			break;	//break를 만나명 switch문을 빠져나간다.
		case 2:
		case 4:
			gender = "여자";
			break;
		default:	//if문의 else와 같은 역할을 한다.
			gender = "확인 불가";
		}
		
		System.out.println("당신의 성별은 " + gender + "입니다.");
		
		score = 100;
		grade = null;
		switch(score / 10){
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오. >> ");
		num = sc.nextInt();
		if(num == 0)
			System.out.println(num + "은 숫자 0입니다.");
		else
			System.out.println(num + "은 숫자 0이 아닙니다.");
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		int num2;
		System.out.print("숫자를 입력하시오. >> ");
		num2 = sc.nextInt();
		if(num2%2==0)
			System.out.println(num2 + "은 짝수입니다.");
		else
			System.out.println(num2 + "은 홀수입니다.");
		
		//두개의 숫자를 입력받아 더 큰 숫자를 출력해주세요
		int num3, num4;
		System.out.print("숫자 두개를 입력하시오. >> ");
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		if(num3>num4)
			System.out.println(num3 +"와 " + num4 + " 중 더 큰 수는 " + num3 + "이다.");
		else if(num4>num3)
			System.out.println(num3 +"와 " + num4 + " 중 더 큰 수는 " + num4 + "이다.");
		else
			System.out.println(num3 +"와 " + num4 + "는 같다.");
		
		//세개의 숫자를 입력받아 가장 큰 숫자를 출력해주세요.
		int num5, num6, num7;
		System.out.print("숫자 세개를 입력하시오. >> ");
		num5 = sc.nextInt();
		num6 = sc.nextInt();
		num7 = sc.nextInt();
		
		if(num5 > num6 && num5 > num7)
			System.out.println("1. 가장 큰 수는 " + num5 + "입니다.");
		if(num6 > num5 && num6 > num7)
			System.out.println("2. 가장 큰 수는 " + num6 + "입니다.");
		if(num7 > num5 && num7 > num6)
			System.out.println("3. 가장 큰 수는 " + num7 +"입니다.");
		
	}
	
}
