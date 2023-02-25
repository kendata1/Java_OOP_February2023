package WorkingWithAbstractionLAB.StudentSystem;

public class CommandExecutor {
    private static final String END_COMMAND = "Exit";
    private static final String CREATE_STUDENT_COMMAND = "Create";
    private static final String SHOW_STUDENT_COMMAND = "Show";

    private final StudentSystem studentSystem;

    public CommandExecutor() {
        this.studentSystem = new StudentSystem();
    }

    public void executeCommand (String command, String [] input) {
        switch (command) {
            case CREATE_STUDENT_COMMAND:
                String name = input[1];
                int age = Integer.parseInt(input[2]);
                double grade = Double.parseDouble(input[3]);
                studentSystem.createStudent(name,age,grade);
                break;
            case SHOW_STUDENT_COMMAND:
                String studentName = input [1];
                String result = studentSystem.showStudent(studentName);

                if (result != null){
                    System.out.println(result);
                }
                break;
        }
    }
    public static boolean isExitCommand (String command) {
        return command.equals(END_COMMAND);
    }
}
