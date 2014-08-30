package mapper;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import dbinterface.DatabaseConnection;

import java.io.IOException;
import java.util.List;

public class TodoListMapper {

    private final DatabaseConnection databaseConnection;

    public TodoListMapper() throws IOException {
        databaseConnection = DatabaseConnection.factory();
    }

    public void save(BasicDBObject todoItem) throws IOException {
        databaseConnection.persist(todoItem);
    }

    public List<DBObject> get() {
        return databaseConnection.getAll();
    }

    public void delete() {
        databaseConnection.delete();
    }
}
