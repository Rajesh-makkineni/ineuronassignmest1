package strings;

public class Duplicates {

	public static void main(String[] args) {
		String s="elephantelephantrajesh";
		//StringBuffer s1=new StringBuffer(s);
		String d="";
		char[]s2=s.toCharArray();
		for(int i=0;i<s2.length-1;i++)
		{	int c=0; 
			for (int j=0;j<s2.length;j++)
			{	if(i!=j) {
				if(s2[i]==s2[j]) {
					c+=1;
					//System.out.println(s2[i]);
				}}
			}
			if(c!=0) {
			d+=s2[i];
			}
		}
		System.out.println(d);

	}

}
