package org.taco.terminators;

public class TrSomething {

        public double computesquareroot(double num) {
            return Math.sqrt(num);
        }

        public static void main(String args[]){
            TrSomething team1SquareRoot  = new TrSomething();
            double result = team1SquareRoot.computesquareroot(25);
            System.out.println("Square root of 25 is\t"+result);

        }

}
