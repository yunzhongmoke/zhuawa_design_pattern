package com.w.pattern.bridge;

/**
 * @author blue
 * @version 1.0
 */
public abstract class OperatingSystem {

    //聚合IVideoFile
    protected IVideoFile videoFile;

    public OperatingSystem(IVideoFile videoFile) {
        this.videoFile = videoFile;
    }

    //播放音频文件
    public abstract void play(String fileName);
}
