package se.alex.lexicon.g51emailapi.service;


import se.alex.lexicon.g51emailapi.domain.Email;
import se.alex.lexicon.g51emailapi.dto.EmailDTO;

import java.util.List;


public interface EmailService {
    Email createEmail(EmailDTO emailDTO);

    List<Email> getAllEmails( );

    Email getEmailById(Long id);

    void sendEmail(EmailDTO emailDTO);
}