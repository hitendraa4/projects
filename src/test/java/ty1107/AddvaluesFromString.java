package ty1107;

public class AddvaluesFromString {
	
	public static void main(String[] args) {
		
		
		String a="1aabb23sa400";
		int sum=0;
		int tsum=0;
		
		for (int i = 0; i < a.length(); i++) {
			{
				if(a.charAt(i)>='0'&&a.charAt(i)<='9')
				{
					int n=a.charAt(i)-48;
					tsum=tsum*10+n;
				}
				else {
					sum=sum+tsum;
					tsum=0;
				}
			}
			
		}
		sum=sum+tsum;
		System.out.println(sum);
	}

}
