package com.excalibur.spring6restmvc.mappers;

import com.excalibur.spring6restmvc.entities.Beer;
import com.excalibur.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}