import com.marving.spring.model.Knight;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mercop on 2017/6/25.
 */
public class SpringFrameworkTest {

    @Test //Spring bean注入测试
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

    }
}
