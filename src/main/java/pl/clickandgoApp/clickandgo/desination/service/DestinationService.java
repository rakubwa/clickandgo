package pl.clickandgoApp.clickandgo.desination.service;

import pl.clickandgoApp.clickandgo.desination.*;

import java.util.Collection;
import java.util.Optional;

public interface DestinationService {

    Collection<City> getAllCities();
    Optional<City> getCity(String id);

    Collection<Continent> getAllContinents();
    Optional<Continent> getContinent(String id);

    Collection<Country> getAllCountries();
    Optional<Country> getCountry(String id);

    Collection<Hotel> getAllHotels();
    Optional<Hotel> getHotel(String id);


}
