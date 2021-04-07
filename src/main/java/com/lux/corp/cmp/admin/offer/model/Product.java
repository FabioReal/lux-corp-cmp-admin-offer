/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lux.corp.cmp.admin.offer.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fabrea082
 */
@Entity
@Table(name = "Product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByPkProductId", query = "SELECT p FROM Product p WHERE p.pkProductId = :pkProductId")
    , @NamedQuery(name = "Product.findByProductName", query = "SELECT p FROM Product p WHERE p.productName = :productName")
    , @NamedQuery(name = "Product.findByProductDescription", query = "SELECT p FROM Product p WHERE p.productDescription = :productDescription")
    , @NamedQuery(name = "Product.findByProductValueOffer", query = "SELECT p FROM Product p WHERE p.productValueOffer = :productValueOffer")
    , @NamedQuery(name = "Product.findByProductDateRegister", query = "SELECT p FROM Product p WHERE p.productDateRegister = :productDateRegister")
    , @NamedQuery(name = "Product.findByProductUser", query = "SELECT p FROM Product p WHERE p.productUser = :productUser")
    , @NamedQuery(name = "Product.findByProductValue", query = "SELECT p FROM Product p WHERE p.productValue = :productValue")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pk_product_id")
    private Integer pkProductId;
    @Basic(optional = false)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @Column(name = "product_description")
    private String productDescription;
    @Column(name = "product_value_offer")
    private String productValueOffer;
    @Column(name = "product_date_register")
    private String productDateRegister;
    @Column(name = "product_user")
    private String productUser;
    @Column(name = "product_value")
    private String productValue;
    @OneToMany(mappedBy = "fkProductId")
    private List<Auction> auctionList;
    @JoinColumn(name = "fk_subca_id", referencedColumnName = "pk_subca_id")
    @ManyToOne
    private Subcategory fkSubcaId;

    public Product() {
    }

    public Product(Integer pkProductId) {
        this.pkProductId = pkProductId;
    }

    public Product(Integer pkProductId, String productName, String productDescription) {
        this.pkProductId = pkProductId;
        this.productName = productName;
        this.productDescription = productDescription;
    }

    public Integer getPkProductId() {
        return pkProductId;
    }

    public void setPkProductId(Integer pkProductId) {
        this.pkProductId = pkProductId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductValueOffer() {
        return productValueOffer;
    }

    public void setProductValueOffer(String productValueOffer) {
        this.productValueOffer = productValueOffer;
    }

    public String getProductDateRegister() {
        return productDateRegister;
    }

    public void setProductDateRegister(String productDateRegister) {
        this.productDateRegister = productDateRegister;
    }

    public String getProductUser() {
        return productUser;
    }

    public void setProductUser(String productUser) {
        this.productUser = productUser;
    }

    public String getProductValue() {
        return productValue;
    }

    public void setProductValue(String productValue) {
        this.productValue = productValue;
    }

    @XmlTransient
    public List<Auction> getAuctionList() {
        return auctionList;
    }

    public void setAuctionList(List<Auction> auctionList) {
        this.auctionList = auctionList;
    }

    public Subcategory getFkSubcaId() {
        return fkSubcaId;
    }

    public void setFkSubcaId(Subcategory fkSubcaId) {
        this.fkSubcaId = fkSubcaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkProductId != null ? pkProductId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.pkProductId == null && other.pkProductId != null) || (this.pkProductId != null && !this.pkProductId.equals(other.pkProductId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lux.corp.cmp.admin.offer.model.Product[ pkProductId=" + pkProductId + " ]";
    }
    
}
