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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
    , @NamedQuery(name = "Category.findByPkCateId", query = "SELECT c FROM Category c WHERE c.pkCateId = :pkCateId")
    , @NamedQuery(name = "Category.findByCategName", query = "SELECT c FROM Category c WHERE c.categName = :categName")
    , @NamedQuery(name = "Category.findByCategDescription", query = "SELECT c FROM Category c WHERE c.categDescription = :categDescription")
    , @NamedQuery(name = "Category.findByCategUser", query = "SELECT c FROM Category c WHERE c.categUser = :categUser")
    , @NamedQuery(name = "Category.findByCategDateRegister", query = "SELECT c FROM Category c WHERE c.categDateRegister = :categDateRegister")})
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pk_cate_id")
    private Integer pkCateId;
    @Basic(optional = false)
    @Column(name = "categ_name")
    private String categName;
    @Column(name = "categ_description")
    private String categDescription;
    @Column(name = "categ_user")
    private String categUser;
    @Column(name = "categ_date_register")
    @Temporal(TemporalType.TIMESTAMP)
    private Date categDateRegister;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkCategId")
    private List<Subcategory> subcategoryList;

    public Category() {
    }

    public Category(Integer pkCateId) {
        this.pkCateId = pkCateId;
    }

    public Category(Integer pkCateId, String categName) {
        this.pkCateId = pkCateId;
        this.categName = categName;
    }

    public Integer getPkCateId() {
        return pkCateId;
    }

    public void setPkCateId(Integer pkCateId) {
        this.pkCateId = pkCateId;
    }

    public String getCategName() {
        return categName;
    }

    public void setCategName(String categName) {
        this.categName = categName;
    }

    public String getCategDescription() {
        return categDescription;
    }

    public void setCategDescription(String categDescription) {
        this.categDescription = categDescription;
    }

    public String getCategUser() {
        return categUser;
    }

    public void setCategUser(String categUser) {
        this.categUser = categUser;
    }

    public Date getCategDateRegister() {
        return categDateRegister;
    }

    public void setCategDateRegister(Date categDateRegister) {
        this.categDateRegister = categDateRegister;
    }

    @XmlTransient
    public List<Subcategory> getSubcategoryList() {
        return subcategoryList;
    }

    public void setSubcategoryList(List<Subcategory> subcategoryList) {
        this.subcategoryList = subcategoryList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkCateId != null ? pkCateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.pkCateId == null && other.pkCateId != null) || (this.pkCateId != null && !this.pkCateId.equals(other.pkCateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lux.corp.cmp.admin.offer.model.Category[ pkCateId=" + pkCateId + " ]";
    }
    
}
