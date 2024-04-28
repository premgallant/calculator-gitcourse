
public class SquareRoot{

   public static double squareRoot(double number) {
        double guess = 1.0;
        while (Math.abs(guess * guess - number) > 0.001) {
            guess = (guess + number / guess) / 2.0;
        }
        return guess;
    }


  public int computesquareroot(int num)
{
   return num*num;
}
  public static void main(String args[]){
   SquareRoot sq = new SquareRoot();
   int result = sq.computesquareroot(10);
   System.out.println(result);
  double resultFromCustomSquareRoot = squareRoot(25);
  System.out.println(resultFromCustomSquareRoot);
}

}
