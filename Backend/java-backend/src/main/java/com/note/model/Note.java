package com.note.model;

import jakarta.persistance.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;
    private String title;
    private String filePath;
    private LocalDateTime uploadDate;

    public Note() {

    }

    public Note(String subject, String title, String filePath, LocalDateTime uploadDate) {
        this.subject = subject;
        this.title = title;
        this.filePath = filePath;
        this.uploadDate = uploadDate;
    }

    // Getter and Setter method
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LocalDateTime getUploadDate() {
        return this.uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }
}
