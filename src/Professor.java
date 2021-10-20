import java.util.List;

public class Professor {
    private List<Lecture> lectures;

    public String isReplaceAbsence(AbsenceDocument absenceDocument){
        if(absenceDocument.getReason() == "질병결석" || absenceDocument.getReason() == "생리결석")
            return "대체결석";
        else
            return "결석";
    }

    private void studentRunAway(Integer lectureCode, Student student){
        for(Lecture lecture: lectures){
            if(lecture.getLectureCode() == lectureCode){
                lecture.editStudentAttendence(student, "결석");
            }
        }
    }

    private void allStudentAttendence(Integer lectureCode){
        for(Lecture lecture: lectures){
            if(lecture.getLectureCode() == lectureCode){
                lecture.editAttendenceAllStudent("출석");
            }
        }
    }
}
