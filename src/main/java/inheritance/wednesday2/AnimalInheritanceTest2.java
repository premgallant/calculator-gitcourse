package inheritance.wednesday2;

public class AnimalInheritanceTest2 {

        public static void main(String[] args) {
            Dog2 dog21 = new Dog2(false, "beef", 4, "black");
            // notice here.. what does an animal contain in just the Animal file?

            // What does it contain here? - why??? what was that differs from just the animal class?

            System.out.println("Dog is Vegetarian?" + dog21.isVegetarian());
            System.out.println("Dog eats " + dog21.eats());
            System.out.println("Dog has " + dog21.noOfLegs() + " legs.");
            System.out.println("Dog color is " + dog21.getColor());
        }


}
