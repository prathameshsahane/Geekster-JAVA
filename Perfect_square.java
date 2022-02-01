package Geester_PreBatch;
import java.util.*;
public class Perfect_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		boolean isSquare=false;
		for(int i=1;i<num;i++){
			if(i*i==num) {
				
				isSquare=true;
			}
			
		}
		if(!isSquare) {
			System.out.println("Not a perfect square");
		}
		else {
			System.out.println("Perfect Square");
		}
		
	}

}
