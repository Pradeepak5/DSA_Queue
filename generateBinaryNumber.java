import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class generateBinaryNumber {
	
	public String[] generateBinary(int n) {
		String[] result=new String[n];
		Queue<String> q=new LinkedList<>();
		q.offer("1");
		for(int i=0;i<n;i++) {
			result[i]=q.poll();
			System.out.println(result[i]);
			String n1=result[i]+"0";
			String n2=result[i]+"1";
			q.offer(n1);
			q.offer(n2);
		}
		return result;
	}

	public static void main(String[] args) {
		generateBinaryNumber b=new generateBinaryNumber();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=s.nextInt();
		b.generateBinary(n);

	}

}
