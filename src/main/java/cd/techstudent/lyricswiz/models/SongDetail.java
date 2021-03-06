package cd.techstudent.lyricswiz.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class SongDetail {

    @JsonProperty("apple_music_id")
    private String appleMusicId;

    @JsonProperty("apple_music_player_url")
    private String appleMusicPlayerUrl;

    @JsonProperty("path")
    private String lyricsUrl;

    private SongLyrics songLyrics;

    public String getAppleMusicId() {
        return appleMusicId;
    }

    public void setAppleMusicId(String appleMusicId) {
        this.appleMusicId = appleMusicId;
    }

    public String getAppleMusicPlayerUrl() {
        return appleMusicPlayerUrl;
    }

    public void setAppleMusicPlayerUrl(String appleMusicPlayerUrl) {
        this.appleMusicPlayerUrl = appleMusicPlayerUrl;
    }

    public String getLyricsUrl() {
        return lyricsUrl;
    }

    public void setLyricsUrl(String lyricsUrl) {
        this.lyricsUrl = lyricsUrl;
    }

    public SongLyrics getSongLyrics() {
        return songLyrics;
    }

    public void setSongLyrics(SongLyrics songLyrics) {
        this.songLyrics = songLyrics;
    }
}
