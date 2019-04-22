import java.util.Date;
import java.util.List;

public class DateColumnWrapper implements ColumnWrapper {

    private List<Date> column;

    public List<Date> getColumn() {
        return column;
    }

    public void setColumn(List<Date> column) {
        this.column = column;
    }
}
