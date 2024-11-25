package com.epam.rd.autotasks.confbeans.config;

import com.epam.rd.autotasks.confbeans.video.Channel;
import com.epam.rd.autotasks.confbeans.video.Video;
import com.epam.rd.autotasks.confbeans.video.VideoFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDateTime;


@Configuration
public class SingletonChannelConfig {
    @Bean
    public Video video1() {
        return VideoFactory.createVideo1();
    }

    @Bean
    public Video video2() {
        return VideoFactory.createVideo2();
    }

    @Bean
    public Video video3() {
        return VideoFactory.createVideo3();
    }

    @Bean
    public Channel channel() {
        Channel channel = new Channel();
        channel.addVideo(video1());
        channel.addVideo(video2());
        channel.addVideo(video3());
        return channel;
    }
    }

