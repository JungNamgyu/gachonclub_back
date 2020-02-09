package kr.ac.gachon.gc.gachonclub_back.Service;

import kr.ac.gachon.gc.gachonclub_back.Domain.Attachment;
import kr.ac.gachon.gc.gachonclub_back.Repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AttachmentServiceImpl implements AttachmentService{

    @Autowired
    AttachmentRepository attachmentRepository;

    @Override
    public Attachment findById(Long id) {
        return this.attachmentRepository.findById(id).orElse(null);
    }

    @Override
    public Attachment add(Attachment attachment) {
        return this.attachmentRepository.save(attachment);
    }

    @Override
    public Attachment modify(Attachment attachment) {
        return this.attachmentRepository.findById(attachment.get_id())
                .map(a -> {
                    return this.attachmentRepository.save(a);
                })
                .orElse(null);
    }

    @Override
    public boolean deleteById(Long id) {
        Attachment found = this.findById(id);
        if(found != null){
            attachmentRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
