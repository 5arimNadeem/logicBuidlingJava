package logicBuilding.EasyProblems;

import java.util.ArrayList;
import java.util.List;

public class SolutionTwentyFive {
    public int calPoints(String[] operations) {
        // We'll use an ArrayList to simulate the score record,
        // acting like a stack where elements are added/removed from the end.
        List<Integer> record = new ArrayList<>();
        int totalSum = 0;

        for (String op : operations) {
            if (op.equals("+")) {
                // Get the last two scores
                int lastScore = record.get(record.size() - 1);
                int secondLastScore = record.get(record.size() - 2);
                int newScore = lastScore + secondLastScore;

                record.add(newScore);
                totalSum += newScore;
            } else if (op.equals("D")) {
                // Get the last score and double it
                int lastScore = record.get(record.size() - 1);
                int newScore = lastScore * 2;

                record.add(newScore);
                totalSum += newScore;
            } else if (op.equals("C")) {
                // Remove the last score and subtract it from totalSum
                int scoreToRemove = record.remove(record.size() - 1);
                totalSum -= scoreToRemove;
            } else {
                // It's an integer score
                int newScore = Integer.parseInt(op);
                record.add(newScore);
                totalSum += newScore;
            }
        }

        return totalSum;
    }
}