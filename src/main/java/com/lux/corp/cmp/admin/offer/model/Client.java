/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lux.corp.cmp.admin.offer.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
 * @author fabrea082
 */
@Entity
@Table(name = "client")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c")
    , @NamedQuery(name = "Client.findByPkClientId", query = "SELECT c FROM Client c WHERE c.pkClientId = :pkClientId")
    , @NamedQuery(name = "Client.findByClientNames", query = "SELECT c FROM Client c WHERE c.clientNames = :clientNames")
    , @NamedQuery(name = "Client.findByClientFirstLastName", query = "SELECT c FROM Client c WHERE c.clientFirstLastName = :clientFirstLastName")
    , @NamedQuery(name = "Client.findByClientSecondLastName", query = "SELECT c FROM Client c WHERE c.clientSecondLastName = :clientSecondLastName")
    , @NamedQuery(name = "Client.findByClientEmail", query = "SELECT c FROM Client c WHERE c.clientEmail = :clientEmail")
    , @NamedQuery(name = "Client.findByClientCellphone", query = "SELECT c FROM Client c WHERE c.clientCellphone = :clientCellphone")
    , @NamedQuery(name = "Client.findByClientNick", query = "SELECT c FROM Client c WHERE c.clientNick = :clientNick")
    , @NamedQuery(name = "Client.findByClientUser", query = "SELECT c FROM Client c WHERE c.clientUser = :clientUser")
    , @NamedQuery(name = "Client.findByClientDateRegister", query = "SELECT c FROM Client c WHERE c.clientDateRegister = :clientDateRegister")})
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_client_id")
    private Integer pkClientId;
    @Column(name = "client_names")
    private String clientNames;
    @Column(name = "client_first_last_name")
    private String clientFirstLastName;
    @Column(name = "client_second_last_name")
    private String clientSecondLastName;
    @Column(name = "client_email")
    private String clientEmail;
    @Column(name = "client_cellphone")
    private String clientCellphone;
    @Column(name = "client_nick")
    private String clientNick;
    @Column(name = "client_user")
    private String clientUser;
    @Column(name = "client_date_register")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clientDateRegister;
    @OneToMany(mappedBy = "fkClientId")
    private List<Auction> auctionList;

    public Client() {
    }

    public Client(Integer pkClientId) {
        this.pkClientId = pkClientId;
    }

    public Integer getPkClientId() {
        return pkClientId;
    }

    public void setPkClientId(Integer pkClientId) {
        this.pkClientId = pkClientId;
    }

    public String getClientNames() {
        return clientNames;
    }

    public void setClientNames(String clientNames) {
        this.clientNames = clientNames;
    }

    public String getClientFirstLastName() {
        return clientFirstLastName;
    }

    public void setClientFirstLastName(String clientFirstLastName) {
        this.clientFirstLastName = clientFirstLastName;
    }

    public String getClientSecondLastName() {
        return clientSecondLastName;
    }

    public void setClientSecondLastName(String clientSecondLastName) {
        this.clientSecondLastName = clientSecondLastName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientCellphone() {
        return clientCellphone;
    }

    public void setClientCellphone(String clientCellphone) {
        this.clientCellphone = clientCellphone;
    }

    public String getClientNick() {
        return clientNick;
    }

    public void setClientNick(String clientNick) {
        this.clientNick = clientNick;
    }

    public String getClientUser() {
        return clientUser;
    }

    public void setClientUser(String clientUser) {
        this.clientUser = clientUser;
    }

    public Date getClientDateRegister() {
        return clientDateRegister;
    }

    public void setClientDateRegister(Date clientDateRegister) {
        this.clientDateRegister = clientDateRegister;
    }

    @XmlTransient
    public List<Auction> getAuctionList() {
        return auctionList;
    }

    public void setAuctionList(List<Auction> auctionList) {
        this.auctionList = auctionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkClientId != null ? pkClientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.pkClientId == null && other.pkClientId != null) || (this.pkClientId != null && !this.pkClientId.equals(other.pkClientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lux.corp.cmp.admin.offer.model.Client[ pkClientId=" + pkClientId + " ]";
    }
    
}
