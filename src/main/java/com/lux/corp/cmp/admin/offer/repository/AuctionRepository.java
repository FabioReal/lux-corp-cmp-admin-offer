package com.lux.corp.cmp.admin.offer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lux.corp.cmp.admin.offer.model.Auction;


@Repository
public interface AuctionRepository extends CrudRepository<Auction, Long>{

}
