public class Oddeven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		if(a%2==0){
			System.out.println("the given no is even");
		}
		else if(a%2==1){
			System.out.println("the no is odd");
		}
		else{
			System.out.println("invalid");
		}
	}
}
