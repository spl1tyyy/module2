class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    int getScholarship() {
        if (averageMark == 5.0) {
            return 1000;
        } else {
            return 800;
        }
    }

    void printInfo() {
        System.out.println("Студент: " + firstName + " " + lastName);
        System.out.println("Група: " + group);
        System.out.println("Середній бал: " + averageMark);
        System.out.println("Стипендія: " + getScholarship() + " грн");
        System.out.println("------------------------");
    }
}

class Aspirant extends Student {
    String scientificWork;

    Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    int getScholarship() {
        if (averageMark == 5.0) {
            return 2000;
        } else {
            return 1800;
        }
    }

    @Override
    void printInfo() {
        System.out.println("Аспірант: " + firstName + " " + lastName);
        System.out.println("Група: " + group);
        System.out.println("Середній бал: " + averageMark);
        System.out.println("Наукова робота: " + scientificWork);
        System.out.println("Стипендія: " + getScholarship() + " грн");
        System.out.println("------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("СИСТЕМА ОБЛІКУ СТУДЕНТІВ ТА АСПІРАНТІВ\n");

        Student[] students = new Student[5];

        students[0] = new Student("Іван", "Петренко", "КН-21", 5.0);
        students[1] = new Student("Олена", "Шевченко", "КН-22", 4.5);
        students[2] = new Aspirant("Марія", "Коваленко", "АС-11", 5.0, "Дослідження штучного інтелекту");
        students[3] = new Student("Петро", "Сидоренко", "КН-21", 4.8);
        students[4] = new Aspirant("Андрій", "Мельник", "АС-12", 4.7, "Квантові обчислення");

        for (Student s : students) {
            s.printInfo();
        }

    }
}
