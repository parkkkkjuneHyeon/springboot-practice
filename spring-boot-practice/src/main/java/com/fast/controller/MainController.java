package com.fast.controller;


import com.fast.service.SortService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class MainController {

    private final SortService sortService;

//    public MainController(SortService sortService) {
//        this.sortService = sortService;
//    }

    @GetMapping("/")
    public String hello(@RequestParam List<String> list) {

       return sortService.doSort(list).toString();
    }
}
