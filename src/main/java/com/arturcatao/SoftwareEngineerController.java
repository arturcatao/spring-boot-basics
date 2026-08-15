package com.arturcatao;

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
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer swe) {
        softwareEngineerService.insertSoftwareEngineer(swe);
    }

    @DeleteMapping("{id}")
    public void deleteSoftwareEngineerById(@PathVariable Integer id) {
        softwareEngineerService.deleteSoftwareEngineerById(id);
    }
}
