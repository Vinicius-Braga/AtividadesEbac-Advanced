package br.com.ebac.animal_service.controllers;

import br.com.ebac.animal_service.domain.Animal;
import br.com.ebac.animal_service.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping
    private List<Animal> ListAll() {
        return animalRepository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return  animalRepository.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return  animalRepository.findAdopted();
    }


}
 