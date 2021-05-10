package xuanchuongdp.hexagonal.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import xuanchuongdp.hexagonal.domain.repository.UserRepository;
import xuanchuongdp.hexagonal.rest.endpoint.UserRest;

@Configuration
public class RestConfiguration {

    @Bean
    public UserRest userRest(UserRepository userRepository) {
        return new UserRest(userRepository);
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build();
    }
}
