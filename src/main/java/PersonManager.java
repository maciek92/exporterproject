import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonManager {

    private static PersonManager instance;

    private List<PersonDto> personList;

    public void init() {
        personList = new ArrayList<>();
        insertDummyData();

    }

    private PersonManager() {}

    public static synchronized PersonManager getInstance() {
        if (instance == null) {
            instance = new PersonManager();
        }
        return instance;
    }

    public void insertDummyData() {
        personList.add(new PersonDto(1L, "Joe Doe", new Date(1990, 3, 12), true));
        personList.add(new PersonDto(2L, "John Smith", new Date(1978, 1, 4), false));
        personList.add(new PersonDto(3L, "Alexis Corney", new Date(1990, 7, 17), false));
    }

    public List<PersonDto> getPersonList() {
        return personList;
    }

    public void setPersonList(List<PersonDto> personList) {

        this.personList = personList;
    }
}
