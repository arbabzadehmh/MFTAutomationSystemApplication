package com.mftplus.mftautomationsystemapplication.correspondence.controller.api;

import com.mftplus.mftautomationsystemapplication.correspondence.model.Letter;
import com.mftplus.mftautomationsystemapplication.correspondence.service.LetterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/letters")
public class LetterApi {

    private final LetterService letterService;

    public LetterApi(LetterService letterService) {
        this.letterService = letterService;
    }

    @GetMapping
    public Object findAllLetters() {
        return letterService.findAll();
    }

    @GetMapping("/{id}")
    public Object findLetterById(@PathVariable Long id) {
        return letterService.findById(id);
    }

    @PostMapping
    public void addLetter(@RequestBody Letter letter) {
        letterService.save(letter);
    }

    @PutMapping
    public void updateLetter(@RequestBody Letter letter) {
        letterService.update(letter);
    }

    @DeleteMapping("/{id}")
    public void deleteLetter(@PathVariable Long id) {
        letterService.delete(id);
    }

}
