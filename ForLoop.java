import java.util.Scanner;
public class ForLoop{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Masukan nilai i > ");
		int usr = in.nextInt();
		for(int i=0; i<usr; i++){
			System.out.print( (i+1) +" ");
		}
		System.out.println();
	}
}