package xuanchuongdp.hexagonal.data.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xuanchuongdp.hexagonal.domain.repository.UserRepository;

@Configuration
public class DataJpaConfiguration {

    @Bean
    public UserRepository userRepository() {
        return new xuanchuongdp.hexagonal.data.jpa.repository.UserRepository();
    }
}
