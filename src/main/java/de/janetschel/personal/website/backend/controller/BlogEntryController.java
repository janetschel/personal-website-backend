package de.janetschel.personal.website.backend.controller;

import de.janetschel.personal.website.backend.data.BlogEntryEntity;
import de.janetschel.personal.website.backend.service.BlogEntryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogEntryController {
    private final BlogEntryService blogEntryService;

    public BlogEntryController(BlogEntryService blogEntryService) {
        this.blogEntryService = blogEntryService;
    }

    @GetMapping("/api/blogEntries")
    public List<BlogEntryEntity> getBlogEntries() {
        return  blogEntryService.getBlogEntries();
    }
}
