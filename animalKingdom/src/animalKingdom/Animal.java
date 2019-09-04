package animalKingdom;

public abstract class Animal
{
	// fields, attributes of the animal, things that is has or knows. any animal, regardless of type,
	// will have these.
	private static int maxNumber;
	private int number;
	String name;
	int year;


	// constructor function
	public Animal(String name, int year)
	{
		maxNumber++;
		number = maxNumber;

		this.name = name;
		this.year = year;
	}

	// methods, things that the animal can DO. 
	// these are abstract so we require the children to define these,  since they will differ
	// among each type of child
	public abstract String move();

	public abstract String breathe();

	public abstract String reproduce();

}