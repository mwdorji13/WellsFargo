import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PID;

    @Column(nullable = false)
    private Integer CID;

    @Column(nullable = false)
    private Double totalvalue;

    public Portfolio() {
        // Default constructor required by JPA
    }

    public Portfolio(Integer CID, Double totalvalue) {
        this.CID = CID;
        this.totalvalue = totalvalue;
    }

    // Getters and setters
    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public Integer getCID() {
        return CID;
    }

    public void setCID(Integer CID) {
        this.CID = CID;
    }

    public Double getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(Double totalvalue) {
        this.totalvalue = totalvalue;
    }
}
