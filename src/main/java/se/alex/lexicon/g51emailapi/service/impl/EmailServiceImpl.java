package se.alex.lexicon.g51emailapi.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import se.alex.lexicon.g51emailapi.domain.Email;
import se.alex.lexicon.g51emailapi.dto.EmailDTO;
import se.alex.lexicon.g51emailapi.repository.EmailRepository;
import se.alex.lexicon.g51emailapi.service.EmailService;

import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {

    private final EmailRepository emailRepository;
    private final JavaMailSender mailSender;

    @Autowired
    public EmailServiceImpl(EmailRepository emailRepository, JavaMailSender mailSender) {
        this.emailRepository = emailRepository;
        this.mailSender = mailSender;
    }


    @Override
    public Email createEmail ( EmailDTO emailDTO ) {
        return null;
    }

    @Override
    public List<Email> getAllEmails() {
        return emailRepository.findAll();
    }

    @Override
    public Email getEmailById(Long id) {
        return emailRepository.findById(id).orElse(null);
    }

    @Override
    public void sendEmail(EmailDTO emailDTO) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(emailDTO.getRecipient());
        message.setSubject(emailDTO.getSubject());
        message.setText(emailDTO.getBody());
        mailSender.send(message);
    }
}