/* Define the following for Dog class that inherits from Animal class
-  Instance variables breed (private)
-  setters and getters
-  toString (breed is added to Name and id to be returned and separated by tabs)
-  2 constructors ( default, parenthesized (breed,name and id))
-  Override sound method to print the parent class sound and add woof woof to it
*/

public class Dog extends Animal
{
    private String breed;

    public void setBreed(String breed){this.breed=breed;}
    public String getBreed(){return this.breed;}

    @Override
    public String toString(){
        return super.toString() + "\t" + breed;
    }

    Dog(){
        breed ="default breed";
    }

    Dog(String name, int Id, String breed) {
        super.setId(Id);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void sound(){
        super.sound();
        System.out.println("woof woof");
    }

}