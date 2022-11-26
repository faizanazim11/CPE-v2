package cpe.platformservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cpe.platformservices.models.CodeJob;
import cpe.platformservices.repository.CodeJobRepository;
import lombok.extern.apachecommons.CommonsLog;

@Service
@CommonsLog
public class PSServices {
    
    @Autowired
    private CodeJobRepository codeJobRepository;

    public String addJob(CodeJob codeJob) {
        try {
            log.debug("Trying to add job" + codeJob);
            codeJobRepository.save(codeJob);
            return codeJob.getJobId();
        } catch (Exception e) {
            log.error("Exception while adding job!", e);
            e.printStackTrace();
            throw e;
        }
    }

}
