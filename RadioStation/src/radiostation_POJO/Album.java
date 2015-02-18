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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    @NamedQuery(name = "Album.findByAlbumId", query = "SELECT a FROM Album a WHERE a.albumPK.albumId = :albumId"),
    @NamedQuery(name = "Album.findByTitle", query = "SELECT a FROM Album a WHERE a.title = :title"),
    @NamedQuery(name = "Album.findByReleaseDate", query = "SELECT a FROM Album a WHERE a.releaseDate = :releaseDate"),
    @NamedQuery(name = "Album.findByAlbumType", query = "SELECT a FROM Album a WHERE a.albumType = :albumType"),
    @NamedQuery(name = "Album.findByDiscNumber", query = "SELECT a FROM Album a WHERE a.albumPK.discNumber = :discNumber")})
public class Album implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AlbumPK albumPK;
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
    @OneToMany(mappedBy = "album")
    private List<Artist> artistList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "album")
    private List<Song> songList;
    @OneToMany(mappedBy = "album")
    private List<Musicgroup> musicgroupList;
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

    public Album(AlbumPK albumPK) {
        this.albumPK = albumPK;
    }

    public Album(AlbumPK albumPK, String title, Date releaseDate, String albumType) {
        this.albumPK = albumPK;
        this.title = title;
        this.releaseDate = releaseDate;
        this.albumType = albumType;
    }

    public Album(long albumId, int discNumber) {
        this.albumPK = new AlbumPK(albumId, discNumber);
    }

    public AlbumPK getAlbumPK() {
        return albumPK;
    }

    public void setAlbumPK(AlbumPK albumPK) {
        this.albumPK = albumPK;
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

    @XmlTransient
    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    @XmlTransient
    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    @XmlTransient
    public List<Musicgroup> getMusicgroupList() {
        return musicgroupList;
    }

    public void setMusicgroupList(List<Musicgroup> musicgroupList) {
        this.musicgroupList = musicgroupList;
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
        hash += (albumPK != null ? albumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.albumPK == null && other.albumPK != null) || (this.albumPK != null && !this.albumPK.equals(other.albumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Album[ albumPK=" + albumPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
