package ty1107;

public class PrintChar {

	public static void main(String[] args) {


		String a="a2b1c3";  // aabccc

		for (int i = 0; i < a.length(); i++) {

			if(a.charAt(i)>='0'&&a.charAt(i)<='9')
			{
				int count=a.charAt(i)-48;


				for(int j=1;j<=count;j++)
				{
					System.out.print(a.charAt(i-1));
				}
			}

		}

	}

}
