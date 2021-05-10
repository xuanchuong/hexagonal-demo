package xuanchuongdp.data.jpa.repository;

import xuanchuongdp.domain.entity.User;

public class UserRepository implements xuanchuongdp.domain.repository.UserRepository {

    private User existingUser;

    public User getUserById(Long id) {
        if (existingUser == null) {
            existingUser = User.builder().firstName("Chuong").lastName("Nguyen").build();
        }
        return existingUser;
    }
}
