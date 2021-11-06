/* Define the following for Cat class that inherits from Animal class
-  Instance variables size (private)
-  setters and getters
-  toString (size is added to Name and id to be returned and separated by tabs)
-  2 constructors ( default, parenthesized (size,name and id))
-  Override sound method to print the parent class sound and add meow meow to it
*/

public class Cat extends Animal
{
    private String size;

    public void setSize(String size){this.size=size;}
    public String getSize(){return this.size;}

    Cat(){
        size = "default size";
    }

    @Override
    public String toString(){
        return super.toString() + "\t" + size;
    }

    Cat(String size,String name, int Id){
        this.name = name;
        super.setId(Id);
        this.size = size;
    }


    @Override
    public void sound(){
        super.sound();
        System.out.println("meow meow");
    }
}

