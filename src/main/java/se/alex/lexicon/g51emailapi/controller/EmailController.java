package se.alex.lexicon.g51emailapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.alex.lexicon.g51emailapi.service.EmailService;
import se.alex.lexicon.g51emailapi.domain.Email;
import se.alex.lexicon.g51emailapi.dto.EmailDTO;

import java.util.List;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public ResponseEntity<Email> createEmail(@RequestBody EmailDTO emailDTO) {
        Email createdEmail = emailService.createEmail(emailDTO);
        return new ResponseEntity<>(createdEmail, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Email>> getAllEmails() {
        List< Email > emails = emailService.getAllEmails();
        return ResponseEntity.ok(emails);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Email> getEmailById(@PathVariable Long id) {
        Email email = emailService.getEmailById(id);
        return email != null ? ResponseEntity.ok(email) : ResponseEntity.notFound().build();
    }

    @PostMapping("/send")
    public ResponseEntity<Void> sendEmail(@RequestBody EmailDTO emailDTO) {
        emailService.sendEmail(emailDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}