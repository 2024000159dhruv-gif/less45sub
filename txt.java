public class txt {
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	private void mul(int a, int b) {
		System.out.println(a * b);
	}
	
	protected void sub(int a, int b) {
		System.out.println(a - b);
	}

	static int c = 6;

	public static void main(String[] args) {
		txt t = new txt();
		t.mul(33, 66); // Valid
	}
}
}
