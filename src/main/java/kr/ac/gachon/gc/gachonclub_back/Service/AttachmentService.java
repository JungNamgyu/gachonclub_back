package kr.ac.gachon.gc.gachonclub_back.Service;

import kr.ac.gachon.gc.gachonclub_back.Domain.Attachment;

public interface AttachmentService {

    Attachment findById(Long id);
    Attachment add(Attachment attachment);
    Attachment modify(Attachment attachment);
    boolean deleteById(Long id);

}
