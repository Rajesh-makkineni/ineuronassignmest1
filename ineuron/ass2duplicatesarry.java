package Search;

public class duplicatesarray 
{

	public static void main(String[] args) 
	{
		int [] ar= {1,2,3,4,4,5,3,2};
		System.out.println(" duplicates in the array");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
			}
		}

	}

}
