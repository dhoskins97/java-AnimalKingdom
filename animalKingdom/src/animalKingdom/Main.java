package animalKingdom;
import java.util.*;

public class Main
{

	public static void main(String[] args)
	{
		//making the animals with their respective constructors
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		// System.out.println("Code has compiled and run successfully!!");
		// System.out.println(panda.breathe());

		//declaring an list of ALL animals
		ArrayList<Animal> animalList = new ArrayList<Animal>();

		//adding each animal to the animalList
		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigfoot);
		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);
		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

		System.out.println("***All Animals***\n");
		animalList.forEach((a) -> System.out.println(a));
		System.out.println("\n*****\n");

		//list by year, descending
		System.out.println("*** List by Year ***");
		animalList.sort((a1, a2) -> a2.year - a1.year);
		System.out.println(animalList.toString());
		
		//list alphabetically
		System.out.println("*** List by Name ***");
		animalList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
		System.out.println(animalList.toString());

		//list animals alphabetically by how they move
		System.out.println();

		//list animals that breathe w/ lungs
		System.out.println();

		//list animals that breathe w/ lungs AND year = 1758
		System.out.println();

		//list animals that lay eggs AND breathe w/ lungs
		System.out.println();

		//list animals named in 1758 AND alphabetically
		System.out.println();

	}
}