class spr
{
	public spr()
	{
		super();
		System.out.println("hiiii");
	}
}
class sub extends spr
{
	public sub()
	{
		super();
		System.out.println("hoiiii ");
	}
}
class Oops
{
	public static void main(String[] args) {
	sub s1 = new sub();
	}
}