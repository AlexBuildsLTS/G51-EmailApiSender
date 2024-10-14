package se.alex.lexicon.g51emailapi.repository;

import se.alex.lexicon.g51emailapi.domain.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}