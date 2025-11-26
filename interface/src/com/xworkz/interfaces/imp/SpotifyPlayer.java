package com.xworkz.interfaces.imp;


import com.xworkz.interfaces.interfacess.MusicPlayer;

public class SpotifyPlayer implements MusicPlayer {

    public void play(){ System.out.println("Playing Music"); }
    public void pause(){ System.out.println("Paused"); }
    public void stop(){ System.out.println("Stopped"); }
    public void next(){ System.out.println("Next Song"); }
    public void previous(){ System.out.println("Previous Song"); }
}
