package ch.bbw.dk.ProjektAuftrag.service;

import ch.bbw.dk.ProjektAuftrag.model.Subscription;
import ch.bbw.dk.ProjektAuftrag.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionService {
    @Autowired
    private final SubscriptionRepository subscriptionRepository;

    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    public List<Subscription> findAllSubscription() {
        return subscriptionRepository.findAll();
    }

    public Subscription createSubscription(Subscription subscription){
        return subscriptionRepository.save(subscription);
    }

    public Subscription updateSubscription(int id, Subscription subscription){
        subscription.setId(id);
        return subscriptionRepository.save(subscription);
    }

    public void deleteSubscription(int id){
        subscriptionRepository.deleteById(id);
    }
}
