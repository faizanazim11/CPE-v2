package cpe.platformservices.models;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="CodeJob")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CodeJob {

    @Id
    private String jobId;

    private String codeLanguage;

    private String codeExecutable;

    CodeJob(String codeLanguage, String codeExecutable) {
        this.codeLanguage = codeLanguage;
        this.codeExecutable = codeExecutable;
        this.jobId = UUID.randomUUID().toString();
    }

}
