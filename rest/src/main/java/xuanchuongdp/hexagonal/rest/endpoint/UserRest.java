package xuanchuongdp.hexagonal.rest.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xuanchuongdp.hexagonal.domain.entity.User;
import xuanchuongdp.hexagonal.domain.repository.UserRepository;
import xuanchuongdp.hexagonal.rest.dto.UserDto;

@RestController
public class UserRest {

    private final UserRepository userRepository;

    public UserRest(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/{id}")
    public UserDto getUserById(@PathVariable final Long id) {
        User user = userRepository.getUserById(id);
        UserDto userDto = new UserDto();
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        return userDto;
    }
}
