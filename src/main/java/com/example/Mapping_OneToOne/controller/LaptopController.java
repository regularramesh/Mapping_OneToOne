package com.example.Mapping_OneToOne.controller1;
import com.example.Mapping_OneToOne.model1.Brand;
import com.example.Mapping_OneToOne.model1.Laptop;
import com.example.Mapping_OneToOne.model1.LaptopRequest;
import com.example.Mapping_OneToOne.repository.repo1.BrandRepository;
import com.example.Mapping_OneToOne.repository.repo1.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {

    @Autowired
    private LaptopRepository lRepo;

    @Autowired
    private BrandRepository bRepo;

    @PostMapping("/laptops/save")
    public ResponseEntity<Laptop> saveData (@RequestBody LaptopRequest req) {

        Brand brand = new Brand();
        brand.setBrandName(req.getBrand());

        brand = bRepo.save(brand);

        Laptop laptop = new Laptop(req);
        laptop.setBrand(brand);

        laptop = lRepo.save(laptop);

        return new ResponseEntity<Laptop>(laptop, HttpStatus.CREATED);

    }
}