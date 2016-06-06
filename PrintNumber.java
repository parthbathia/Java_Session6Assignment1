import java.io.*;

public class PrintNumber implements InterfaceDemo {

	public void number(int a){
		
		System.out.println("The number Entered is " + a);
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		System.out.print("Enter number : ");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		PrintNumber pn = new PrintNumber();
		pn.number(a);
		
	}

}