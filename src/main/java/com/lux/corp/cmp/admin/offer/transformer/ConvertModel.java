package com.lux.corp.cmp.admin.offer.transformer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.lux.corp.cmp.admin.offer.model.Auction;
import com.lux.corp.cmp.admin.offer.pojo.AuctionPojo;

@Component
public class ConvertModel {

	private static final Logger logger = LogManager.getLogger(ConvertModel.class);

	public Auction convertAuction(AuctionPojo auctionPojo) throws Exception {
		try {
			Auction auction = new Auction();
//			auction.setAuctInit(auctInit);
//			auction.setAuctEnd(auctEnd);
//			auction.set
			return auction;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
		}
		return null;
	}

}
