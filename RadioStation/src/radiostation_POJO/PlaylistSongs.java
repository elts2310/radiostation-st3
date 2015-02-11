/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation_POJO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author eliastsourapas
 */
@Entity
@Table(name = "PLAYLIST_SONGS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaylistSongs.findAll", query = "SELECT p FROM PlaylistSongs p"),
    @NamedQuery(name = "PlaylistSongs.findByPlaylistId", query = "SELECT p FROM PlaylistSongs p WHERE p.playlistSongsPK.playlistId = :playlistId"),
    @NamedQuery(name = "PlaylistSongs.findBySongId", query = "SELECT p FROM PlaylistSongs p WHERE p.playlistSongsPK.songId = :songId"),
    @NamedQuery(name = "PlaylistSongs.findByOrderNumber", query = "SELECT p FROM PlaylistSongs p WHERE p.orderNumber = :orderNumber")})
public class PlaylistSongs implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlaylistSongsPK playlistSongsPK;
    @Basic(optional = false)
    @Column(name = "ORDER_NUMBER")
    private int orderNumber;
    @JoinColumn(name = "PLAYLIST_ID", referencedColumnName = "PLAYLIST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Playlist playlist;
    @JoinColumn(name = "SONG_ID", referencedColumnName = "SONG_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Song song;

    public PlaylistSongs() {
    }

    public PlaylistSongs(PlaylistSongsPK playlistSongsPK) {
        this.playlistSongsPK = playlistSongsPK;
    }

    public PlaylistSongs(PlaylistSongsPK playlistSongsPK, int orderNumber) {
        this.playlistSongsPK = playlistSongsPK;
        this.orderNumber = orderNumber;
    }

    public PlaylistSongs(long playlistId, long songId) {
        this.playlistSongsPK = new PlaylistSongsPK(playlistId, songId);
    }

    public PlaylistSongsPK getPlaylistSongsPK() {
        return playlistSongsPK;
    }

    public void setPlaylistSongsPK(PlaylistSongsPK playlistSongsPK) {
        this.playlistSongsPK = playlistSongsPK;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (playlistSongsPK != null ? playlistSongsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaylistSongs)) {
            return false;
        }
        PlaylistSongs other = (PlaylistSongs) object;
        if ((this.playlistSongsPK == null && other.playlistSongsPK != null) || (this.playlistSongsPK != null && !this.playlistSongsPK.equals(other.playlistSongsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.PlaylistSongs[ playlistSongsPK=" + playlistSongsPK + " ]";
    }
    
}
