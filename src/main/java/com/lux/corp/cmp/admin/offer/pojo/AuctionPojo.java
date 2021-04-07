/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lux.corp.cmp.admin.offer.pojo;

import java.util.Date;

public class AuctionPojo {

	private Integer pkAuctId;
	private Date auctInit;
	private Date auctEnd;
	private String auctValueInit;
	private String subaValueFinish;
	private Integer fkClientId;
	private Integer fkProductId;

	public AuctionPojo() {
	}

	public AuctionPojo(Integer pkAuctId) {
		this.pkAuctId = pkAuctId;
	}

	public AuctionPojo(Integer pkAuctId, Date auctInit, Date auctEnd) {
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

	public Integer getFkClientId() {
		return fkClientId;
	}

	public void setFkClientId(Integer fkClientId) {
		this.fkClientId = fkClientId;
	}

	public Integer getFkProductId() {
		return fkProductId;
	}

	public void setFkProductId(Integer fkProductId) {
		this.fkProductId = fkProductId;
	}

}
