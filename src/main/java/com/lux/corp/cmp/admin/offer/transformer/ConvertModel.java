package com.lux.corp.cmp.admin.offer.transformer;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.lux.corp.cmp.admin.offer.model.Auction;
import com.lux.corp.cmp.admin.offer.pojo.AuctionPojo;
import com.lux.corp.cmp.admin.offer.repository.AuctionRepository;
import com.lux.corp.cmp.admin.offer.repository.ClientRepository;

@Component
public class ConvertModel {

	private static final Logger logger = LogManager.getLogger(ConvertModel.class);
	
	// Load User admin of file propierties
	@Value("${admin.user.admin.api}")
	private String userAdminApi;
	

	@Autowired
	AuctionRepository auctionRepository;
	

	@Autowired
	ClientRepository clientRepository;

	public Boolean convertAuction(AuctionPojo auctionPojo) throws Exception {
		try {
			Auction auction = new Auction();
			auction.setAuctDateRegister(new java.sql.Timestamp(System.currentTimeMillis()));
			auction.setAuctUser(userAdminApi);
			
			
			auction.setAuctInit(auctionPojo.getAuctInit());
			auction.setAuctEnd(auctionPojo.getAuctEnd());
			auction.setAuctValueInit(auctionPojo.getAuctValueInit() == null ? "0" : auctionPojo.getAuctValueInit());
			auction.setAuctValueInit(auctionPojo.getAuctValueFinish() == null ? "0" : auctionPojo.getAuctValueFinish());
			
			
			auction.setFkClientId(clientRepository.findById(auctionPojo.getFkClientId().getPkClientId()).get());
		
//			auction.setFkClientId(client);
			
//			Product product = new Product();
//			product.setProductName(auctionPojo.getFkProductId().getProductName());
//			product.setProductDescription(auctionPojo.getFkProductId().getProductDescription());
//			product.setProductValueOffer(auctionPojo.getFkProductId().getProductValueOffer());
//			product.setProductValue(auctionPojo.getFkProductId().getProductValue());
//			product.setProductUser(userAdminApi);
//			product.setProductDateRegister(new java.sql.Timestamp(System.currentTimeMillis()));
//			product.setFkSubcaId(auctionPojo.getFkProductId().getFkSubcaId());
//			auction.getFkProductId().setPkProductId();
//			auction.setFkProductId(product);
			auctionRepository.save(auction);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage());
		}
		return false;
	}
	
	public Timestamp convertStringToTimeStamp(String date) {
		// create a formatter that parses datetimes of this pattern
	    DateTimeFormatter parserDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    // then parse the datetime with that formatter
	    LocalDateTime ldt = LocalDateTime.parse(date, parserDtf);
	    Timestamp timestamp = Timestamp.valueOf(ldt);
	    return timestamp;
	    
	}


	public Date convertStringToDate(String date) {
		try {
			Date dateTmp = (Date) new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
			return dateTmp;
		} catch (ParseException e) {
			logger.error(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Date(0);
	    
	}
}
