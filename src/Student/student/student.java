package Student.student;

public class student {
    private String firstName;
    private String lastName;
    private int studentId;

    public student(){

    }
    public student(String firstName,String lastName,int studentId){
        this.firstName=firstName;
        this.lastName=lastName;
        this.studentId=studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}