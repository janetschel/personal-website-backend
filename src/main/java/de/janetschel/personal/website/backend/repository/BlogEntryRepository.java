package de.janetschel.personal.website.backend.repository;

import de.janetschel.personal.website.backend.data.BlogEntryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogEntryRepository extends MongoRepository<BlogEntryEntity, String> {

}
