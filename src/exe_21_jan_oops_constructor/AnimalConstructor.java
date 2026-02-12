package exe_21_jan_oops_constructor;
class Animal
{
    Animal()
    {
        System.out.println("this is defalut constructor");
    }
}

class Dog
{
    Dog()
    {
        System.out.println("Dog constructor");
    }
}
public class AnimalConstructor {
    AnimalConstructor()
    {
        System.out.println("this is animal main constructor");
    }
    public static void main(String[] args) {
        Animal a=new Animal();
        Dog d=new Dog();
        AnimalConstructor m=new AnimalConstructor();
        cat c=new cat();


    }
}
