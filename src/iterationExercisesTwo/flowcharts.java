package iterationExercisesTwo;

public class flowcharts {
	public static void main(String[] args) {
		flowchart1();
		flowchart2();
		tentennumbers();
		xxnumbers();

	}

	private static void xxnumbers() {
		for( int i = 1; i<=10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
		
	}

	private static void tentennumbers() {
		for( int i = 1; i<=10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i);
			}
		}
		
	}

	private static void flowchart2() {
		for (int A =100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}

	private static void flowchart1() {
		for (int A =100; A <= 200; A++) {
			System.out.println(A);
		}

	}

}
