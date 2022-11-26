package cpe.platformservices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cpe.platformservices.models.CodeJob;

@Repository
public interface CodeJobRepository extends MongoRepository<CodeJob, String> {
    
}
