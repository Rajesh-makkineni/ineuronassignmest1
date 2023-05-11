package strings;

public class count 
{

	public static void main(String[] args) 
	{
		String s1="Rajesh@$%";
		int vowels = 0, consonants = 0,  symbols = 0;
		for(int i=0;i<s1.length();++i)
		{
			char ch =s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				++vowels;
			}
			else if(ch>='a'&&ch<='z')
			{
				++consonants;
			}
			else
			{
				++symbols;
			}
		}
		System.out.println("vowels:"+ vowels);
		System.out.println("consonants:"+ consonants);
		System.out.println("symbols:"+ symbols);
		
	}
}
