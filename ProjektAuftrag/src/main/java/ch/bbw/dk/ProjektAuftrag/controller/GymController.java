package ch.bbw.dk.ProjektAuftrag.controller;

import ch.bbw.dk.ProjektAuftrag.model.Gym;
import ch.bbw.dk.ProjektAuftrag.repository.GymRepository;
import ch.bbw.dk.ProjektAuftrag.repository.MemberRepository;
import ch.bbw.dk.ProjektAuftrag.service.GymService;
import ch.bbw.dk.ProjektAuftrag.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/gym")
public class GymController {

    @Autowired
    private GymService gymService;
    @Autowired
    private GymRepository gymRepository;

    @GetMapping
    public List<Gym> getAllGymController(){
        return gymService.findAllGym();
    }

    @PostMapping
    public Gym createGymrController(@RequestBody Gym gym){
        return gymService.createGym(gym);
    }

    @PutMapping("/{id}")
    public Gym updateGymController(@RequestBody Gym gym, @PathVariable int id){
        return gymService.updateGym(id, gym);
    }

    @DeleteMapping("/{id}")
    public void deleteGymController(@PathVariable int id){
        gymService.deleteGym(id);
    }
}

