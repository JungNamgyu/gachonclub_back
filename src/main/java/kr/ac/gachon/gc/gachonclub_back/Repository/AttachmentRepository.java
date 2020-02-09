package kr.ac.gachon.gc.gachonclub_back.Repository;

import kr.ac.gachon.gc.gachonclub_back.Domain.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
