import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author star
 * @Date 2019/10/17.
 * @Description: No Description Yet.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.vmstar.dao")
@ComponentScan("com.vmstar")
@EnableAutoConfiguration
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
