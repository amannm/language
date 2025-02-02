package systems.cauldron.service.datalineage;

import java.util.Objects;

public class TableReference {

    private final String databaseName;
    private final String tableName;

    public TableReference(String databaseName, String tableName) {
        this.databaseName = databaseName;
        this.tableName = tableName;
    }

    public String toString() {
        return (databaseName != null ? databaseName + "." : "") + tableName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TableReference that = (TableReference) o;
        return Objects.equals(databaseName, that.databaseName) &&
                tableName.equals(that.tableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, tableName);
    }
}
