package methodvarargs.examstats;

public class ExamStats {
    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Hiányoznak az eredmények!");
        }
        int goodExams = 0;
        for (int element : results) {
            // int elementResult = (int) (((element * 1.0) / getMaxPoints()) * 100);
            // TODO Repair!!
            int elementResult = (int)((1.0 * limitInPercent / 100) * getMaxPoints()) ;
            if (elementResult >= limitInPercent) {
                goodExams++;
            }
        }
        return goodExams;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Hiányoznak az eredmények!");
        }
        for (int element : results) {
            // int elementResult = (int) (((element * 1.0) / getMaxPoints()) * 100);
            // TODO Repair!!
            int elementResult = (int)((1.0 * limitInPercent / 100) * getMaxPoints()) ;
            if (elementResult >= limitInPercent) {
                return true;
            }
        }
        return false;
    }
}