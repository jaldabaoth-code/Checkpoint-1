public class Student {
    // TODO hasLegalAge
    public static boolean hasLegalAge(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // TODO getGroup
    public static char getGroup(int studentNumber) {
        if (studentNumber % 2 == 0) {
            return 'A';
        } else {
            return 'B';
        }
    }

    // TODO countStudents
    public static int countStudents(String[] languages) {
        int count = 0;
        for (String language : languages) {
            if (language.equalsIgnoreCase("Java")) {
                count++;
            }
        }
        return count;
    }
}
