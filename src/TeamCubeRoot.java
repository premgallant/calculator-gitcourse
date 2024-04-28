public class GitTacoTeam2CubeRoot {

 public double computeCuberoot(double num) {
    return Math.cbrt(num);
}

    public static void main(String args[]){
        GitTacoTeam2CubeRoot team2CubeRoot  = new GitTacoTeam2CubeRoot();
        double result = team2CubeRoot.computeCuberoot(27)
        System.out.println("Cube root of 27 is\t"+result);

    }

}