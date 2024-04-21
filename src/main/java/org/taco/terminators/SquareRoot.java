
public class SquareRoot{

  public int computesquareroot(int num)
{
   return num*num;
}
  public static void main(String args[]){
   SquareRoot sq = new SquareRoot();
   int result = sq.computesquareroot(10);
   System.out.println(result);
}

}
