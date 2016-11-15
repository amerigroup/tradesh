package tk.mybatis.springboot.mapper;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import tk.mybatis.springboot.model.City2;

import com.tradeshift.Application;

/**
 * @author liuzh
 * @since 2016-03-06 17:42
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@Transactional
@SpringApplicationConfiguration(Application.class)
public class MyBatis331Test {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MyBatis331Mapper mapper;

    @Test
    @Rollback
    public void testInsertList() {
        List<City2> city2List = new ArrayList<City2>();
        city2List.add(new City2("石家庄", "河北"));
        city2List.add(new City2("邯郸", "河北"));
        city2List.add(new City2("秦皇岛", "河北"));
        Assert.assertEquals(3, mapper.insertCities(city2List));
        for (City2 c2 : city2List) {
            logger.info(c2.toString());
            Assert.assertNotNull(c2.getId());
        }
    }

    @Test
    public void testSelectById(){
        City2 city2 = mapper.selectByCityId(1);
        logger.info(city2.toString());
        Assert.assertNotNull(city2);
        Assert.assertNotNull(city2.getCityName());
        Assert.assertNotNull(city2.getCityState());
    }

    @Test
    public void testSelectAll(){
        List<City2> city2List = mapper.selectAll();
        for(City2 c2 : city2List){
            logger.info(c2.toString());
            Assert.assertNotNull(c2);
            Assert.assertNotNull(c2.getCityName());
            Assert.assertNotNull(c2.getCityState());
        }
    }*/

//}