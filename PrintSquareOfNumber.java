import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintSquareOfNumber implements InterfaceDemo {

	public void number(int a){
		
		System.out.println("The square of number entered is " + (a*a));
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		System.out.print("Enter number : ");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		PrintSquareOfNumber pn = new PrintSquareOfNumber();
		pn.number(a);
		
	}

}