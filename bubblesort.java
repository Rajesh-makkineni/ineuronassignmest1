package Search;

public class bubblesort 
{

	public static void main(String[] args) 
	{
		int []a= {1,9,4,2,5,3,6,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					 int temp=a[j];
					 a[j]=a[j-1];
					 a[j-1]=temp;
				}
			}
		}
		for(int elme:a)
		{
			System.out.print(elme+ " ");
		}
	}

}
