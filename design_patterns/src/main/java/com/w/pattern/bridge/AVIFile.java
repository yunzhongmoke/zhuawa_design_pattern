package com.w.pattern.bridge;

/**
 * @author blue
 * @version 1.0
 */
public class AVIFile implements IVideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi " + fileName);
    }
}
