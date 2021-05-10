package xuanchuongdp.data.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xuanchuongdp.domain.repository.UserRepository;

@Configuration
public class DataJpaConfiguration {

    @Bean
    public UserRepository userRepository() {
        return new xuanchuongdp.data.jpa.repository.UserRepository();
    }
}
