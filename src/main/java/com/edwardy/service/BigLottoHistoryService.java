package com.edwardy.service;

import com.edwardy.po.BigLottoHistory;

import java.util.List;

/**
 * Created by yuminghua on 8/11/18.
 */
public interface BigLottoHistoryService {
    public List<BigLottoHistory> listByPageService(int start, int pageSize);

    public int getCountService();
}
