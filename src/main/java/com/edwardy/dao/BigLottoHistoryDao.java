package com.edwardy.dao;



import com.edwardy.po.BigLottoHistory;

import java.util.List;

/**
 * Created by yuminghua on 8/11/18.
 */
public interface BigLottoHistoryDao {
    List<BigLottoHistory> listByPage(int start, int pageSize);

    int getCount();
}
