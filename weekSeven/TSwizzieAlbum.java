package weekSeven;

import java.util.Scanner;

public class TSwizzieAlbum {
    private String albumName;
    private int releaseYear;
    private int songsInAlbum;

    public TSwizzieAlbum(String albumName, int releaseYear, int songsInAlbum) {
        this.albumName = albumName;
        this.releaseYear = releaseYear;
        this.songsInAlbum = songsInAlbum;
    }

    public void printDetails() {
        System.out.println("Album: " + albumName);
        System.out.println("Year Released: " + releaseYear);
        System.out.println("Songs in the Album: " + songsInAlbum);
    }

    public static void main(String[] args) {
        // scanner to let user put in details
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Taylor Swift album: ");
        String albumName = scanner.nextLine();

        System.out.println("Enter the year the album was released: ");
        int releaseYear = scanner.nextInt();

        System.out.println("Enter the amount of songs in that album: ");
        int songsInAlbum = scanner.nextInt();

        TSwizzieAlbum album = new TSwizzieAlbum(albumName, releaseYear, songsInAlbum);  //code tweaks out without this for some reason

        album.printDetails();  // printing the details of album

        scanner.close();
    }
}
