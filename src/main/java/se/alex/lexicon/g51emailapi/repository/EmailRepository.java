package se.alex.lexicon.g51emailapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.alex.lexicon.g51emailapi.domain.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
