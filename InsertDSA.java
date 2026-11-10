class InsertDSA
{
	public static void main(String [] args)
	{
		int ar[] = {11,12,13,14,15};
		int pos = 3;
		
		int br[] = new int[ar.length-1];
		
		for (int i = 0; i < pos-1;i++)
		{
			br[i] = ar[i];
		}
		
		for(int i = pos;i <ar.length;i++)
		{
			br[i-1]=ar[i];
		}
		
		for(int i = 0;i <br.length;i++)
		{
			System.out.println(br[i]);
		}
		
	}
	
}