package inheritance.wednesday2;

public class Animal2 {
//The Animal is the base class here. Let’s create a Cat class that inherits from Animal class.
        private boolean vegetarian;

        private String eats;

        private int noOfLegs;

        public Animal2(){}

        public Animal2(boolean veg, String food, int legs){
            //constructor
            this.vegetarian = veg;
            this.eats = food;
            this.noOfLegs = legs;
        }

        public boolean isVegetarian() {
            /*instance method that returns a boolean value indicating whether the object
            represents a vegetarian item or not. */
            return vegetarian;
        }
        public String eats(){
            return eats;
        }

        public int noOfLegs(){
            return noOfLegs;
        }
    /*
        public void setVegetarian(boolean vegetarian) {
            this.vegetarian = vegetarian;
        }

        public String getEats() {
            return eats;
        }

        public void setEats(String eats) {
            this.eats = eats;
        }

        public int getNoOfLegs() {
            return noOfLegs;
        }

        public void setNoOfLegs(int noOfLegs) {
            this.noOfLegs = noOfLegs;
        }

     */

    }
