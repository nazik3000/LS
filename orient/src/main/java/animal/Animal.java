package animal;

/**
 * Hello world!
 *
 */
public class Animal extends PetsCharacters
{
    Animal(String genus, PetsAction type, String petName, int petAge, double weight, int population, String locality) {
        super(genus, type, petName, petAge, weight, population, locality);
        //TODO Auto-generated constructor stub
    }

    public static void main( String[] args )
    {
        Animal cat1= new Animal("Cats", PetsAction.CATS, "barsik"  , 2, 4.2, 1, "Pillow");
        PetsAction cats = PetsAction.CATS;
        System.out.println(cat1.getType().CATS.getVoice());
        System.out.println(cats.getVoice());
        System.out.println("----------------");
        Animal dog1 = new Animal("Dogs", PetsAction.DOGS, "bobik", 1, 7.3, 2,"DogHouse");
        System.out.println(dog1);
        System.out.println(dog1.getType().DOGS.getVoice());
        System.out.println(dog1.toString());
    }

    
}
