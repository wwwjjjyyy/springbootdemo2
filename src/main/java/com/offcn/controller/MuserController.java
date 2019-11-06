package com.offcn.controller;

import com.offcn.mapper.MuserMapper;
import com.offcn.pojo.Muser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/muser")
public class MuserController {
    @Autowired
    private MuserMapper muserMapper;
    @RequestMapping(value = "/getUserList")
    public List<Muser> getUserList(){
        List<Muser> list = muserMapper.getUserList();
        return list;
    }
}
