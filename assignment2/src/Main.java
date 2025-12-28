public class Main {
    public static void main(String[] args) {

        Human h1 = new Employee(32, "Amir", true, "Qazyna", 20000);
        Employee emp = new Employee(25, "Dias", true, "Kaspi", 15000);
        IWorkable workRef = new Employee(40, "Aidin", true, "Halyk", 30000);

        Human h2 = new Student(19, "Aisha", false, "AITU", 2.7f, "ST-2504");
        Student st = new Student(18, "Dana", false, "AITU", 3.6f, "MT-2502");
        IStudy studyRef = new Student(20, "Madi", false, "AITU", 3.1f, "CS-2505");

        System.out.println(h1.sayYourPosition());
        System.out.println(h1.getSpecificInfo());
        System.out.println(h1.getName());
        System.out.println(h1.getAge());
        System.out.println(h1.getHaveWork());

        System.out.println(emp.sayYourPosition());
        System.out.println(emp.getCompany());
        emp.increaseSalary(2000);
        System.out.println(emp.workStatus());
        System.out.println(emp.getUniversity());
        System.out.println(emp.getGpa());
        emp.improveGpa(1.0f); // shows message

        workRef.increaseSalary(500);
        System.out.println(workRef.getCompany());
        System.out.println(workRef.workStatus());

        System.out.println(h2.sayYourPosition());
        System.out.println(h2.getSpecificInfo());

        System.out.println(st.getUniversity());
        System.out.println(st.getGpa());
        st.improveGpa(0.2f);
        st.showStudentCard();
        System.out.println(st.studentId);

        System.out.println(studyRef.getUniversity());
        System.out.println(studyRef.getGpa());
        studyRef.improveGpa(0.3f);
    }
}
