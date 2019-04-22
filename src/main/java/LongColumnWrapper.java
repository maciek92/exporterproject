import java.util.List;

public class LongColumnWrapper implements ColumnWrapper{

    private List<Long> column;

    public List<Long> getColumn() {
        return column;
    }

    public void setColumn(List<Long> column) {
        this.column = column;
    }
}
