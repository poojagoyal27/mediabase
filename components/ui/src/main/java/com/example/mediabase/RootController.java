package com.example.mediabase;

import com.example.mediabase.moviesui.MovieClient;
import com.example.mediabase.moviesui.MoviesInitialList;
import com.example.mediabase.podcastsui.PodcastClient;
import com.example.mediabase.podcastsui.PodcastUI;
import com.example.mediabase.podcastsui.PodcastsInitialList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class RootController {
    private MovieClient moviesClient;
    private PodcastClient podcastsClient;
    private PodcastsInitialList podcastsInitialList;
     private MoviesInitialList moviesInitialList;

    public RootController(MovieClient moviesClient, PodcastClient podcastsClient, MoviesInitialList moviesInitialList,PodcastsInitialList podcastsInitialList) {
        this.moviesClient = moviesClient;
        this.podcastsClient = podcastsClient;
        this.moviesInitialList =moviesInitialList;
        this.podcastsInitialList = podcastsInitialList;
    }

    @GetMapping("/")
    public String rootPath() {
        return "index";
    }

    @GetMapping("/setup")
    public String setupDatabase(Map<String, Object> model) {

        moviesInitialList.asList().forEach(moviesClient::create);
        model.put("movies", moviesClient.getAll());

        podcastsInitialList.asList().forEach(podcastsClient::create);
        model.put("podcasts", podcastsClient.getAll());

        return "setup";
    }




}
