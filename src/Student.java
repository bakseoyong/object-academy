import java.util.List;

public class Student {
    private Integer studentCode;
    private List<Lecture> lectures;

    public Integer getStudentCode(){
        return studentCode;
    }

    private Lecture findFitLecture(Integer lectureCode){
        for (Lecture lecture : lectures) {
            if (lecture.getLectureCode() == lectureCode)
                return lecture;
        }
        return null;
    }

    private void requestVerifyAbsense(Integer lectureCode, String reason){
        findFitLecture(lectureCode).editStudentAttendence(this, new AbsenceDocument(reason));
    }

    private void requestNormalAttend(Integer lectureCode){
        findFitLecture(lectureCode).editStudentAttendence(this);
    }

    private void lectureEvaluation(Integer lectureCode, Integer score){
        findFitLecture(lectureCode).recordEvaluationScore(this, score);
    }

}
