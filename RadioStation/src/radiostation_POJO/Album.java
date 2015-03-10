/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation_POJO;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Panos
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
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ALBUM_ID")
    private Integer albumId;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "RELEASE_DATE")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @Basic(optional = false)
    @Column(name = "ALBUM_TYPE")
    private String albumType;
    @Basic(optional = false)
    @Column(name = "DISC_NUMBER")
    private int discNumber;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "albumId")
    private Collection<Song> songCollection;
    @JoinColumn(name = "ARTIST_ID", referencedColumnName = "ARTIST_ID")
    @ManyToOne
    private Artist artistId;
    @JoinColumn(name = "MUSICGROUP_ID", referencedColumnName = "MUSICGROUP_ID")
    @ManyToOne
    private Musicgroup musicgroupId;
    @JoinColumn(name = "MPC_ID", referencedColumnName = "MPC_ID")
    @ManyToOne(optional = false)
    private Musicproductioncompany mpcId;

    public Album() {
    }

    public Album(Integer albumId) {
        this.albumId = albumId;
    }

    public Album(Integer albumId, String title, Date releaseDate, String albumType, int discNumber) {
        this.albumId = albumId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.albumType = albumType;
        this.discNumber = discNumber;
    }

    public Album(Integer albumId, String title, Date releaseDate, String albumType, int discNumber, Artist artistId, Musicgroup musicgroupId, Musicproductioncompany mpcId) {
        this.albumId = albumId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.albumType = albumType;
        this.discNumber = discNumber;
        this.artistId = artistId;
        this.musicgroupId = musicgroupId;
        this.mpcId = mpcId;        
    }
        
    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getAlbumType() {
        return albumType;
    }

    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    @XmlTransient
    public Collection<Song> getSongCollection() {
        return songCollection;
    }

    public void setSongCollection(Collection<Song> songCollection) {
        this.songCollection = songCollection;
    }

    public Artist getArtistId() {
        return artistId;
    }

    public void setArtistId(Artist artistId) {
        this.artistId = artistId;
    }

    public Musicgroup getMusicgroupId() {
        return musicgroupId;
    }

    public void setMusicgroupId(Musicgroup musicgroupId) {
        this.musicgroupId = musicgroupId;
    }

    public Musicproductioncompany getMpcId() {
        return mpcId;
    }

    public void setMpcId(Musicproductioncompany mpcId) {
        this.mpcId = mpcId;
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
    
}
