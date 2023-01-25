package ch.bbw.dk.ProjektAuftrag.controller;

import ch.bbw.dk.ProjektAuftrag.model.Split;
import ch.bbw.dk.ProjektAuftrag.repository.GymRepository;
import ch.bbw.dk.ProjektAuftrag.repository.MemberRepository;
import ch.bbw.dk.ProjektAuftrag.repository.SplitRepository;
import ch.bbw.dk.ProjektAuftrag.service.GymService;
import ch.bbw.dk.ProjektAuftrag.service.MemberService;
import ch.bbw.dk.ProjektAuftrag.service.SplitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/split")
public class SplitController {

    @Autowired
    private SplitService splitService;
    @Autowired
    private SplitRepository splitRepository;

    @GetMapping
    public List<Split> getAllSplitController(){
        return splitService.findAllSplit();
    }

    @PostMapping
    public Split createSplitController(@RequestBody Split split){
        return splitService.createSplit(split);
    }

    @PutMapping("/{id}")
    public Split updateSplitController(@RequestBody Split split, @PathVariable int id){
        return splitService.updateSplit(id, split);
    }

    @DeleteMapping("/{id}")
    public void deleteSplitController(@PathVariable int id){
        splitService.deleteSplit(id);
    }
}

