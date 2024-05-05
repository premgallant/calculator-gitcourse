public class TeamSquareRoot {

   public double computesquareroot(double num) {
        return Math.sqrt(num);
    }

    public static void main(String args[]){
        TeamSquareRoot team1SquareRoot  = new TeamSquareRoot();
        double result = team1SquareRoot.computesquareroot(25)
        System.out.println("Square root of 25 is\t"+result);

    }

}