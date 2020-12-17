package com.happiestminds.internal.idm.web.controller;

import com.happiestminds.internal.idm.business.EnterpriseService;
import com.happiestminds.internal.idm.dataaccess.entities.Enterprise;
import com.happiestminds.internal.idm.web.model.EnterpriseDto;
import com.happiestminds.internal.idm.web.transformer.EnterpriseTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprises")
public class EnterpriseController {

    private EnterpriseService enterpriseService;

    @Autowired
    public EnterpriseController(EnterpriseService anEnterpriseService) {
        this.enterpriseService = anEnterpriseService;
    }

    @GetMapping
    public List<EnterpriseDto> getEnterprises() {
        return EnterpriseTransformer.INSTANCE.toDto(enterpriseService.getEnterprises());
    }

    @GetMapping("/{id}")
    public EnterpriseDto getEnterprise(@PathVariable long id) {
        return EnterpriseTransformer.INSTANCE.toDto(enterpriseService.getEnterpriseById(id));
    }

    @PostMapping
    public EnterpriseDto saveEnterprise(@RequestBody Enterprise enterprise) {
        return EnterpriseTransformer.INSTANCE.toDto(enterpriseService.saveEnterprise(enterprise));
    }

    @PutMapping("/{id}")
    public EnterpriseDto updateEnterprise(@PathVariable long id, @RequestBody Enterprise enterprise) {
        return EnterpriseTransformer.INSTANCE.toDto(enterpriseService.updateEnterprise(id, enterprise));
    }

    @DeleteMapping("/{id}")
    public void deleteEnterprise(@PathVariable long id) {
        enterpriseService.deleteEnterprise(id);
    }
}
