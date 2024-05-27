package inheritance.wednesday2;

public class Dog2 extends Animal2 {
/*Notice that we are using extends keyword to implement inheritance in java.*/

        private String color;

        public Dog2(boolean veg, String food, int legs) {
            super(veg, food, legs);
            this.color="White";
        }

        public Dog2(boolean veg, String food, int legs, String color){
            //adding another descriptor here... what did we add?

            super(veg, food, legs);
            this.color=color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    }


