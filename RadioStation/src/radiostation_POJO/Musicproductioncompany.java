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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Panos
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
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "MPC_ID")
    private long mpcId;
    @Id
    @Basic(optional = false)
    @Column(name = "MPC_NAME")
    private String mpcName;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "TELEPHONE")
    private String telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mpcName")
    private Collection<Album> albumCollection;

    public Musicproductioncompany() {
    }

    public Musicproductioncompany(String mpcName) {
        this.mpcName = mpcName;
    }

    public Musicproductioncompany(String mpcName, long mpcId) {
        this.mpcName = mpcName;
        this.mpcId = mpcId;
    }

    public long getMpcId() {
        return mpcId;
    }

    public void setMpcId(long mpcId) {
        long oldMpcId = this.mpcId;
        this.mpcId = mpcId;
        changeSupport.firePropertyChange("mpcId", oldMpcId, mpcId);
    }

    public String getMpcName() {
        return mpcName;
    }

    public void setMpcName(String mpcName) {
        String oldMpcName = this.mpcName;
        this.mpcName = mpcName;
        changeSupport.firePropertyChange("mpcName", oldMpcName, mpcName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        String oldTelephone = this.telephone;
        this.telephone = telephone;
        changeSupport.firePropertyChange("telephone", oldTelephone, telephone);
    }

    @XmlTransient
    public Collection<Album> getAlbumCollection() {
        return albumCollection;
    }

    public void setAlbumCollection(Collection<Album> albumCollection) {
        this.albumCollection = albumCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mpcName != null ? mpcName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musicproductioncompany)) {
            return false;
        }
        Musicproductioncompany other = (Musicproductioncompany) object;
        if ((this.mpcName == null && other.mpcName != null) || (this.mpcName != null && !this.mpcName.equals(other.mpcName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "radiostation_POJO.Musicproductioncompany[ mpcName=" + mpcName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
