package com.edwardy.service.impl;

import com.edwardy.dao.DoubleColorDao;
import com.edwardy.po.DoubleColor;
import com.edwardy.service.DoubleColorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yuminghua on 4/28/18.
 */
public class DoubleColorServiceImpl implements DoubleColorService{

    @Autowired
    private DoubleColorDao doubleColorDao;

    @Override
    public List<DoubleColor> getAllService() {
        return doubleColorDao.getAll();
    }
}
