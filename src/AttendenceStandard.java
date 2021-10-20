import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class AttendenceStandard {
    private LocalTime attend;
    private LocalTime perceive;
    private LocalTime absent;

    AttendenceStandard(LocalTime attend, LocalTime perceive, LocalTime absent){
        this.attend = attend;
        this.perceive = perceive;
        this.absent = absent;
    }

    //요청을 보낸 시간과 비교해 출석, 지각, 결석 리턴
    public String discriminate(){
        if(attend.compareTo(LocalTime.now()) > 0){
            return null;
        }else if(attend.compareTo(LocalTime.now()) <= 0 && perceive.compareTo(LocalTime.now()) >= 0){
            return "출석";
        }else if(perceive.compareTo(LocalTime.now()) < 0 && absent.compareTo(LocalTime.now()) >= 0){
            return "지각";
        }else
            return "결석";
    }


}
