package tawjih.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UniversiteDto {

    private Long id;
    private String imageUrl;
    private String nomUniversite;
    private AdresseDto adresse;
}
