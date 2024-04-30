package sys.management;

public class SumArray {
	
	public static void main(String[] args) {
		
		String arr[] = {"Sandeep"};
		String sum = "";
		String len = "";
		
		for(int i=0; i<=arr.length-1; i++)
		{
			sum = sum+arr[i];
			len = len+=arr[i]; 
		}
		System.out.println(len);

	}
	
}
