package animalKingdom;

public class Bird extends Animal
{

	//constructor
	public Bird(String name, int year)
	{
		super(name, year);
	}

	//methods, abtracted in parent class
	@Override
	public String move()
	{
		return "This animal flies.";
	}

	@Override
	public String breathe()
	{
		return "This animal breathes with lungs.";
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
		return "Bird{name=" + name + ", year=" + year + "}\n";
	}

}