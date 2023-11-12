package string;

public class DiffrenceComparision {

	public static void main(String[] args) {
		int []  a={10,22,23,30,40};

		int x=54;
		int sum=0;
		int num1=0;
		int num2=0;

		int near=a[0]+a[1];

		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{

		int n=0;

		sum=a[i]+a[j];
		if(sum>x)
		{
		n=sum-x;
		}
		else
		{
		n=x-sum;
		}
		if(n<near)

		{
		near=n;
		num1=a[i];
		num2=a[j];
		}

		}}
		System.out.println(num1+" "+num2);

		}



	}


