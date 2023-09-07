package ch02_pjt_01;

public class MyCalculator {
	
	ICalculator ic;
	public void calculate(int fNum, int sNum, char operator) {
		switch(operator) {
		case '+':
			ic = new CalAdd();
			break;
		case '-':
			ic = new CalSub();
			break;
		case '*':
			ic = new CalMul();
			break;
		case '/':
			ic = new CalDiv();
			break;
		case '%':
			ic = new CalMod();
			break;
		}
		int value = ic.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
}
