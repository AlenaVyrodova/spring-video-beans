package com.epam.rd.autotasks.confbeans.video;

import java.time.LocalDateTime;

public class VideoStudioFactory {
    private static int videoVersion = 1;
    private static LocalDateTime creationDateTime =
            LocalDateTime.of(2001, 10, 18, 10, 0);
    private static final String MOVIE_NAME = "Cat & Curious %d";

    public static Video createVideo() {
        Video video = new Video(String.format(MOVIE_NAME, videoVersion++), creationDateTime);
        creationDateTime = creationDateTime.plusYears(2);
        return video;
    }
}
