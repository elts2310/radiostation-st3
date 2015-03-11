/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation_POJO;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Panos
 */
@Entity
@Table(name = "SONG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Song.findAll", query = "SELECT s FROM Song s"),
    @NamedQuery(name = "Song.findBySongId", query = "SELECT s FROM Song s WHERE s.songId = :songId"),
    @NamedQuery(name = "Song.findByTitle", query = "SELECT s FROM Song s WHERE s.title = :title"),
    @NamedQuery(name = "Song.findByDuration", query = "SELECT s FROM Song s WHERE s.duration = :duration"),
    @NamedQuery(name = "Song.findByTrackNr", query = "SELECT s FROM Song s WHERE s.trackNr = :trackNr")})
public class Song implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SONG_ID")
    private Integer songId;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "DURATION")
    private int duration;
    @Basic(optional = false)
    @Column(name = "TRACK_NR")
    private int trackNr;
    @ManyToMany(mappedBy = "songCollection")
    private Collection<Playlist> playlistCollection;
    @JoinColumn(name = "ALBUM_ID", referencedColumnName = "ALBUM_ID")
    @ManyToOne(optional = false)
    private Album albumId;

    public Song() {
    }

    public Song(Integer songId) {
        this.songId = songId;
    }

    public Song(Integer songId, String title, int duration, int trackNr) {
        this.songId = songId;
        this.title = title;
        this.duration = duration;
        this.trackNr = trackNr;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        Integer oldSongId = this.songId;
        this.songId = songId;
        changeSupport.firePropertyChange("songId", oldSongId, songId);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        String oldTitle = this.title;
        this.title = title;
        changeSupport.firePropertyChange("title", oldTitle, title);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        int oldDuration = this.duration;
        this.duration = duration;
        changeSupport.firePropertyChange("duration", oldDuration, duration);
    }

    public int getTrackNr() {
        return trackNr;
    }

    public void setTrackNr(int trackNr) {
        int oldTrackNr = this.trackNr;
        this.trackNr = trackNr;
        changeSupport.firePropertyChange("trackNr", oldTrackNr, trackNr);
    }

    @XmlTransient
    public Collection<Playlist> getPlaylistCollection() {
        return playlistCollection;
    }

    public void setPlaylistCollection(Collection<Playlist> playlistCollection) {
        this.playlistCollection = playlistCollection;
    }

    public Album getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Album albumId) {
        Album oldAlbumId = this.albumId;
        this.albumId = albumId;
        changeSupport.firePropertyChange("albumId", oldAlbumId, albumId);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (songId != null ? songId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Song)) {
            return false;
        }
        Song other = (Song) object;
        if ((this.songId == null && other.songId != null) || (this.songId != null && !this.songId.equals(other.songId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Song[ songId=" + songId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
