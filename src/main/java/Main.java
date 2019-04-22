import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        PersonManager manager = PersonManager.getInstance();
        manager.init();

        List<ColumnNameEnum> columnsToExport = new ArrayList<>();
        columnsToExport.add(ColumnNameEnum.ID);
        columnsToExport.add(ColumnNameEnum.NAME);
        columnsToExport.add(ColumnNameEnum.MARRIED);
        columnsToExport.add(ColumnNameEnum.DATE);

        List<Pair<String, ColumnWrapper>> table = new ArrayList<>();

        for (ColumnNameEnum column : columnsToExport) {
            if (column.getLabelName().equals(ColumnNameEnum.ID.getLabelName())) {
                List<Long> ids = manager.getPersonList().stream().map(person -> person.getId()).collect(Collectors.toList());
                LongColumnWrapper longColumn = new LongColumnWrapper();
                longColumn.setColumn(ids);
                table.add(new Pair<>(ColumnNameEnum.ID.getLabelName(), longColumn));

            }
            if (column.getLabelName().equals(ColumnNameEnum.NAME.getLabelName())) {
                List<String> names = manager.getPersonList().stream().map(person -> person.getName()).collect(Collectors.toList());
                StringColumnWrapper stringColumn = new StringColumnWrapper();
                stringColumn.setColumn(names);
                table.add(new Pair<>(ColumnNameEnum.NAME.getLabelName(), stringColumn));

            }
            if (column.getLabelName().equals(ColumnNameEnum.DATE.getLabelName())) {
                List<Date> dates = manager.getPersonList().stream().map(person -> person.getBornDate()).collect(Collectors.toList());
                DateColumnWrapper dateColumn = new DateColumnWrapper();
                dateColumn.setColumn(dates);
                table.add(new Pair<>(ColumnNameEnum.ID.getLabelName(), dateColumn));
            }
            if (column.getLabelName().equals(ColumnNameEnum.MARRIED.getLabelName())) {
                List<Boolean> ifMarried = manager.getPersonList().stream().map(person -> person.getMarried()).collect(Collectors.toList());
                BooleanColumnWrapper marriedItemWrapper = new BooleanColumnWrapper();
                marriedItemWrapper.setColumn(ifMarried);
                table.add(new Pair<>(ColumnNameEnum.ID.getLabelName(), marriedItemWrapper));
            }
        }


        // read from table and write to Excel

        for (Pair<String, ColumnWrapper> column : table) {
            if (column.getValue() instanceof StringColumnWrapper) {
                StringColumnWrapper stringColumn = (StringColumnWrapper) column.getValue();
                System.out.println("=========================");
                System.out.println(column.getKey());
                for (String cell : stringColumn.getColumn()) {
                    // write to Excel
                    System.out.println(cell);
                }
            }
            if (column.getValue() instanceof DateColumnWrapper) {
                DateColumnWrapper dateColumn = (DateColumnWrapper) column.getValue();
                System.out.println("=========================");
                System.out.println(column.getKey());
                for (Date cell : dateColumn.getColumn()) {
                    // write to Excel
                    System.out.println(cell);
                }
            }
            if (column.getValue() instanceof BooleanColumnWrapper) {
                BooleanColumnWrapper booleanColumn = (BooleanColumnWrapper) column.getValue();
                System.out.println("=========================");
                System.out.println(column.getKey());
                for (Boolean cell : booleanColumn.getColumn()) {
                    // write to Excel
                    System.out.println(cell);
                }
            }
            if (column.getValue() instanceof LongColumnWrapper) {
                LongColumnWrapper longColumn = (LongColumnWrapper) column.getValue();
                System.out.println("=========================");
                System.out.println(column.getKey());
                for (Long cell : longColumn.getColumn()) {
                    // write to Excel
                    System.out.println(cell);
                }
            }
        }

    }
}
