package com.example.mediabase.podcasts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PodcastRepository extends CrudRepository<Podcast, Long> {

    Optional<Podcast> findById(Long id);



    //Object getUrl();
}
