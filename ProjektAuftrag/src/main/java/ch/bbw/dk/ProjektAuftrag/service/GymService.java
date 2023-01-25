package ch.bbw.dk.ProjektAuftrag.service;

import ch.bbw.dk.ProjektAuftrag.model.Gym;
import ch.bbw.dk.ProjektAuftrag.repository.GymRepository;
import ch.bbw.dk.ProjektAuftrag.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymService {
    @Autowired
    private final GymRepository gymRepository;

    public GymService(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }

    public List<Gym> findAllGym() {
        return gymRepository.findAll();
    }

    public Gym createGym(Gym gym){
        return gymRepository.save(gym);
    }

    public Gym updateGym(int id, Gym gym){
        gym.setId(id);
        return gymRepository.save(gym);
    }

    public void deleteGym(int id){
        gymRepository.deleteById(id);
    }
}
