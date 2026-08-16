package com.arturcatao.service;

import com.arturcatao.dto.SoftwareEngineerDto;
import com.arturcatao.entity.SoftwareEngineer;
import com.arturcatao.repository.SoftwareEngineerRepository;
import com.arturcatao.request.SoftwareEngineerRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {
    private SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineerDto insertSoftwareEngineer(SoftwareEngineerRequest sweRequest) {
        SoftwareEngineer swe = new SoftwareEngineer(sweRequest);
        softwareEngineerRepository.save(swe);

        return new SoftwareEngineerDto(swe);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(id + "not found"));
    }

    public  void deleteSoftwareEngineerById(Integer id) {
        softwareEngineerRepository.deleteById(id);
    }

}
