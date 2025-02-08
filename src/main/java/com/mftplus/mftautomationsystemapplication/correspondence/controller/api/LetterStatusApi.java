package com.mftplus.mftautomationsystemapplication.correspondence.controller.api;

import com.mftplus.mftautomationsystemapplication.correspondence.model.LetterStatus;
import com.mftplus.mftautomationsystemapplication.correspondence.service.LetterStatusService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/letterStatuses")
public class LetterStatusApi {

    private final LetterStatusService letterStatusService;

    public LetterStatusApi(LetterStatusService letterStatusService) {

        this.letterStatusService = letterStatusService;
    }

    @GetMapping
    public Object findAllLetterStatuses() {
        return letterStatusService.findAll();
    }

    @GetMapping("/{id}")
    public Object findLetterStatusById(@PathVariable Long id) {
        return letterStatusService.findById(id);
    }

    @PostMapping
    public void addLetterStatus(@RequestBody LetterStatus letterStatus) {
        letterStatusService.save(letterStatus);
    }

    @PutMapping
    public void updateLetterStatus(@RequestBody LetterStatus letterStatus) {
        letterStatusService.update(letterStatus);
    }

    @DeleteMapping("/{id}")
    public void deleteLetterStatus(@PathVariable Long id) {
        letterStatusService.delete(id);
    }

}
