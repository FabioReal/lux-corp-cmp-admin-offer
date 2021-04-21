package com.lux.corp.cmp.admin.offer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lux.corp.cmp.admin.offer.pojo.AuctionPojo;
import com.lux.corp.cmp.admin.offer.repository.AuctionRepository;
import com.lux.corp.cmp.admin.offer.transformer.ConvertModel;

@Service
public class AuctionController {

	private static final Logger logger = LogManager.getLogger(AuctionController.class);

	@Autowired
	ConvertModel convertModel;
	

	public Boolean saveAuction(AuctionPojo requestAuctionPojo) {
		try {
			convertModel.convertAuction(requestAuctionPojo);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(AuctionController.class + e.getMessage());
		}
		return false;
	}

}
