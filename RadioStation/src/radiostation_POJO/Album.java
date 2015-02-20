/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation_POJO;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eliastsourapas
 */
@Entity
@Table(name = "ALBUM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Album.findAll", query = "SELECT a FROM Album a"),
    @NamedQuery(name = "Album.findByAlbumId", query = "SELECT a FROM Album a WHERE a.albumId = :albumId"),
    @NamedQuery(name = "Album.findByTitle", query = "SELECT a FROM Album a WHERE a.title = :title"),
    @NamedQuery(name = "Album.findByReleaseDate", query = "SELECT a FROM Album a WHERE a.releaseDate = :releaseDate"),
    @NamedQuery(name = "Album.findByAlbumType", query = "SELECT a FROM Album a WHERE a.albumType = :albumType"),
    @NamedQuery(name = "Album.findByDiscNumber", query = "SELECT a FROM Album a WHERE a.discNumber = :discNumber")})
public class Album implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ALBUM_ID")
    private Long albumId;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "RELEASE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date releaseDate;
    @Basic(optional = false)
    @Column(name = "ALBUM_TYPE")
    private String albumType;
    @Basic(optional = false)
    @Column(name = "DISC_NUMBER")
    private int discNumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "albumId")
    private List<Song> songList;
    @JoinColumn(name = "ARTIST_ID", referencedColumnName = "ARTIST_ID")
    @ManyToOne
    private Artist artistId;
    @JoinColumn(name = "MUSICGROUP_NAME", referencedColumnName = "MUSICGROUP_NAME")
    @ManyToOne
    private Musicgroup musicgroupName;
    @JoinColumn(name = "MPC_NAME", referencedColumnName = "MPC_NAME")
    @ManyToOne(optional = false)
    private Musicproductioncompany mpcName;

    public Album() {
    }

    public Album(Long albumId) {
        this.albumId = albumId;
    }

    public Album(Long albumId, String title, Date releaseDate, String albumType, int discNumber) {
        this.albumId = albumId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.albumType = albumType;
        this.discNumber = discNumber;
    }

    public Long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Long albumId) {
        Long oldAlbumId = this.albumId;
        this.albumId = albumId;
        changeSupport.firePropertyChange("albumId", oldAlbumId, albumId);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        String oldTitle = this.title;
        this.title = title;
        changeSupport.firePropertyChange("title", oldTitle, title);
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        Date oldReleaseDate = this.releaseDate;
        this.releaseDate = releaseDate;
        changeSupport.firePropertyChange("releaseDate", oldReleaseDate, releaseDate);
    }

    public String getAlbumType() {
        return albumType;
    }

    public void setAlbumType(String albumType) {
        String oldAlbumType = this.albumType;
        this.albumType = albumType;
        changeSupport.firePropertyChange("albumType", oldAlbumType, albumType);
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(int discNumber) {
        int oldDiscNumber = this.discNumber;
        this.discNumber = discNumber;
        changeSupport.firePropertyChange("discNumber", oldDiscNumber, discNumber);
    }

    @XmlTransient
    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    public Artist getArtistId() {
        return artistId;
    }

    public void setArtistId(Artist artistId) {
        Artist oldArtistId = this.artistId;
        this.artistId = artistId;
        changeSupport.firePropertyChange("artistId", oldArtistId, artistId);
    }

    public Musicgroup getMusicgroupName() {
        return musicgroupName;
    }

    public void setMusicgroupName(Musicgroup musicgroupName) {
        Musicgroup oldMusicgroupName = this.musicgroupName;
        this.musicgroupName = musicgroupName;
        changeSupport.firePropertyChange("musicgroupName", oldMusicgroupName, musicgroupName);
    }

    public Musicproductioncompany getMpcName() {
        return mpcName;
    }

    public void setMpcName(Musicproductioncompany mpcName) {
        Musicproductioncompany oldMpcName = this.mpcName;
        this.mpcName = mpcName;
        changeSupport.firePropertyChange("mpcName", oldMpcName, mpcName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (albumId != null ? albumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.albumId == null && other.albumId != null) || (this.albumId != null && !this.albumId.equals(other.albumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Album[ albumId=" + albumId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
