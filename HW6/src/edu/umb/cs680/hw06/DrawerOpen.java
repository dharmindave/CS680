package edu.umb.cs680.hw06;
public class DrawerOpen implements State {

    private static DrawerOpen drawerOpen;
    private DvdPlayer dvd_player;

    private DrawerOpen() {
        dvd_player = DvdPlayer.getInstance();
    }

    public static DrawerOpen getInstance() {
        if (drawerOpen == null)
            drawerOpen = new DrawerOpen();

        return drawerOpen;
    }

    @Override
    public void openCloseButtonPushed() {
        dvd_player.close();
        dvd_player.changeState(DrawerClosedNotPlaying.getInstance());
        System.out.print("Close");

    }

    @Override
    public void playButtonPushed() {
        dvd_player.close();
        dvd_player.play();
        dvd_player.changeState(DrawerClosedPlaying.getInstance());
        System.out.print("Play");

    }

    @Override
    public void stopButtonPushed() {
        System.out.print("Is empty");

    }
}