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
 * @author fabrea082
 */
@Entity
@Table(name = "subcategory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subcategory.findAll", query = "SELECT s FROM Subcategory s")
    , @NamedQuery(name = "Subcategory.findByPkSubcaId", query = "SELECT s FROM Subcategory s WHERE s.pkSubcaId = :pkSubcaId")
    , @NamedQuery(name = "Subcategory.findBySubcaName", query = "SELECT s FROM Subcategory s WHERE s.subcaName = :subcaName")
    , @NamedQuery(name = "Subcategory.findBySubcaDescription", query = "SELECT s FROM Subcategory s WHERE s.subcaDescription = :subcaDescription")
    , @NamedQuery(name = "Subcategory.findBySubcaUser", query = "SELECT s FROM Subcategory s WHERE s.subcaUser = :subcaUser")
    , @NamedQuery(name = "Subcategory.findBySubcaDateRegister", query = "SELECT s FROM Subcategory s WHERE s.subcaDateRegister = :subcaDateRegister")})
public class Subcategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_subca_id")
    private Integer pkSubcaId;
    @Column(name = "subca_name")
    private String subcaName;
    @Column(name = "subca_description")
    private String subcaDescription;
    @Column(name = "subca_user")
    private String subcaUser;
    @Column(name = "subca_date_register")
    @Temporal(TemporalType.TIMESTAMP)
    private Date subcaDateRegister;
    @OneToMany(mappedBy = "fkSubcaId")
    private List<Product> productList;
    @JoinColumn(name = "fk_categ_id", referencedColumnName = "pk_cate_id")
    @ManyToOne(optional = false)
    private Category fkCategId;

    public Subcategory() {
    }

    public Subcategory(Integer pkSubcaId) {
        this.pkSubcaId = pkSubcaId;
    }

    public Integer getPkSubcaId() {
        return pkSubcaId;
    }

    public void setPkSubcaId(Integer pkSubcaId) {
        this.pkSubcaId = pkSubcaId;
    }

    public String getSubcaName() {
        return subcaName;
    }

    public void setSubcaName(String subcaName) {
        this.subcaName = subcaName;
    }

    public String getSubcaDescription() {
        return subcaDescription;
    }

    public void setSubcaDescription(String subcaDescription) {
        this.subcaDescription = subcaDescription;
    }

    public String getSubcaUser() {
        return subcaUser;
    }

    public void setSubcaUser(String subcaUser) {
        this.subcaUser = subcaUser;
    }

    public Date getSubcaDateRegister() {
        return subcaDateRegister;
    }

    public void setSubcaDateRegister(Date subcaDateRegister) {
        this.subcaDateRegister = subcaDateRegister;
    }

    @XmlTransient
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Category getFkCategId() {
        return fkCategId;
    }

    public void setFkCategId(Category fkCategId) {
        this.fkCategId = fkCategId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkSubcaId != null ? pkSubcaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subcategory)) {
            return false;
        }
        Subcategory other = (Subcategory) object;
        if ((this.pkSubcaId == null && other.pkSubcaId != null) || (this.pkSubcaId != null && !this.pkSubcaId.equals(other.pkSubcaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lux.corp.cmp.admin.offer.model.Subcategory[ pkSubcaId=" + pkSubcaId + " ]";
    }
    
}
