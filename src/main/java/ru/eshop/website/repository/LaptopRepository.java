package ru.eshop.website.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.eshop.website.entity.Laptop;

@Repository
public interface LaptopRepository extends CrudRepository<Laptop, Long> {
    Page<Laptop> findAll(Pageable pageable);
}
