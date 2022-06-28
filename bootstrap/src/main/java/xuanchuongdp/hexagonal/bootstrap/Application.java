package xuanchuongdp.hexagonal.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import xuanchuongdp.hexagonal.data.jpa.config.DataJpaConfiguration;
import xuanchuongdp.hexagonal.rest.config.RestConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@Import({
    DataJpaConfiguration.class,
    RestConfiguration.class
})
public class Application {
    // test 14:51

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
