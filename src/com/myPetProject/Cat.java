package src.com.mypetproject;

public class Cat extends Pet {
// attributes
private int age;

private String color;

//constructor
public Cat (int age, String color, String species){
    super(species)
    this.color = color;
    this.age = age;


}

//behaviour 
public void meow()
    System.out.println("mrowwwwww the" + color + " " + species + "meow")
   
}