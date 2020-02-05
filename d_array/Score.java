package d_array;

public class Score {

	public static void main(String[] args) {
		/*
		 *  우리반 모두의  Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50 ~ 100까지 랜덤으로 생성하고,
		 *  석차 순으로 석차, 이름, 과목별 점수 , 총점, 평균을 출력해주세요.
		 *  
		 *  석차		이름		Java	Oracle		HTML		CSS		JQuery		JSP		총점		평균
		 *  1		홍길동	100		90			89			70		60			50		350		75.0
		 *  1		홍길동	100		90			89			70		60			50		350		75.0
		 *  1		홍길동	100		90			89			70		60			50		350		75.0
		 *  1		홍길동	100		90			89			70		60			50		350		75.0
		 *  1		홍길동	100		90			89			70		60			50		350		75.0
		 *  1		홍길동	100		90			89			70		60			50		350		75.0
		 *  1		홍길동	100		90			89			70		60			50		350		75.0
		 */
		
		String[] name = {"신나라", "나창수", "곽녕은", "옥혜원"};
		int[][] scores= new int[4][6];
		double[] subjectAvg = new double[6];
		int[] subjectSum = new int[6];
		int[][] arrayTemp = new int[1][6];
		int[] sum = new int [4];
		int[] idx = new int [4]; 
		char[] grade = new char [4];
		double[] avg = new double[4];
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int) (Math.random() * 51) + 50;
			}
		}
		
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				sum[i] += scores[i][j];
			}
			avg[i] = (int) (sum[i] / (float) scores[i].length);
			if(avg[i] >= 90){
				grade[i] = 'A';
			} else if(avg[i] < 90 && avg[i] >= 80){
				grade[i] = 'B';
			} else if(avg[i] < 80 && avg[i] >= 70){
				grade[i] = 'C';
			} else if(avg[i] < 70 && avg[i] >= 60){
				grade[i] = 'D';
			} else{
				grade[i] = 'F';
			}
		}
		
		for(int i = 1; i < avg.length; i++){
			String tempName;
			char tempGrade;
			int[] tempScore = new int[6];
			double temp = avg[i];
			int tempSum = sum[i];
			tempGrade = grade[i];
			tempName = name[i];
			for(int k = 0; k < scores[i].length; k++){
				tempScore[k] = scores[i][k];
			}
			int j = 0;
			for(j = i - 1; j >= 0; j--){
				if(temp < avg[j]){
					avg[j + 1] = avg[j];
					sum[j + 1] = sum[j];
					name[j + 1] = name[j];
					grade[j + 1] = grade[j];
					for(int k = 0; k < scores[i].length; k++){
						scores[j + 1][k] = scores[j][k];
					}
				} else{
					break;
				}
			}
			avg[j + 1] = temp;
			sum[j + 1] = tempSum;
			name[j + 1] = tempName;
			grade[j + 1] = tempGrade;
			for(int k = 0; k < scores[i].length; k++){
				scores[j + 1][k] = tempScore[k];
			}
			
		}
		
		System.out.println("석차\t이름\tJava\tOracle\tHTML\tCSS\tJQuery\tJSP\t총점\t평균\t등급");
		int rank = 4;
		for(int i = 0; i < scores.length; i++){
				System.out.print(rank + "\t" + name[i] + '\t');
				for(int j = 0; j < scores[i].length; j++){
					System.out.print(scores[i][j] + "\t");
					
				}
				System.out.println(sum[i] + "\t" + avg[i] + "\t" + grade[i]);
				System.out.println();
				rank--;
		}
		
		for(int i = 0; i < scores[0].length; i++){
			for(int j = 0; j < scores.length; j++){
				subjectSum[i] += scores[j][i];
			}
			subjectAvg[i] += subjectSum[i] / (double)scores.length;
		}
		System.out.print("과목별 평균" + "\t");
		for(int i = 0; i < scores[0].length; i++){
			System.out.print(subjectAvg[i] + "\t");
		}
		
	}

}
