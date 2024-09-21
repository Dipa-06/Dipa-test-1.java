class Student  {
    private String studentName;
    private int studentAge;

    // Default constructor
    public Student() {
        this.studentName = "dipa";  // Setting default values
        this.studentAge = 30;
    }

    // Parameterized constructor
    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }

    // Getter for studentAge
    public int getStudentAge() {
        return studentAge;
    }
}

class ICE {
    public static void main(String[] args) {
        Student person1 = new Student();  
        Student person2 = new Student("Halder", 21);  

        System.out.println("person1 - Name: " + person1.getStudentName() + ", Age: " + person1.getStudentAge());
        
        System.out.println("person2 - Name: " + person2.getStudentName() + ", Age: " + person2.getStudentAge());
    }
}
