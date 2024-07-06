import java.util.*;
class maxtemp 
{
	void dispmaxt()
	{
		super("Temperature abnormal");
		System.out.println("Temperature abnormal");
	}

}
class demo
{
	public static void main(String args[])
	{
	float temp;
	try
	{
	temp=T.maxt();
	if(temp>1000)
	{
	maxt m=new maxt();
	throw (m);
}		
}
catch(maxt m1)
{
m1.dispmaxt();
System.out.println(m1.getMessage());
}
}
}