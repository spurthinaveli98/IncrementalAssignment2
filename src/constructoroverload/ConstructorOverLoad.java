package constructoroverload;

public class ConstructorOverLoad {

    public static void main(String args[])
    {
        ConstructorOverLoad constructorOverLoad = new ConstructorOverLoad();

    }


    public ConstructorOverLoad()
    {
        this(30);
        System.out.println("This is default constructor");

    }
    public ConstructorOverLoad(int value)
    {

        System.out.println("This is parameterized constructor");

        System.out.println("number="+value);

    }

}
