package testDB;

import libs.DataBase;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static libs.ConfigData.getCfgValue;

public class TestDataBese {
    Logger logger= Logger.getLogger(getClass());
    DataBase dataBase;

    @Before
    public void setUp() throws SQLException, IOException, ClassNotFoundException{
     new DataBase("MySQL_PADB_DB","MySQL");
    }
    @After
    public void tearDown() throws SQLException{
        dataBase.quit();
    }

    @Test
    public void testWithDataBase() throws SQLException{
        List<Map<String,String>> testData = dataBase.selectTable("select * from seleniumTable");
        logger.info(testData.get(3));
        dataBase.modifyTable("INSERT INTO seleniumTable VALUE (2002, 'Vitalii', 'pass8')");
        logger.info(dataBase.selectTable("select * from seleniumTable where login='Vitalii'"));
        logger.info(dataBase.selectTable("select * from seleniumTable where idNumber='2002'"));
    }

    public TestDataBese(String db,String driver) throws IOException {
        String url = getCfgValue(db);
    }
}
