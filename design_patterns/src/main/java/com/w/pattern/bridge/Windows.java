package com.w.pattern.bridge;

/**
 * @author blue
 * @version 1.0
 */
public class Windows extends OperatingSystem{

    public Windows(IVideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
