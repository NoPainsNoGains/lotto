package com.edwardy.service.impl;

import com.edwardy.dao.BigLottoHistoryDao;
import com.edwardy.po.BigLottoHistory;
import com.edwardy.service.BigLottoHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yuminghua on 8/11/18.
 */
@Service("bigLottoHistoryServiceImpl")
public class BigLottoHistoryServiceImpl implements BigLottoHistoryService{
    @Autowired
    private BigLottoHistoryDao bigLottoHistoryDao;

    @Override
    public List<BigLottoHistory> listByPageService(int start, int pageSize) {
        return bigLottoHistoryDao.listByPage(start, pageSize);
    }

    @Override
    public int getCountService(){
        return bigLottoHistoryDao.getCount();
    }
}
