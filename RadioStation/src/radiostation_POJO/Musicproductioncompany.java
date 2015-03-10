/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiostation_POJO;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author eliastsourapas
 */
@Entity
@Table(name = "MUSICPRODUCTIONCOMPANY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musicproductioncompany.findAll", query = "SELECT m FROM Musicproductioncompany m"),
    @NamedQuery(name = "Musicproductioncompany.findByMpcId", query = "SELECT m FROM Musicproductioncompany m WHERE m.mpcId = :mpcId"),
    @NamedQuery(name = "Musicproductioncompany.findByMpcName", query = "SELECT m FROM Musicproductioncompany m WHERE m.mpcName = :mpcName"),
    @NamedQuery(name = "Musicproductioncompany.findByAddress", query = "SELECT m FROM Musicproductioncompany m WHERE m.address = :address"),
    @NamedQuery(name = "Musicproductioncompany.findByTelephone", query = "SELECT m FROM Musicproductioncompany m WHERE m.telephone = :telephone")})
public class Musicproductioncompany implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MPC_ID")
    private Integer mpcId;
    @Basic(optional = false)
    @Column(name = "MPC_NAME")
    private String mpcName;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "TELEPHONE")
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mpcId")
    private List<Album> albumList;

    public Musicproductioncompany() {
    }

    public Musicproductioncompany(Integer mpcId) {
        this.mpcId = mpcId;
    }

    public Musicproductioncompany(Integer mpcId, String mpcName) {
        this.mpcId = mpcId;
        this.mpcName = mpcName;
    }

    public Integer getMpcId() {
        return mpcId;
    }

    public void setMpcId(Integer mpcId) {
        this.mpcId = mpcId;
    }

    public String getMpcName() {
        return mpcName;
    }

    public void setMpcName(String mpcName) {
        this.mpcName = mpcName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
        hash += (mpcId != null ? mpcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musicproductioncompany)) {
            return false;
        }
        Musicproductioncompany other = (Musicproductioncompany) object;
        if ((this.mpcId == null && other.mpcId != null) || (this.mpcId != null && !this.mpcId.equals(other.mpcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Musicproductioncompany[ mpcId=" + mpcId + " ]";
    }
    
}
