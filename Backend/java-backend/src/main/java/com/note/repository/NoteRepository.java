package com.note.repository;

import com.note.model.Note;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    // 基于方法命名规则
    List<Note> findBySubject(String subject);

    List<Note> findByTitleContaining(String title);

    List<Note> findBySubjectAndTitle(String subject, String title);

    List<Note> findByUploadDateAfter(LocalDateTime date);

    // 使用@Query注解
    @Query("SELECT n FROM Note n WHERE n.subject = :subject")
    List<Note> findNotesBySubject(@Param("subject") String subject);

    // 使用原生SQL
    @Query(value = "SELECT * FROM notes WHERE subject = ?1 AND title LIKE %?2%", nativeQuery = true)
    List<Note> findBySubjectAndTitleLike(String subject, String titleKeyword);

    // 更新操作
    @Modifying
    @Query("UPDATE Note n SET n.filePath = :filePath WHERE n.id = :id")
    void updateFilePath(@Param("id") Long id, @Param("filePath") String filePath);
}