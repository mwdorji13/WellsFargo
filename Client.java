import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CID;

    @Column(nullable = false)
    private Integer FAID;

    @Column(nullable = false)
    private String Cname;

    @Column(nullable = false, unique = true)
    private String Cemail;

    @Column(nullable = false)
    private String Cphno;

    public Client() {
        // Default constructor required by JPA
    }

    public Client(Integer FAID, String Cname, String Cemail, String Cphno) {
        this.FAID = FAID;
        this.Cname = Cname;
        this.Cemail = Cemail;
        this.Cphno = Cphno;
    }

    // Getters and setters
    public Integer getCID() {
        return CID;
    }

    public void setCID(Integer CID) {
        this.CID = CID;
    }

    public Integer getFAID() {
        return FAID;
    }

    public void setFAID(Integer FAID) {
        this.FAID = FAID;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public String getCemail() {
        return Cemail;
    }

    public void setCemail(String Cemail) {
        this.Cemail = Cemail;
    }

    public String getCphno() {
        return Cphno;
    }

    public void setCphno(String Cphno) {
        this.Cphno = Cphno;
    }
}
