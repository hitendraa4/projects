package string;

public class SumOFTwoDigits {

	public static void main(String[] args) {
		
		String a="12abc140c1";
		
		int sum=0;
		int tsum=0;
		 for(int i=0;i<a.length();i++)
		 {
			 if(a.charAt(i)>='0'&&a.charAt(i)<='9')
			 {
				 int n=a.charAt(i)-48;
				 tsum=tsum*10+n;
			 }
			 else
			 {
				 sum=sum+tsum;
				 tsum=0;
			 }
			 
		 }
		
		 sum=sum+tsum;
		 System.out.println(sum);

	}

}
