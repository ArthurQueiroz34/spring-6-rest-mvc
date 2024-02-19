package com.excalibur.spring6restmvc.services;

import com.excalibur.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);
}