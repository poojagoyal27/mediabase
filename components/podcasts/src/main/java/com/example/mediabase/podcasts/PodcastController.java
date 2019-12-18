package com.example.mediabase.podcasts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/podcasts")
public class PodcastController {

    private PodcastRepository podcastsRepository;

    public PodcastController(PodcastRepository podcastsRepository) {
        this.podcastsRepository = podcastsRepository;
    }

    @PostMapping
    public ResponseEntity<Podcast> create(@RequestBody Podcast podcast) {

        podcastsRepository.save(podcast);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public List<Podcast> getAll() {
        List<Podcast> podcasts = new ArrayList<>();
        podcastsRepository.findAll().forEach(podcasts::add);
        return podcasts;
    }
}