/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation_POJO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eliastsourapas
 */
@Entity
@Table(name = "PLAYLIST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Playlist.findAll", query = "SELECT p FROM Playlist p"),
    @NamedQuery(name = "Playlist.findByPlaylistId", query = "SELECT p FROM Playlist p WHERE p.playlistId = :playlistId"),
    @NamedQuery(name = "Playlist.findByPlName", query = "SELECT p FROM Playlist p WHERE p.plName = :plName"),
    @NamedQuery(name = "Playlist.findByPlDescription", query = "SELECT p FROM Playlist p WHERE p.plDescription = :plDescription"),
    @NamedQuery(name = "Playlist.findByPlCreationDate", query = "SELECT p FROM Playlist p WHERE p.plCreationDate = :plCreationDate")})
public class Playlist implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PLAYLIST_ID")
    private Long playlistId;
    @Basic(optional = false)
    @Column(name = "PL_NAME")
    private String plName;
    @Column(name = "PL_DESCRIPTION")
    private String plDescription;
    @Basic(optional = false)
    @Column(name = "PL_CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date plCreationDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "playlist")
    private List<PlaylistSong> playlistSongList;

    public Playlist() {
    }

    public Playlist(Long playlistId) {
        this.playlistId = playlistId;
    }

    public Playlist(Long playlistId, String plName, Date plCreationDate) {
        this.playlistId = playlistId;
        this.plName = plName;
        this.plCreationDate = plCreationDate;
    }

    public Long getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Long playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlName() {
        return plName;
    }

    public void setPlName(String plName) {
        this.plName = plName;
    }

    public String getPlDescription() {
        return plDescription;
    }

    public void setPlDescription(String plDescription) {
        this.plDescription = plDescription;
    }

    public Date getPlCreationDate() {
        return plCreationDate;
    }

    public void setPlCreationDate(Date plCreationDate) {
        this.plCreationDate = plCreationDate;
    }

    @XmlTransient
    public List<PlaylistSong> getPlaylistSongList() {
        return playlistSongList;
    }

    public void setPlaylistSongList(List<PlaylistSong> playlistSongList) {
        this.playlistSongList = playlistSongList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (playlistId != null ? playlistId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Playlist)) {
            return false;
        }
        Playlist other = (Playlist) object;
        if ((this.playlistId == null && other.playlistId != null) || (this.playlistId != null && !this.playlistId.equals(other.playlistId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Playlist[ playlistId=" + playlistId + " ]";
    }
    
}
