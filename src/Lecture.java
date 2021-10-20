import java.util.List;

public class Lecture {
    private Integer lectureCode;
    private Professor professor;
    private AttendenceStandard attendenceStandard;
    private List<Attendence> attendences;
    private List<Evaluation> evaluations;

    Lecture(){

    }

    public Integer getLectureCode(){
        return lectureCode;
    }

    private Attendence findFitAttendence(Student student){
        for(Attendence attendence: attendences){
            if(student.getStudentCode() == attendence.getStudentCode())
                return attendence;
        }
        return null;
    }

    private Evaluation findFitEvaluation(Student student){
        for(Evaluation evaluation: evaluations){
            if(student.getStudentCode() == evaluation.getStudentCode())
                return evaluation;
        }
        return null;
    }

    public Integer calculateStudentNum(){
        return attendences.size();
    }

    public void editStudentAttendence(Student student){
        findFitAttendence(student).setAttendenceStatus(attendenceStandard.discriminate());
    }

    public void editStudentAttendence(Student student, String status){
        findFitAttendence(student).setAttendenceStatus(status);
    }

    public void editStudentAttendence(Student student, AbsenceDocument absenceDocument){
        findFitAttendence(student).setAttendenceStatus(professor.isReplaceAbsence(absenceDocument));
    }

    public void editAttendenceAllStudent(String status){
        for(Attendence attendence: attendences){
            attendence.setAttendenceStatus(status);
        }
    }

    public void recordEvaluationScore(Student student, Integer score){
        findFitEvaluation(student).setScore(score);
    }
}
