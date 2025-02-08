package com.mftplus.mftautomationsystemapplication.correspondence.controller.api;

import com.mftplus.mftautomationsystemapplication.correspondence.model.LetterDetail;
import com.mftplus.mftautomationsystemapplication.correspondence.service.LetterDetailService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/letterDetails")
public class LetterDetailApi {

    private final LetterDetailService letterDetailService;

    public LetterDetailApi(LetterDetailService letterDetailService) {
        this.letterDetailService = letterDetailService;
    }

    @GetMapping
    public Object findAllLetterDetails() {
        return letterDetailService.findAll();
    }

    @GetMapping("/{id}")
    public Object findLetterDetailById(@PathVariable Long id) {
        return letterDetailService.findById(id);
    }

    @PostMapping
    public void addLetterDetail(@RequestBody LetterDetail letterDetail) {
        letterDetailService.save(letterDetail);
    }

    @PutMapping
    public void updateLetterDetail(@RequestBody LetterDetail letterDetail) {
        letterDetailService.update(letterDetail);
    }

    @DeleteMapping("/{id}")
    public void deleteLetterDetailById(@PathVariable Long id) {
        letterDetailService.delete(id);
    }
}
