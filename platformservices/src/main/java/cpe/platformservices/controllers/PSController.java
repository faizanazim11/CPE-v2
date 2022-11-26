package cpe.platformservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import cpe.platformservices.models.CodeJob;
import cpe.platformservices.services.PSServices;

@RestController
@RequestMapping("/compilation")
public class PSController {

    @Autowired
    private PSServices psServices;

    @PostMapping("/compileCode")
    @ResponseStatus(code = HttpStatus.CREATED)
    public String addjob(@RequestBody CodeJob codeJob) {
        return psServices.addJob(codeJob);
    }
    
}
