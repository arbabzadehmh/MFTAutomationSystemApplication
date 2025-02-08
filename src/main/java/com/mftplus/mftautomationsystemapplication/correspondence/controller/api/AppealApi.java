package com.mftplus.mftautomationsystemapplication.correspondence.controller.api;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Appeal;
import com.mftplus.mftautomationsystemapplication.correspondence.service.AppealService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/rest/appeals")
public class AppealApi {

    private final AppealService appealService;

    public AppealApi(AppealService appealService) {
        this.appealService = appealService;
    }

    @GetMapping
    public Object findAllAppeals() {
        return appealService.findAll();
    }

    @GetMapping("/{id}")
    public Object findAppealById(@PathVariable Long id) {
        return appealService.findById(id);
    }

    @PostMapping
    public void addAppeal(@RequestBody Appeal appeal) {
        appealService.save(appeal);
    }

    @PutMapping
    public void updateAppeal(@RequestBody Appeal appeal) {
        appealService.update(appeal);
    }

    @DeleteMapping("/{id}")
    public void deleteAppeal(@PathVariable Long id) {
        appealService.delete(id);
    }
}
