package com.example.Mapping_OneToOne.repository.repo1;
import com.example.Mapping_OneToOne.model1.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BrandRepository extends JpaRepository<Brand, Long>{

}