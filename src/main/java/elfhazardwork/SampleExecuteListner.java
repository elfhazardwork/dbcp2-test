package elfhazardwork;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.ManagedBean;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;
import java.sql.SQLException;

@ManagedBean
public class SampleExecuteListner implements ServletContextListener {
    @Autowired
    private DataSource dataSource;

    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("is this call?");
        try {
            ((BasicDataSource)dataSource).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
