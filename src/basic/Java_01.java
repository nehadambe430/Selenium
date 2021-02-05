package basic;

public class Java_01
{
	public static void main(String[] args) 
	{
		String str="aaabbacacdd";
		char c[]=str.toCharArray();
		int count=0;
		 
		
		for( int i=0;i<str.length();i++)
		{
			if(c[i]!=-1)
			{
				
				for( int j=0;j<str.length();j++)
				{
					if(c[i]==c[j])
					{
						count++;
						
					}
				}
				System.out.println(c[i]+" "+count);
			}
			count=0;
		}
		
		
	}

}
