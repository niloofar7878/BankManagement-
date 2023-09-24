package com.example.BankManagement.modules.bankBranch.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BankBranchController {

    @PostMapping("/new")
    @ResponseBody
    public String CreateBranch() {}

    @DeleteMapping({"/",""})
    public ResponseEntity<?> delete() {}

    @GetMapping("/{bankId}/{empId}")
    @ResponseBody
    public BankBranch addEmpToBank() {}

    @GetMapping("/get/emp/{id}")
    @ResponseBody
    List<Employee> getEmployyesById() {}
}
