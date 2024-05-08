package wszib.notice_board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wszib.notice_board.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
