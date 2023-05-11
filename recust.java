package strings;

public class recust 
{

	public static void main(String[] args) 
	{
		String s1="elephantrruuggfsnfg";
		char[]s2=s1.toCharArray();
		for(int i=0;i<s2.length-1;i++)
		{	int c=0;
			for (int j=i+1;j<s2.length;j++)
			{
				if(s2[i]==s2[j]) {
					c+=1;
					//System.out.println(s2[i]);
				}
			}
			if(c>0) {
			System.out.print(s2[i]);
			System.out.println(c);}
		}
		//System.out.println(s2);
	}

}


