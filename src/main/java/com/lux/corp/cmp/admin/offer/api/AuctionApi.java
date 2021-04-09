package com.lux.corp.cmp.admin.offer.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lux.corp.cmp.admin.offer.AuctionController;
import com.lux.corp.cmp.admin.offer.pojo.AuctionPojo;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/admin")
@CrossOrigin(origins = "*")
@Api(value = "Services admin platform basic")
public class AuctionApi {

	private static final Logger logger = LogManager.getLogger(AuctionApi.class);

	@Autowired
	AuctionController auctionController;

	@PostMapping(value = "/ceate/action")
	private ResponseEntity<Boolean> sendProcessOrchestrator(@RequestBody AuctionPojo requestAuctionPojo) {
		try {
			logger.info("[Init Save Auction with Product ID]" + requestAuctionPojo.getFkProductId());
			ObjectMapper mapper = new ObjectMapper();
			String jsonInString2 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(requestAuctionPojo);
			logger.info(jsonInString2);
			if (auctionController.saveAuction(requestAuctionPojo)) {
				return new ResponseEntity<Boolean>(HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
