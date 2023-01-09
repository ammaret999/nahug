package com.appman.nahug.controller;

import com.appman.nahug.dto.HistoryDTO;
import com.appman.nahug.model.CatModel;
import com.appman.nahug.model.HistoryModel;
import com.appman.nahug.model.VaccineModel;
import com.appman.nahug.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistoryController {
    @Autowired
    HistoryService historyService;

//    @RequestMapping(value = "/user/cat/history", method = RequestMethod.POST)
//    public HistoryModel createHistory(@RequestBody HistoryDTO historyDTO) {
//        return historyService.createHistory(historyDTO);
//    }

    @RequestMapping(value = "/user/cat/history", method = RequestMethod.GET)
    public List<HistoryModel> readHistory() {
        return historyService.getAllHistory();
    }

    @RequestMapping(value="/user/cat/history/{id}", method=RequestMethod.DELETE)
    public void deleteHistory(@PathVariable(value = "id") Long id) {
        historyService.deleteHistory(id);
    }
}
