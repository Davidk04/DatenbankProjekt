package ch.bbw.dk.ProjektAuftrag.service;

import ch.bbw.dk.ProjektAuftrag.model.Split;
import ch.bbw.dk.ProjektAuftrag.repository.SplitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SplitService {
    @Autowired
    private final SplitRepository splitRepository;

    public SplitService(SplitRepository splitRepository) {
        this.splitRepository = splitRepository;
    }

    public List<Split> findAllSplit() {
        return splitRepository.findAll();
    }

    public Split createSplit(Split split){
        return splitRepository.save(split);
    }

    public Split updateSplit(int id, Split split){
        split.setId(id);
        return splitRepository.save(split);
    }

    public void deleteSplit(int id){
        splitRepository.deleteById(id);
    }
}
