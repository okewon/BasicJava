package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		String answer = null;
		String type = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("나는 금사빠다 \n금방 사랑에 빠진다.(y/n) ");
		answer = sc.nextLine();

		if(answer.equals("y") || answer.equals("Y")){
			System.out.println("연애할 때 끌려다니는 타입이다.(y/n) ");
			answer = sc.nextLine();
			if(answer.equals("y") || answer.equals("Y")){
				System.out.println("감정 표현에 솔직한 편이다.(y/n) ");
				answer = sc.nextLine();
				if(answer.equals("y") || answer.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.(y/n) ");
					answer = sc.nextLine();
					if(answer.equals("y") || answer.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 생긴다.(y/n) ");
						answer = sc.nextLine();
						if(answer.equals("y") || answer.equals("Y")){
							type = "D";
						} else if(answer.equals("n") || answer.equals("N")){
							type = "C";
						}
					} else if(answer.equals("n") || answer.equals("N")){
						type = "B";
					}
				} else if(answer.equals("n") || answer.equals("N")){
					System.out.println("활동적인 데이트가 좋다.(y/n) ");
					answer = sc.nextLine();
					if(answer.equals("y") || answer.equals("Y")){
						System.out.println("이성친구는 존재할 수 없다.(y/n) ");
						answer = sc.nextLine();
						if(answer.equals("y") || answer.equals("Y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.(y/n) ");
							answer = sc.nextLine();
							if(answer.equals("y") || answer.equals("Y")){
								type = "D";
							} else if(answer.equals("n") || answer.equals("N")){
								type = "C";
							}
						}
					} else if(answer.equals("n") || answer.equals("N")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.(y/n) ");
						answer = sc.nextLine();
						if(answer.equals("y") || answer.equals("Y")){
							type = "D";
						} else if(answer.equals("n") || answer.equals("N")){
							type = "C";
						}
					}
				}
			} else if(answer.equals("n") || answer.equals("N")){
				System.out.println("데이트 코스는 미리 짜는게 편하다.(y/n) ");
				answer = sc.nextLine();
				if(answer.equals("y") || answer.equals("Y")){
					System.out.println("활동적인 데이트가 좋다.(y/n) ");
					answer = sc.nextLine();
					if(answer.equals("y") || answer.equals("Y")){
						System.out.println("이성친구는 존재할 수 없다.(y/n) ");
						answer = sc.nextLine();
						if(answer.equals("y") || answer.equals("Y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.(y/n) ");
							answer = sc.nextLine();
							if(answer.equals("y") || answer.equals("Y")){
								type = "D";
							} else if(answer.equals("n") || answer.equals("N")){
								type = "C";
							}
						}
					} else if(answer.equals("n") || answer.equals("N")){
						if(answer.equals("y") || answer.equals("Y")){
							type = "D";
						} else if(answer.equals("n") || answer.equals("N")){
							type = "C";
						}
					}
				} else if(answer.equals("n") || answer.equals("N")){
					System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.(y/n) ");
					answer = sc.nextLine();
					if(answer.equals("y") || answer.equals("Y")){
						type = "D";
					} else if(answer.equals("n") || answer.equals("N")){
						type = "C";
					}
				}
			}

		} else if(answer.equals("n") || answer.equals("N")){
			System.out.println("감정기복이 크지 않다.(y/n) ");
			answer = sc.nextLine();
			if(answer.equals("y") || answer.equals("Y")){
				System.out.println("연락이 없어도 믿고 기다리는 편이다.(y/n) ");
				answer = sc.nextLine();
				if(answer.equals("y") || answer.equals("Y")){
					type ="A";
				} else if(answer.equals("n") || answer.equals("N")){
					System.out.println("이성친구는 존재할 수 없다.(y/n) ");
					answer = sc.nextLine();
					if(answer.equals("y") || answer.equals("Y")){
						if(answer.equals("y") || answer.equals("Y")){
							type = "D";
						} else if(answer.equals("n") || answer.equals("N")){
							type = "C";
						}
					} else if(answer.equals("n") || answer.equals("N")){
						type = "B";
					}
				}
			} else if(answer.equals("n") || answer.equals("N")){
				System.out.println("감정 표현에 솔직한 편이다.(y/n) ");
				answer = sc.nextLine();
				if(answer.equals("y") || answer.equals("Y")){
					System.out.println("이성 친구는 존재할 수 없다.(y/n) ");
					answer = sc.nextLine();
					if(answer.equals("y") || answer.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.(y/n) ");
						answer = sc.nextLine();
						if(answer.equals("y") || answer.equals("Y")){
							type = "D";
						} else if(answer.equals("n") || answer.equals("N")){
							type = "C";
						}
					} else if(answer.equals("n") || answer.equals("N")){
						type = "B";
					}
				} else if(answer.equals("n") || answer.equals("N")){
					System.out.println("활동적인 데이트가 좋다.(y/n) ");
					answer = sc.nextLine();
					if(answer.equals("y") || answer.equals("Y")){
						System.out.println("이성친구는 존재할 수 없다.(y/n) ");
						answer = sc.nextLine();
						if(answer.equals("y") || answer.equals("Y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.(y/n) ");
							answer = sc.nextLine();
							if(answer.equals("y") || answer.equals("Y")){
								type = "D";
							} else if(answer.equals("n") || answer.equals("N")){
								type = "C";
							}
						}
					} else if(answer.equals("n") || answer.equals("N")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.(y/n) ");
						answer = sc.nextLine();
						if(answer.equals("y") || answer.equals("Y")){
							type = "D";
						} else if(answer.equals("n") || answer.equals("N")){
							type = "C";
						}					
					}
				} 
			}
		}
		System.out.println("당신의 연애 유형은 " + type +"형입니다.");

		if(type.equals("A"))
			System.out.println("서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
		else if(type.equals("B"))
			System.out.println("구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
		else if(type.equals("C"))
			System.out.println("이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
		else
			System.out.println("무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");

	}
}