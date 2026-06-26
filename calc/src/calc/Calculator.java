package calc;

public class Calculator {
	private int value = 0;
	private int old = 0;
	private int op;
	public void press(char c) {
		if (c == '+') {
			op = 1;
			value = old+value;
			old = 0;
		}
		else if (c == '*') {
			op = 2;
		}
		else if (c == '=') {
			System.out.println(value);
		}
		else {
			old = c - '0';
			value = value*10 + old;
			old = value;
		}
	}
	public int eval(String[] args) {
		int r=0;
		return r;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.press('3');
		c.press('+');
		c.press('6');
		c.press('=');
		System.out.println(c.getValue());
	}
	public int getValue() {
		return this.value;
	}
}
