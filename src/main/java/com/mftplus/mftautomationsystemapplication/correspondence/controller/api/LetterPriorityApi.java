package com.mftplus.mftautomationsystemapplication.correspondence.controller.api;

import com.mftplus.mftautomationsystemapplication.correspondence.model.LetterPriority;
import com.mftplus.mftautomationsystemapplication.correspondence.service.LetterPriorityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/letterPriorities")
public class LetterPriorityApi {

    private final LetterPriorityService letterPriorityService;

    public LetterPriorityApi(LetterPriorityService letterPriorityService) {
        this.letterPriorityService = letterPriorityService;
    }

    @GetMapping
    public Object findAllLetterPriority() {
        return letterPriorityService.findAll();
    }

    @GetMapping("/{id}")
    public Object findLetterPriorityById(@PathVariable Long id) {
        return letterPriorityService.findById(id);
    }

    @PostMapping
    public void addLetterPriority(@RequestBody LetterPriority letterPriority) {
        letterPriorityService.save(letterPriority);
    }

    @PutMapping
    public void updateLetterPriority(@RequestBody LetterPriority letterPriority) {
        letterPriorityService.update(letterPriority);
    }

    @DeleteMapping("/{id}")
    public void deleteLetterPriority(@PathVariable Long id) {
        letterPriorityService.delete(id);
    }
}
