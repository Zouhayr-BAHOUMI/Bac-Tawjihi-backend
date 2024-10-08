package tawjih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tawjih.enums.Province;
import tawjih.enums.Region;
import tawjih.enums.Ville;
import tawjih.model.Adresse;

import java.util.List;
import java.util.Optional;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    Optional<Adresse> findByRegionAndAndProvinceAndAndVille(Region region, Province province, Ville ville);

    Adresse findByRegionAndProvinceAndVille(Region region, Province province, Ville ville);

    List<Adresse> findByRegion(Region region);
}
