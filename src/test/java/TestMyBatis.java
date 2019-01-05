import com.edwardy.dao.BigLottoHistoryDao;
import com.edwardy.dao.DoubleColorDao;
import com.edwardy.po.BigLottoHistory;
import com.edwardy.po.DoubleColor;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yuminghua on 4/29/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class TestMyBatis {
    private static Logger logger= Logger.getLogger(TestMyBatis.class);
    @Autowired
    private DoubleColorDao doubleColorDao;
    @Autowired
    private BigLottoHistoryDao bigLottoHistoryDao;
    /*@Autowired
    private UserDao userDao;
    @Test
    public void testSelectUser() throws Exception {
        Integer id = 1;
        User user = userDao.getUserById(id);
        System.out.println(user.getName());
    }*/

    /*@Test
    public void testGetAllDoubleColor(){
        List<DoubleColor> list = doubleColorDao.getAll();
        for(DoubleColor doubleColor : list){
            System.out.println(doubleColor.getId()+" "+doubleColor.getA());
        }
    }*/

    /*@Test
    public void testGetAllBigLotto(){
        List<BigLottoHistory> list = bigLottoHistoryDao.listByPage(1,10);
        for(BigLottoHistory bigLottoHistory : list) {
            System.out.println(bigLottoHistory.getId() + " " + bigLottoHistory.getRed1());
        }
    }*/
    @Test
    public void testGetCount(){
        System.out.println(bigLottoHistoryDao.getCount());
    }
}
