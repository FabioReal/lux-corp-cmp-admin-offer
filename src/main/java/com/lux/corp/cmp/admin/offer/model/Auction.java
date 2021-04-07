/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lux.corp.cmp.admin.offer.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fabrea082
 */
@Entity
@Table(name = "Auction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Auction.findAll", query = "SELECT a FROM Auction a")
    , @NamedQuery(name = "Auction.findByPkAuctId", query = "SELECT a FROM Auction a WHERE a.pkAuctId = :pkAuctId")
    , @NamedQuery(name = "Auction.findByAuctInit", query = "SELECT a FROM Auction a WHERE a.auctInit = :auctInit")
    , @NamedQuery(name = "Auction.findByAuctEnd", query = "SELECT a FROM Auction a WHERE a.auctEnd = :auctEnd")
    , @NamedQuery(name = "Auction.findByAuctUser", query = "SELECT a FROM Auction a WHERE a.auctUser = :auctUser")
    , @NamedQuery(name = "Auction.findByAuctDateRegister", query = "SELECT a FROM Auction a WHERE a.auctDateRegister = :auctDateRegister")
    , @NamedQuery(name = "Auction.findByAuctValueInit", query = "SELECT a FROM Auction a WHERE a.auctValueInit = :auctValueInit")
    , @NamedQuery(name = "Auction.findBySubaValueFinish", query = "SELECT a FROM Auction a WHERE a.subaValueFinish = :subaValueFinish")})
public class Auction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pk_auct_id")
    private Integer pkAuctId;
    @Basic(optional = false)
    @Column(name = "auct_init")
    @Temporal(TemporalType.TIMESTAMP)
    private Date auctInit;
    @Basic(optional = false)
    @Column(name = "auct_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date auctEnd;
    @Column(name = "auct_user")
    private String auctUser;
    @Column(name = "auct_date_register")
    @Temporal(TemporalType.TIMESTAMP)
    private Date auctDateRegister;
    @Column(name = "auct_value_init")
    private String auctValueInit;
    @Column(name = "suba_value_finish")
    private String subaValueFinish;
    @JoinColumn(name = "fk_client_id", referencedColumnName = "pk_client_id")
    @ManyToOne
    private Client fkClientId;
    @JoinColumn(name = "fk_product_id", referencedColumnName = "pk_product_id")
    @ManyToOne
    private Product fkProductId;

    public Auction() {
    }

    public Auction(Integer pkAuctId) {
        this.pkAuctId = pkAuctId;
    }

    public Auction(Integer pkAuctId, Date auctInit, Date auctEnd) {
        this.pkAuctId = pkAuctId;
        this.auctInit = auctInit;
        this.auctEnd = auctEnd;
    }

    public Integer getPkAuctId() {
        return pkAuctId;
    }

    public void setPkAuctId(Integer pkAuctId) {
        this.pkAuctId = pkAuctId;
    }

    public Date getAuctInit() {
        return auctInit;
    }

    public void setAuctInit(Date auctInit) {
        this.auctInit = auctInit;
    }

    public Date getAuctEnd() {
        return auctEnd;
    }

    public void setAuctEnd(Date auctEnd) {
        this.auctEnd = auctEnd;
    }

    public String getAuctUser() {
        return auctUser;
    }

    public void setAuctUser(String auctUser) {
        this.auctUser = auctUser;
    }

    public Date getAuctDateRegister() {
        return auctDateRegister;
    }

    public void setAuctDateRegister(Date auctDateRegister) {
        this.auctDateRegister = auctDateRegister;
    }

    public String getAuctValueInit() {
        return auctValueInit;
    }

    public void setAuctValueInit(String auctValueInit) {
        this.auctValueInit = auctValueInit;
    }

    public String getSubaValueFinish() {
        return subaValueFinish;
    }

    public void setSubaValueFinish(String subaValueFinish) {
        this.subaValueFinish = subaValueFinish;
    }

    public Client getFkClientId() {
        return fkClientId;
    }

    public void setFkClientId(Client fkClientId) {
        this.fkClientId = fkClientId;
    }

    public Product getFkProductId() {
        return fkProductId;
    }

    public void setFkProductId(Product fkProductId) {
        this.fkProductId = fkProductId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkAuctId != null ? pkAuctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Auction)) {
            return false;
        }
        Auction other = (Auction) object;
        if ((this.pkAuctId == null && other.pkAuctId != null) || (this.pkAuctId != null && !this.pkAuctId.equals(other.pkAuctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lux.corp.cmp.admin.offer.model.Auction[ pkAuctId=" + pkAuctId + " ]";
    }
    
}
