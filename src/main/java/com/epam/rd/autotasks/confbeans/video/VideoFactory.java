package com.epam.rd.autotasks.confbeans.video;

import java.time.LocalDateTime;

public class VideoFactory {
    public static Video createVideo1() {
        return new Video("How to boil water",
                LocalDateTime.of(2020, 10, 10, 10, 10));
    }

    public static Video createVideo2() {
        return new Video("How to build a house",
                LocalDateTime.of(2020, 10, 10, 10, 11));
    }

    public static Video createVideo3() {
        return new Video("How to escape solitude",
                LocalDateTime.of(2020, 10, 10, 10, 12));
    }

}
