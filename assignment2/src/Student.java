public final class Student extends Human implements IStudy {

    private String university;
    private float gpa;

    public final String studentId;

    public Student(int age, String name, boolean isWorking, String university, float gpa, String studentId) {
        super(age, name, isWorking);
        this.university = university;
        this.gpa = gpa;
        this.studentId = studentId;
    }

    @Override
    public String sayYourPosition() {
        return "I am a student";
    }

    @Override
    public String getSpecificInfo() {
        return "Studies at " + university + ", GPA: " + gpa + ", ID: " + studentId;
    }


    @Override
    public String getUniversity() {
        return university;
    }

    @Override
    public float getGpa() {
        return gpa;
    }

    @Override
    public void improveGpa(float increment) {
        gpa += increment;
        System.out.println(name + "'s GPA improved by " + increment + ". New GPA: " + gpa);
    }

    public final void showStudentCard() {
        System.out.println("Student Card -> Name: " + name + ", ID: " + studentId);
    }

    public void setUniversity(String university) { this.university = university; }
    public void setGpa(float gpa) { this.gpa = gpa; }
}
