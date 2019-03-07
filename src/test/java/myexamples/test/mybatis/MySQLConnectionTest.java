package myexamples.test.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:../../../../../main/webapp/WEB-INF/spring/appconfig-root.xml"})
public class MySQLConnectionTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void testConnection() throws Exception {
        try (Connection connection = dataSource.getConnection()){
            System.out.println("커넥션 테스트"+connection+"\n");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
