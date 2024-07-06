class Exceptiontest
{
	public static void main(String args[]){
	System.out.println(tp());
	}
	public static int tp(){
	try{
	return 1;
	}
	catch(Exception e)
	{
	return 2;
	}
	finally
	{
	return 3;
	}
	

}
}