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
public class AlbumPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ALBUM_ID")
    private long albumId;
    @Basic(optional = false)
    @Column(name = "DISC_NUMBER")
    private int discNumber;

    public AlbumPK() {
    }

    public AlbumPK(long albumId, int discNumber) {
        this.albumId = albumId;
        this.discNumber = discNumber;
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) albumId;
        hash += (int) discNumber;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlbumPK)) {
            return false;
        }
        AlbumPK other = (AlbumPK) object;
        if (this.albumId != other.albumId) {
            return false;
        }
        if (this.discNumber != other.discNumber) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.AlbumPK[ albumId=" + albumId + ", discNumber=" + discNumber + " ]";
    }
    
}
