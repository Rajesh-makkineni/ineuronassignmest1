package strings;

public class panagram 
{

	public static void main(String[] args) 
	{
		boolean c=false;
		String s1="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG ";
		s1=s1.replace(" ", "");
		char [] ch=s1.toCharArray();
		int [] ar=new int[26];
		for(int i=0;i<ch.length;i++)
		{
			int dex=ch[i]-65;
			ar[dex]++;
			//ar[ch[i]-65]++;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("it is not pangram");
				c=true;
			}
		}
		if(c==false) 
		{
		System.out.println("it is pangram");	
	
		}
	}

}
