class Me
{
    int am;
    float cm;
    char dm;
    public static void main (String args[])
    {	
	//local variables are not initialised
	//to not make it static u need to create an object to access those variables
	Me obj = new Me();
	//all instance values are initialised by default
        System.out.println(obj.am);
        System.out.println(obj.dm);
        System.out.println(obj.cm);
    }
}