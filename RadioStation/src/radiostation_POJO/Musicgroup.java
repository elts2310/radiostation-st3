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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "MUSICGROUP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musicgroup.findAll", query = "SELECT m FROM Musicgroup m"),
    @NamedQuery(name = "Musicgroup.findByMusicgroupId", query = "SELECT m FROM Musicgroup m WHERE m.musicgroupId = :musicgroupId"),
    @NamedQuery(name = "Musicgroup.findByMusicgroupName", query = "SELECT m FROM Musicgroup m WHERE m.musicgroupName = :musicgroupName"),
    @NamedQuery(name = "Musicgroup.findByFormationDate", query = "SELECT m FROM Musicgroup m WHERE m.formationDate = :formationDate")})
public class Musicgroup implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "MUSICGROUP_ID")
    private long musicgroupId;
    @Id
    @Basic(optional = false)
    @Column(name = "MUSICGROUP_NAME")
    private String musicgroupName;
    @Column(name = "FORMATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date formationDate;
    @ManyToMany(mappedBy = "musicgroupList")
    private List<Artist> artistList;
    @OneToMany(mappedBy = "musicgroupName")
    private List<Album> albumList;

    public Musicgroup() {
    }

    public Musicgroup(String musicgroupName) {
        this.musicgroupName = musicgroupName;
    }

    public Musicgroup(String musicgroupName, long musicgroupId) {
        this.musicgroupName = musicgroupName;
        this.musicgroupId = musicgroupId;
    }

    public long getMusicgroupId() {
        return musicgroupId;
    }

    public void setMusicgroupId(long musicgroupId) {
        long oldMusicgroupId = this.musicgroupId;
        this.musicgroupId = musicgroupId;
        changeSupport.firePropertyChange("musicgroupId", oldMusicgroupId, musicgroupId);
    }

    public String getMusicgroupName() {
        return musicgroupName;
    }

    public void setMusicgroupName(String musicgroupName) {
        String oldMusicgroupName = this.musicgroupName;
        this.musicgroupName = musicgroupName;
        changeSupport.firePropertyChange("musicgroupName", oldMusicgroupName, musicgroupName);
    }

    public Date getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(Date formationDate) {
        Date oldFormationDate = this.formationDate;
        this.formationDate = formationDate;
        changeSupport.firePropertyChange("formationDate", oldFormationDate, formationDate);
    }

    @XmlTransient
    public List<Artist> getArtistList() {
        return artistList;
    }

    public void setArtistList(List<Artist> artistList) {
        this.artistList = artistList;
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
        hash += (musicgroupName != null ? musicgroupName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musicgroup)) {
            return false;
        }
        Musicgroup other = (Musicgroup) object;
        if ((this.musicgroupName == null && other.musicgroupName != null) || (this.musicgroupName != null && !this.musicgroupName.equals(other.musicgroupName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Musicgroup[ musicgroupName=" + musicgroupName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
