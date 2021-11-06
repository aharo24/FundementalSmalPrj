public class Animal
{
    /* Define the following for Animal class
       -  Instance variables name(protected) and ID (private)
       -  setters and getters
       -  toString (Name and id to be returned and separated by tabs)
       -  2 constructors ( default, parenthesized (name and id))

       /* Type your code here. */


    protected String name;
    private int Id;

    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public void setId(int Id){this.Id=Id;}
    public int getId(){return Id;}


    public String toString(){
        return name + "\t" + Id;
    }


    Animal(){
        name = "default name";
        Id = -1;
    }

    Animal(String name, int Id){
        this.name=name;
        this.Id=Id;
    }


    public void sound() {
        System.out.print("The animal sound is: ");
    }
}

