import java.util.List;

public class Attendence {
    private Student student;
    private String attendenceStatus;

    public Integer getStudentCode(){
        return student.getStudentCode();
    }

    public void setAttendenceStatus(String status){
        this.attendenceStatus = status;
    }
}
