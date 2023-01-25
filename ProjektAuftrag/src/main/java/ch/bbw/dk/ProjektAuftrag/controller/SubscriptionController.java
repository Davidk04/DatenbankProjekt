package ch.bbw.dk.ProjektAuftrag.controller;

import ch.bbw.dk.ProjektAuftrag.model.Subscription;
import ch.bbw.dk.ProjektAuftrag.repository.GymRepository;
import ch.bbw.dk.ProjektAuftrag.repository.MemberRepository;
import ch.bbw.dk.ProjektAuftrag.repository.SplitRepository;
import ch.bbw.dk.ProjektAuftrag.repository.SubscriptionRepository;
import ch.bbw.dk.ProjektAuftrag.service.GymService;
import ch.bbw.dk.ProjektAuftrag.service.MemberService;
import ch.bbw.dk.ProjektAuftrag.service.SplitService;
import ch.bbw.dk.ProjektAuftrag.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/subscription")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;
    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @GetMapping
    public List<Subscription> getAllSubscriptionController(){
        return subscriptionService.findAllSubscription();
    }

    @PostMapping
    public Subscription createSubscriptionController(@RequestBody Subscription subscription){
        return subscriptionService.createSubscription(subscription);
    }

    @PutMapping("/{id}")
    public Subscription updateSubscriptionController(@RequestBody Subscription subscription, @PathVariable int id){
        return subscriptionService.updateSubscription(id, subscription);
    }

    @DeleteMapping("/{id}")
    public void deleteSubscriptionController(@PathVariable int id){
        subscriptionService.deleteSubscription(id);
    }
}

