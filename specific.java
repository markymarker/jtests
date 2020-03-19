
public class specific {

	private static class A {
		public void echo(){
			System.out.println("A says this");
		}
	}

	private static class B extends A {
		public void echo(){
			System.out.println("B says this");
		}
	}

// // // //

	public static void main(String[] Args){
		A[] list = new A[] {
			new B(),
			new A(),
			new B()
		};

		for(A i : list) i.echo();

		// But cannot do this:
		// for(B i : list) i.echo();

		// Or this, really:
		// for(A i : list) ((B)i).echo();
	}

}

