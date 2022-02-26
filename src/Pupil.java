/**
 * @author butrim
 */
public class Pupil {
    public String name;
    public int[] marks; // оценки

    Pupil(String name, int mathMark, int russianLngMark, int physicsMark) {
        this.name = name;
        this.marks = new int[] {mathMark, russianLngMark, physicsMark};
    }

    // option 2: public HashMap<String, Integer>
    // option 3: class Mark {
    //  String subjectName
    //  int mark

    public float getAvgMark() {
        return (marks[0] + marks[1] + marks[2]) / 3.f;
    }

    public boolean hasOnlyExcellentMarks() {
        for (int mark : marks) {
            if (mark < 5) {
                return false;
            }
        }
        return true;
    }
}
