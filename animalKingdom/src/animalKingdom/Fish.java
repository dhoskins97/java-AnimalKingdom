package animalKingdom;

public class Fish extends Animal
{

	//constructor
	public Fish(String name, int year)
	{
		super(name, year);
	}

	//methods, abtracted in parent class
	@Override
	public String move()
	{
		return "This animal swims.";
	}

	@Override
	public String breathe()
	{
		return "This animal breathes with gills.";
	}

	@Override
	public String reproduce()
	{
		return "This animal reproduces via eggs.";
	}

	//method for printing out JSON-like data instead of bytecode pointer
	@Override
	public String toString()
	{
		return "Fish{name=" + name + ", year=" + year + "}\n";
	}

}