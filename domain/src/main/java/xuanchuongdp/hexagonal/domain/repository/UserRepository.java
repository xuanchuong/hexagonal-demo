package xuanchuongdp.hexagonal.domain.repository;

import xuanchuongdp.hexagonal.domain.entity.User;

public interface UserRepository {
    User getUserById(Long id);
}
