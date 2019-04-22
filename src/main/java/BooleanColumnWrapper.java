import java.util.List;

public class BooleanColumnWrapper implements ColumnWrapper {

    private List<Boolean> column;

    public List<Boolean> getColumn() {
        return column;
    }

    public void setColumn(List<Boolean> column) {
        this.column = column;
    }
}

