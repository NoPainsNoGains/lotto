package com.edwardy.controller;

import com.alibaba.fastjson.JSONObject;
import com.edwardy.po.BigLottoHistory;
import com.edwardy.service.BigLottoHistoryService;
import com.edwardy.vo.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yuminghua on 8/18/18.
 */
@Controller
@RequestMapping("/bigLotto")
public class BigLottoController {
    @Autowired
    private BigLottoHistoryService bigLottoHistoryService;
    @RequestMapping(value = "/listByPage")
    @ResponseBody
    public String listByPage(int page, int rows, HttpServletResponse response, HttpServletRequest request, Model model){
        try{
            PageModel<BigLottoHistory> pageModel = new PageModel<BigLottoHistory>();
            response.setContentType("application/json; charset=utf-8");
            int start = (page-1)*rows;
            //int end = page * rows;
            pageModel.setTotal(bigLottoHistoryService.getCountService());
            pageModel.setRows(bigLottoHistoryService.listByPageService(start, rows));
            return JSONObject.toJSONString(pageModel);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
