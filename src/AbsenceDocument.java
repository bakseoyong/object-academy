import java.time.LocalDate;

public class AbsenceDocument {
    private String reason;

    AbsenceDocument(String reason){
        this.reason = reason;
    }

    public String getReason(){
        return reason;
    }

}
