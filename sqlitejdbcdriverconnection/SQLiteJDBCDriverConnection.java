package sqlitejdbcdriverconnection;

import static sqlitejdbcdriverconnection.Create.createNewTables;

public class SQLiteJDBCDriverConnection {

    public static void main(String[] args) {

        createNewTables();
        Consultas consulta = new Consultas();
        consulta.setVisible(true);    
    }
}
