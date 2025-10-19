package oopsInheritance;

public class AllinallInheritance {
public static void main(String[] args) {
        // Single Inheritance
        Teacher teacher = new Teacher("Surya", 25, 5.6f, "Java Developer", 5);
        System.out.println("---- Single Inheritance ----");
        System.out.println(teacher);

        // Multilevel Inheritance
        Professor professor = new Professor("Prakash", 40, 5.9f, "AI Specialist", 15, "PhD");
        System.out.println("\n---- Multilevel Inheritance ----");
        System.out.println(professor);

        // Hierarchical Inheritance
        Doctor doctor = new Doctor("Arun", 30, 5.8f, "Cardiology");
        Engineer engineer = new Engineer("Kiran", 28, 5.7f, "Software");
        System.out.println("\n---- Hierarchical Inheritance ----");
        System.out.println(doctor);
        System.out.println(engineer);

        // Multiple Inheritance (via Interfaces)
        MusicTeacher musicTeacher = new MusicTeacher("Vijay", 35, 5.9f, "Music", "Cricket", "Guitar");
        System.out.println("\n---- Multiple Inheritance ----");
        System.out.println(musicTeacher);

        // Hybrid Inheritance (class + interface mix)
        DoctorMusician docMusician = new DoctorMusician("Ravi", 38, 5.6f, "Neurology", "Football", "Violin");
        System.out.println("\n---- Hybrid Inheritance ----");
        System.out.println(docMusician);
    }
}

// ----------------- Single Inheritance -----------------
class Human {
    private String name;
    private int age;
    private float height;

    public Human(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString() {
        return "Name:" + name + " Age:" + age + " Height:" + height;
    }
}

class Teacher extends Human {
    private String role;
    private int experience;

    public Teacher(String name, int age, float height, String role, int experience) {
        super(name, age, height);
        this.role = role;
        this.experience = experience;
    }

    public String toString() {
        return super.toString() + " Role:" + role + " Exp:" + experience;
    }
}

// ----------------- Multilevel Inheritance -----------------
class Professor extends Teacher {
    private String degree;

    public Professor(String name, int age, float height, String role, int experience, String degree) {
        super(name, age, height, role, experience);
        this.degree = degree;
    }

    public String toString() {
        return super.toString() + " Degree:" + degree;
    }
}

// ----------------- Hierarchical Inheritance -----------------
class Doctor extends Human {
    private String specialization;

    public Doctor(String name, int age, float height, String specialization) {
        super(name, age, height);
        this.specialization = specialization;
    }

    public String toString() {
        return super.toString() + " Specialization:" + specialization;
    }
}

class Engineer extends Human {
    private String branch;

    public Engineer(String name, int age, float height, String branch) {
        super(name, age, height);
        this.branch = branch;
    }

    public String toString() {
        return super.toString() + " Branch:" + branch;
    }
}

// ----------------- Multiple Inheritance (via Interfaces) -----------------
interface Sport {
    String getSport();
}

interface Musical {
    String getInstrument();
}

class MusicTeacher extends Human implements Sport, Musical {
    private String subject;
    private String sport;
    private String instrument;

    public MusicTeacher(String name, int age, float height, String subject, String sport, String instrument) {
        super(name, age, height);
        this.subject = subject;
        this.sport = sport;
        this.instrument = instrument;
    }

    public String getSport() {
        return sport;
    }

    public String getInstrument() {
        return instrument;
    }

    public String toString() {
        return super.toString() + " Subject:" + subject + " Sport:" + sport + " Instrument:" + instrument;
    }
}

// ----------------- Hybrid Inheritance (class + interface mix) -----------------
class DoctorMusician extends Human implements Sport, Musical {
    private String specialization;
    private String sport;
    private String instrument;

    public DoctorMusician(String name, int age, float height, String specialization, String sport, String instrument) {
        super(name, age, height);
        this.specialization = specialization;
        this.sport = sport;
        this.instrument = instrument;
    }

    public String getSport() {
        return sport;
    }

    public String getInstrument() {
        return instrument;
    }

    public String toString() {
        return super.toString() + " Specialization:" + specialization + " Sport:" + sport + " Instrument:" + instrument;
    }
}

