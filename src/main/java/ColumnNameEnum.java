public enum ColumnNameEnum {
    ID("id"),
    NAME("name"),
    DATE("date"),
    MARRIED("married");

    private final String labelName;

    ColumnNameEnum(String label) {
        this.labelName = label;
    }

    public String getLabelName(){
        return this.labelName;
    }
}
