package xuanchuongdp.hexagonal.data.jpa.repository;

import xuanchuongdp.hexagonal.domain.entity.User;

public class UserRepository implements xuanchuongdp.hexagonal.domain.repository.UserRepository {

    private User existingUser;

    public User getUserById(Long id) {
        if (existingUser == null) {
            existingUser = User.builder().firstName("Chuong").lastName("Nguyen").build();
        }
        return existingUser;
    }
}
