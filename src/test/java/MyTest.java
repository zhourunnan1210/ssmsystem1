import com.zrn.pojo.Teachers;
import com.zrn.service.StudentService;
import com.zrn.service.StudentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;
    @Test
    public void test(){
        /**
         * 接排错思路中的，new一个CPX来获取spring中的所有配置文件，即拿到所有的bean
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentServiceImpl = (StudentService)context.getBean("StudentServiceImpl");
        for(Teachers teachers : studentServiceImpl.queryAll()){
            System.out.println(teachers);
        }
    }
}
