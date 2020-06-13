package ru.job4j.logic;

import ru.job4j.model.Account;
import ru.job4j.model.Place;

import java.util.List;
import java.util.Set;

public interface Validate {

    List<Place> getPlacesHall();

    Set<Place> getOccupiedPlaces();

    boolean addVisitorPlace(Account account, Place place);
}
