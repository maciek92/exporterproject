import java.util.List;

public class StringColumnWrapper implements ColumnWrapper {

    private List<String> column;

    public List<String> getColumn() {
        return column;
    }

    public void setColumn(List<String> column) {
        this.column = column;
    }
}
