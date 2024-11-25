package com.epam.rd.autotasks.confbeans.config;

import com.epam.rd.autotasks.confbeans.video.Channel;
import com.epam.rd.autotasks.confbeans.video.Video;
import com.epam.rd.autotasks.confbeans.video.VideoStudio;
import com.epam.rd.autotasks.confbeans.video.VideoStudioFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChannelWithVideoStudioConfig {

    @Bean
    public Channel channelBean() {
        Channel channel = new Channel();
        VideoStudio videoStudio = videoStudioBean();
        for (int i = 0; i < 8; i++) {
            channel.addVideo(videoStudio.produce());
        }
        return channel;
    }

    @Bean
    public VideoStudio videoStudioBean() {

        return new VideoStudio() {
            @Override
            public Video produce() {
                return VideoStudioFactory.createVideo();
            }
        };
    }
}
