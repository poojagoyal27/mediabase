package com.example.mediabase.podcastsui;

import com.example.mediabase.podcastsui.PodcastUI;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class PodcastsInitialList {

    public List<PodcastUI> asList() {
        return Arrays.asList(new PodcastUI("Wedding Crashers", "David Dobkin", "Comedy", 7, 2005),
                new PodcastUI("Starsky & Hutch", "Todd Phillips", "Action", 6, 2004),
                new PodcastUI("Shanghai Knights", "David Dobkin", "Action", 6, 2003),
                new PodcastUI("I-Spy", "Betty Thomas", "Adventure", 5, 2002),
                new PodcastUI("The Royal Tenenbaums", "Wes Anderson", "Comedy", 8, 2001),
                new PodcastUI("Zoolander", "Ben Stiller", "Comedy", 6, 2001),
                new PodcastUI("Shanghai Noon", "Tom Dey", "Comedy", 7, 2000)

        );
    }
}