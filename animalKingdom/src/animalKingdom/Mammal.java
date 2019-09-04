package animalKingdom;

public class Mammal extends Animal
{

	//constructor
	public Mammal(String name, int year)
	{
		super(name, year);
	}

	//methods, abtracted in parent class
	@Override
	public String move()
	{
		return "This animal walks.";
	}

	@Override
	public String breathe()
	{
		return "This animal breathes with lungs.";
	}

	@Override
	public String reproduce()
	{
		return "This animal reproduces via live birth.";
	}

	//method for printing out JSON-like data instead of bytecode pointer
	@Override
	public String toString()
	{
		return "Mammal{name=" + name + ", year=" + year + "}";
	}

}