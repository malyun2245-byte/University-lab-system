public class Student {
    String studentId;
    String  StudentName;

    public Student(String StudentId,String StudentName){
        this.studentId = StudentId;

        this.StudentName= StudentName;
    }
    public void displayStudentDetails()
    {
        System.out.println("ID:" +studentId);
        System.out.println("Name:"+ StudentName);
    }

}
