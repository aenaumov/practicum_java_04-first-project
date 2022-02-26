import java.util.ArrayList;

/**
 * @author butrim
 */
public class Journal {
    private ArrayList<Pupil> pupils;

    Journal() {
        pupils = new ArrayList<>();
    }

    public void addPupil(Pupil pupil) {
        pupils.add(pupil);
    }

    public int getPupilsTotalCount() {
        return pupils.size();
    }

    public int getPupilsWithExcellentMarksCount() {
        int pupilsWithOnlyExcellentMarks = 0;
        for (Pupil pupil : pupils) {
            if (pupil.hasOnlyExcellentMarks()) {
                pupilsWithOnlyExcellentMarks += 1;
            }
        }
        return pupilsWithOnlyExcellentMarks;
    }

    public float getPupilsWithExcellentMarksPercent() {
        return (float) getPupilsWithExcellentMarksCount() / getPupilsTotalCount();
    }

    public void printAvgMarks() {
        System.out.println("Средние оценки");
        for (Pupil pupil : pupils) {
            System.out.println(pupil.name + ": " + pupil.getAvgMark());
        }
    }

    public void printPupilsWithExcellentMarksPercent() {
        System.out.println("Процент отличников: " + getPupilsWithExcellentMarksPercent());
    }
}
