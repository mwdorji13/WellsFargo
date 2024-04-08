import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer FAID;

    @Column(nullable = false)
    private String Fname;

    @Column(nullable = false, unique = true)
    private String Femail;

    @Column(nullable = false)
    private String Fpassword;

    @Column(nullable = false)
    private String Fstarttime;

    @Column(nullable = false)
    private String Fendtime;

    public FinancialAdvisor() {
        // Default constructor required by JPA
    }

    public FinancialAdvisor(String Fname, String Femail, String Fpassword, String Fstarttime, String Fendtime) {
        this.Fname = Fname;
        this.Femail = Femail;
        this.Fpassword = Fpassword;
        this.Fstarttime = Fstarttime;
        this.Fendtime = Fendtime;
    }

    // Getters and setters
    public Integer getFAID() {
        return FAID;
    }

    public void setFAID(Integer FAID) {
        this.FAID = FAID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getFemail() {
        return Femail;
    }

    public void setFemail(String Femail) {
        this.Femail = Femail;
    }

    public String getFpassword() {
        return Fpassword;
    }

    public void setFpassword(String Fpassword) {
        this.Fpassword = Fpassword;
    }

    public String getFstarttime() {
        return Fstarttime;
    }

    public void setFstarttime(String Fstarttime) {
        this.Fstarttime = Fstarttime;
    }

    public String getFendtime() {
        return Fendtime;
    }

    public void setFendtime(String Fendtime) {
        this.Fendtime = Fendtime;
    }
}
