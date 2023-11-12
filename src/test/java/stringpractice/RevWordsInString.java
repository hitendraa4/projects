package stringpractice;

public class RevWordsInString {

	public static void main(String[] args) {
		
		String s="Ram is good boy";
		
		String[] words = s.split(" ");
		
		
		
		for(int i=0;i<words.length;i++)
		{
			String rev="";
			for(int j=words[i].length()-1;j>=0;j--)
			{
				rev=rev+words[i].charAt(j);
			}
			words[i]=rev;
			System.out.print(words[i]+" ");
			
		}
		

	}

}
