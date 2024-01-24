package mech;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.logging.Logger;

public class TechnicalSolution {

    workable[] solution;
    private PrintWriter logger;
    public TechnicalSolution() {
        this.solution = new workable[6];
        for (int i = 0; i < 6; i++) {
            solution[i] = new Gear();
        }
        try {
            logger = new PrintWriter(new FileWriter("log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public workable[] setcell(int position, workable mechanism) {
        if (position > 0 && position < 7)
        {
            this.solution[position - 1] = mechanism;
            log("Set cell " + position + " with mechanism: " + mechanism.toString());
        }

        else {
            System.out.println("Incorret cell position ");
            log("Incorret cell position ");
        }
        return solution;
    }

    public void SolutionWork() {
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i].work() + "\n");
            log(solution[i].work());
        }

    }
    private void log(String message) {
        logger.println(message);
        logger.flush();
    }


}