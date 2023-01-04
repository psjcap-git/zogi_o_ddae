package com.zerobase.accomodation.domain.repository.leisure;

import com.zerobase.accomodation.domain.entity.leisure.AccomodationWishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccomodationWishListRepository extends JpaRepository<AccomodationWishList, Long> {

}
