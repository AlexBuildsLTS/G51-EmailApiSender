package se.alex.lexicon.g51emailapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51emailapi.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
