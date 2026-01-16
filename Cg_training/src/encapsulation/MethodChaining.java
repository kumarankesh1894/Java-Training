package encapsulation;

public class MethodChaining {
	MethodChaining m1() {
		return this;
	}
	MethodChaining m2() {
		return this;
	}
	MethodChaining m3() {
		return this;
	}
	MethodChaining m4() {
		return this;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodChaining obj = new MethodChaining();
		System.out.println(obj.m1().m2().m3().m4());

	}

}
