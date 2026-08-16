package com.arturcatao.controller;

import com.arturcatao.dto.SoftwareEngineerDto;
import com.arturcatao.request.SoftwareEngineerRequest;
import com.arturcatao.service.SoftwareEngineerService;
import com.arturcatao.entity.SoftwareEngineer;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getAllSoftwareEngineers();
    }

    @GetMapping("{id}")
    public SoftwareEngineer getSoftwareEngineerById(@PathVariable Integer id) {
        return softwareEngineerService.getSoftwareEngineerById(id);
    }

    @PostMapping
    public ResponseEntity<SoftwareEngineerDto> addNewSoftwareEngineer(@Valid @RequestBody SoftwareEngineerRequest swe) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                softwareEngineerService.insertSoftwareEngineer(swe)
        );
    }

    @DeleteMapping("{id}")
    public void deleteSoftwareEngineerById(@PathVariable Integer id) {
        softwareEngineerService.deleteSoftwareEngineerById(id);
    }
}
