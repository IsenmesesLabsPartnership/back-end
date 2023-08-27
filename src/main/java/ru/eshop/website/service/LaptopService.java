package ru.eshop.website.service;


import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.eshop.website.entity.Laptop;
import ru.eshop.website.repository.LaptopRepository;

@RequiredArgsConstructor
@Service
@Slf4j
public class LaptopService {
    private final LaptopRepository laptopRepository;
    public Laptop findLaptopById(Long id) {
        log.info(String.format("Fetching laptop by id= %d", id));
        return laptopRepository.findById(id)
                .orElseThrow(
                        (() -> new EntityNotFoundException(String.format("Laptop with id=%d not found", id)))
                );
    }
    public Page<Laptop> findLaptops(int page, int size) {
        log.info(String.format("Fetching laptops page №%d , count=%d", page, size));
        return laptopRepository.findAll(PageRequest.of(page, size));
    }
}
