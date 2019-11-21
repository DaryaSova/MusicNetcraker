import java.util.Date;

public class Track {
    private int trackID;
    private String title;
    private String album;
    private Date length;
    private Artist artist;


    public Track (String title, Artist artist, Date length, String album) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.album = album;
    }

    public Track (String title, Artist artist, Date length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public Track(int trackID, String album, Date length, Artist artist) {
        this.trackID = trackID;
        this.title = "unknown";
        this.album = album;
        this.length = length;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public Artist getArtist() {
        return artist;
    }

    public Date getLength() {
        return length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void  setArtist () {

    }

    public void setLength (Date length) {
        this.length = length;
    }

    public void setTrackID(int trackID) {
        this.trackID = trackID;
    }


}
