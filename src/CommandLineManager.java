import java.util.Scanner;

/**
 * @author butrim
 */
public class CommandLineManager {

    Scanner scanner = new Scanner(System.in);

    Journal journal;

    public CommandLineManager(Journal journal) {
        this.journal = journal;
    }

    public void printMenuAndHandleCommand() {
        while (true) {
            printMenu();

            int cmd = scanner.nextInt();

            if (cmd == 0) {
                break;
            } else if (cmd == 1) {
                readPupilAndAdd();
            } else if (cmd == 2) {
                journal.printAvgMarks();
            } else if (cmd == 3) {
                journal.printPupilsWithExcellentMarksPercent();
            }
        }

        System.out.println("Пока!");
    }

    private void printMenu() {
        System.out.println("Введите команду:");
        System.out.println("1 -- добавить ученика");
        System.out.println("2 -- вывести средние баллы");
        System.out.println("3 -- вывести процент отличников");
        System.out.println("0 -- выход");
    }

    private void readPupilAndAdd() {
        System.out.println("Введите имя:");
        String name = scanner.next();

        System.out.println("Введите оценку за математику:");
        int mathMark = scanner.nextInt();
        System.out.println("Введите оценку за русский язык:");
        int russianLngMark = scanner.nextInt();
        System.out.println("Введите оценку за физику:");
        int physicsMark = scanner.nextInt();

        journal.addPupil(new Pupil(name, mathMark, russianLngMark, physicsMark));
        System.out.println("Ученик добавлен");
    }
}
