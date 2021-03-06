package com.smalaca.rentalapplication.query.hotel;

public class QueryHotelRepository {
    private final SpringJpaQueryHotelRepository repository;

    public QueryHotelRepository(SpringJpaQueryHotelRepository repository) {
        this.repository = repository;
    }

    public Iterable<HotelReadModel> findAll() {
        return repository.findAll();
    }
}
