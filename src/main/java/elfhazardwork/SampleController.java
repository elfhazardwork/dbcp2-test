package elfhazardwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.SQLException;

@Controller
public class SampleController {
    @Autowired
    private DataSource dataSource;

    @RequestMapping(value = "/")
    @ResponseBody
    public String test() throws SQLException {
        dataSource.getConnection();
        return "test";
    }
}
