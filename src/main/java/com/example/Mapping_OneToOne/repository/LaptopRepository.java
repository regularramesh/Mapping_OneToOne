package com.example.Mapping_OneToOne.repository.repo1;

import com.example.Mapping_OneToOne.model1.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long>{


}