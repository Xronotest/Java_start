public class Cat
{
    private String breed;
    private String gender;
    private String name;
    private int age;
    private String color;

    public static int counter;
    public static void implementCounter()
    {
    Cat.counter++;
    }

    public Cat(String breed, String gender, String name, int age, String color)
    {
        this.breed = breed;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.color =color;

        Cat.implementCounter();
    }

    public void sayMeow()
    {
        System.out.println(this.name + " say: \"BRBRBRBRBRBRBRBRBRB!!!\"");
    }
}
