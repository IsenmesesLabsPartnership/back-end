package ru.eshop.website.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.eshop.website.entity.Laptop;
import ru.eshop.website.service.LaptopService;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final LaptopService laptopService;

    @GetMapping("/laptops/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Laptop getLaptopById(@PathVariable("id") Long id){
        return laptopService.findLaptopById(id);
    }

    @GetMapping("/laptops")
    public Page<Laptop> laptopPage(@RequestParam("page") int page, @RequestParam("size") int size) {
          return laptopService.findLaptops(page,size);
    }
}

