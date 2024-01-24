import mech.Gear;
import mech.Spring;
import mech.TechnicalSolution;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Gear gear = new Gear();
//        System.out.println (gear.work());

        Spring spring = new Spring();
//        System.out.println (spring.work());


        TechnicalSolution solution = new TechnicalSolution();

        solution.SolutionWork();
        System.out.println("==============");
        solution.setcell(0,spring);
        solution.setcell(1,spring);
        solution.setcell(2,spring);
        System.out.println("==============");
        solution.SolutionWork();

    }
}
