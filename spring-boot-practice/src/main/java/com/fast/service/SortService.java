package com.fast.service;

import com.fast.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {
    private final Sort<String> sortStr;

    public SortService(@Qualifier("bubbleSort")Sort<String> sortStr) {
        this.sortStr = sortStr;
    }
    public List<String> doSort(List<String> list) {
        return sortStr.sort(list);
    }
}
