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
@Table(name = "PLAYLIST_SONG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PlaylistSong.findAll", query = "SELECT p FROM PlaylistSong p"),
    @NamedQuery(name = "PlaylistSong.findByPlaylistId", query = "SELECT p FROM PlaylistSong p WHERE p.playlistSongPK.playlistId = :playlistId"),
    @NamedQuery(name = "PlaylistSong.findBySongId", query = "SELECT p FROM PlaylistSong p WHERE p.playlistSongPK.songId = :songId"),
    @NamedQuery(name = "PlaylistSong.findByOrderNumber", query = "SELECT p FROM PlaylistSong p WHERE p.orderNumber = :orderNumber")})
public class PlaylistSong implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlaylistSongPK playlistSongPK;
    @Basic(optional = false)
    @Column(name = "ORDER_NUMBER")
    private int orderNumber;
    @JoinColumn(name = "PLAYLIST_ID", referencedColumnName = "PLAYLIST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Playlist playlist;
    @JoinColumn(name = "SONG_ID", referencedColumnName = "SONG_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Song song;

    public PlaylistSong() {
    }

    public PlaylistSong(PlaylistSongPK playlistSongPK) {
        this.playlistSongPK = playlistSongPK;
    }

    public PlaylistSong(PlaylistSongPK playlistSongPK, int orderNumber) {
        this.playlistSongPK = playlistSongPK;
        this.orderNumber = orderNumber;
    }

    public PlaylistSong(long playlistId, long songId) {
        this.playlistSongPK = new PlaylistSongPK(playlistId, songId);
    }

    public PlaylistSongPK getPlaylistSongPK() {
        return playlistSongPK;
    }

    public void setPlaylistSongPK(PlaylistSongPK playlistSongPK) {
        this.playlistSongPK = playlistSongPK;
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
        hash += (playlistSongPK != null ? playlistSongPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaylistSong)) {
            return false;
        }
        PlaylistSong other = (PlaylistSong) object;
        if ((this.playlistSongPK == null && other.playlistSongPK != null) || (this.playlistSongPK != null && !this.playlistSongPK.equals(other.playlistSongPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.PlaylistSong[ playlistSongPK=" + playlistSongPK + " ]";
    }
    
}
