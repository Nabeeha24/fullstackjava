package revision;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		float first=2.50f, second =4.50f;
		System.out.println("--Before Swap--");
		System.out.println("First number= " +first);
		System.out.println("second number = "+second);
		
		float temporary=first;
		first=second;
		second=temporary;
		
		System.out.println("--After Swap--");
		System.out.println("First number ="+first);
		System.out.println("second number ="+second);

	}

}
