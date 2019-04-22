import java.util.Date;

public class PersonDto {

    private Long id;
    private String name;
    private Date bornDate;
    private Boolean married;

    public PersonDto(){

    }

    public PersonDto(Long id, String name, Date bornDate, Boolean married){
        this.id = id;
        this.name = name;
        this.bornDate = bornDate;
        this.married = married;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }
}
