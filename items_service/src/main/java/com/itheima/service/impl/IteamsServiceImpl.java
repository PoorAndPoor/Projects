package com.itheima.service.impl;

import com.itheima.dao.IteamsDao;
import com.itheima.domain.iteams;
import com.itheima.service.IteamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IteamsServiceImpl implements IteamsService {
    @Autowired
    private IteamsDao iteamsDao;
    @Override
    public iteams findById(int id) {
        return iteamsDao.findById(id);
    }
}
