package de.janetschel.personal.website.backend.service;

import de.janetschel.personal.website.backend.data.BlogEntryEntity;
import de.janetschel.personal.website.backend.repository.BlogEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogEntryService {
    private final BlogEntryRepository blogEntryRepository;

    public BlogEntryService(BlogEntryRepository blogEntryRepository) {
        this.blogEntryRepository = blogEntryRepository;
    }

    public List<BlogEntryEntity> getBlogEntries() {
        return blogEntryRepository.findAll();
    }
}
