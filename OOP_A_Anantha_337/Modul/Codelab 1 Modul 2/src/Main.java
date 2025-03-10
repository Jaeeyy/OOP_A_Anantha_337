public class Main {
    public static void main(String[] args) {
        //New object 
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        //Name Of Object Attribute of Animal
        animal1.Name = "Cat";
        animal2.Name = "Dog";

        // Type of Object Attribute of Animal
        animal1.Type = "Mammal";
        animal2.Type = "Mammal";

        //Sound Of Object Attribute of Animal
        animal1.Sound = "Nyaa~";
        animal2.Sound = "Woof-Woof!";

        //To display Object from the Animal Class
        animal1.displayInfo();
        animal2.displayInfo();
    }
}
