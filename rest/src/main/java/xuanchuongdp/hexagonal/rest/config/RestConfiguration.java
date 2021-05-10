package xuanchuongdp.hexagonal.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xuanchuongdp.hexagonal.domain.repository.UserRepository;
import xuanchuongdp.hexagonal.rest.endpoint.UserRest;

@Configuration
public class RestConfiguration {

    @Bean
    public UserRest userRest(UserRepository userRepository) {
        return new UserRest(userRepository);
    }
}
