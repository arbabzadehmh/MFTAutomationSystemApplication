package com.mftplus.mftautomationsystemapplication.correspondence.controller.api;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Referrals;
import com.mftplus.mftautomationsystemapplication.correspondence.service.ReferralsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/referrals")
public class ReferralsApi {

    private final ReferralsService referralsService;

    public ReferralsApi(ReferralsService referralsService) {
        this.referralsService = referralsService;
    }

    @GetMapping
    public Object findAllReferrals() {
        return referralsService.findAll();
    }

    @GetMapping("/{id}")
    public Object findReferralById(@PathVariable Long id) {
        return referralsService.findById(id);
    }

    @PostMapping
    public void addReferrals(@RequestBody Referrals referrals) {
        referralsService.save(referrals);
    }

    @PutMapping
    public void updateReferrals(@RequestBody Referrals referrals) {
        referralsService.update(referrals);
    }

    @DeleteMapping("/{id}")
    public void deleteReferrals(@PathVariable Long id) {
        referralsService.delete(id);
    }
}
