import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SID;

    @Column(nullable = false)
    private Integer PID;

    @Column(nullable = false)
    private String Sname;

    @Column(nullable = false)
    private String Scategory;

    @Column(nullable = false)
    private String SpurchaseDate;

    @Column(nullable = false)
    private Double SpurchasePrice;

    @Column(nullable = false)
    private Integer Squantity;

    public Security() {
        // Default constructor required by JPA
    }

    public Security(Integer PID, String Sname, String Scategory, String SpurchaseDate, Double SpurchasePrice, Integer Squantity) {
        this.PID = PID;
        this.Sname = Sname;
        this.Scategory = Scategory;
        this.SpurchaseDate = SpurchaseDate;
        this.SpurchasePrice = SpurchasePrice;
        this.Squantity = Squantity;
    }

    // Getters and setters
    public Integer getSID() {
        return SID;
    }

    public void setSID(Integer SID) {
        this.SID = SID;
    }

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String Sname) {
        this.Sname = Sname;
    }

    public String getScategory() {
        return Scategory;
    }

    public void setScategory(String Scategory) {
        this.Scategory = Scategory;
    }

    public String getSpurchaseDate() {
        return SpurchaseDate;
    }

    public void setSpurchaseDate(String SpurchaseDate) {
        this.SpurchaseDate = SpurchaseDate;
    }

    public Double getSpurchasePrice() {
        return SpurchasePrice;
    }

    public void setSpurchasePrice(Double SpurchasePrice) {
        this.SpurchasePrice = SpurchasePrice;
    }

    public Integer getSquantity() {
        return Squantity;
    }

    public void setSquantity(Integer Squantity) {
        this.Squantity = Squantity;
    }
}
