/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation_POJO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author eliastsourapas
 */
@Embeddable
public class PlaylistSongPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PLAYLIST_ID")
    private long playlistId;
    @Basic(optional = false)
    @Column(name = "SONG_ID")
    private long songId;

    public PlaylistSongPK() {
    }

    public PlaylistSongPK(long playlistId, long songId) {
        this.playlistId = playlistId;
        this.songId = songId;
    }

    public long getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(long playlistId) {
        this.playlistId = playlistId;
    }

    public long getSongId() {
        return songId;
    }

    public void setSongId(long songId) {
        this.songId = songId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) playlistId;
        hash += (int) songId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlaylistSongPK)) {
            return false;
        }
        PlaylistSongPK other = (PlaylistSongPK) object;
        if (this.playlistId != other.playlistId) {
            return false;
        }
        if (this.songId != other.songId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.PlaylistSongPK[ playlistId=" + playlistId + ", songId=" + songId + " ]";
    }
    
}
