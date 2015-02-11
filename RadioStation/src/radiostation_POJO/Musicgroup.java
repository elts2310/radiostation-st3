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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
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
 * @author eliastsourapas
 */
@Entity
@Table(name = "MUSICGROUP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musicgroup.findAll", query = "SELECT m FROM Musicgroup m"),
    @NamedQuery(name = "Musicgroup.findByMusicgroupId", query = "SELECT m FROM Musicgroup m WHERE m.musicgroupId = :musicgroupId"),
    @NamedQuery(name = "Musicgroup.findByMusicgroupName", query = "SELECT m FROM Musicgroup m WHERE m.musicgroupName = :musicgroupName"),
    @NamedQuery(name = "Musicgroup.findByFormationDate", query = "SELECT m FROM Musicgroup m WHERE m.formationDate = :formationDate")})
public class Musicgroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MUSICGROUP_ID")
    private Long musicgroupId;
    @Basic(optional = false)
    @Column(name = "MUSICGROUP_NAME")
    private String musicgroupName;
    @Basic(optional = false)
    @Column(name = "FORMATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date formationDate;
    @ManyToMany(mappedBy = "musicgroupList")
    private List<Artist> artistList;
    @JoinColumns({
        @JoinColumn(name = "ALBUM_ID", referencedColumnName = "ALBUM_ID"),
        @JoinColumn(name = "DISC_NUMBER", referencedColumnName = "DISC_NUMBER")})
    @ManyToOne
    private Album album;
    @OneToMany(mappedBy = "musicgroupId")
    private List<Album> albumList;

    public Musicgroup() {
    }

    public Musicgroup(Long musicgroupId) {
        this.musicgroupId = musicgroupId;
    }

    public Musicgroup(Long musicgroupId, String musicgroupName, Date formationDate) {
        this.musicgroupId = musicgroupId;
        this.musicgroupName = musicgroupName;
        this.formationDate = formationDate;
    }

    public Long getMusicgroupId() {
        return musicgroupId;
    }

    public void setMusicgroupId(Long musicgroupId) {
        this.musicgroupId = musicgroupId;
    }

    public String getMusicgroupName() {
        return musicgroupName;
    }

    public void setMusicgroupName(String musicgroupName) {
        this.musicgroupName = musicgroupName;
    }

    public Date getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(Date formationDate) {
        this.formationDate = formationDate;
    }

    @XmlTransient
    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @XmlTransient
    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (musicgroupId != null ? musicgroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musicgroup)) {
            return false;
        }
        Musicgroup other = (Musicgroup) object;
        if ((this.musicgroupId == null && other.musicgroupId != null) || (this.musicgroupId != null && !this.musicgroupId.equals(other.musicgroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Musicgroup[ musicgroupId=" + musicgroupId + " ]";
    }
    
}
