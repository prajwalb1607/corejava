package com.xworkz.interfaces.interfacess;

    public interface MusicPlayer {
        public static final String NAME = "Spotify";
        public static final int MAX_VOLUME = 100;
        public static final boolean OFFLINE_SUPPORT = true;
        public static final String AUDIO_QUALITY = "HD";
        public static final String TYPE = "Online";

        public abstract void play();
        public abstract void pause();
        public abstract void stop();
        public abstract void next();
        public abstract void previous();
    }

