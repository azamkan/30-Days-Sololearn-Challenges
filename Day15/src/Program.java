public class Program
{
	public static void App(String[] args) {
	    Country c = new Country();
	    c.name = "France";
	    c.capital = "Paris";
	    System.out.println("Country:  " + c.name);
	    System.out.println("Capital:  " + c.capital);
	}
}
class Country{
    public String name;
    public String capital;
}