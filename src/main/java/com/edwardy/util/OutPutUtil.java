package com.edwardy.util;



import com.edwardy.po.DoubleColor;

import javax.swing.*;
import java.util.List;

/**
 * Created by yuminghua on 4/22/18.
 */
public class OutPutUtil {
    public static void outPutDoubleColor(DoubleColor doubleColor){
       System.out.println(doubleColor.getA()+"  "+doubleColor.getB()+"  "+doubleColor.getC()+"  "+doubleColor.getD()+"  "+doubleColor.getE()+"  "+doubleColor.getF()+"  |   "+doubleColor.getG());
    }

    public static void outPutDoubleColorList(List<DoubleColor> list){
        if(list!=null && list.size()>0){
            for(DoubleColor doubleColor : list){
                System.out.println(doubleColor.getA()+"  "+doubleColor.getB()+"  "+doubleColor.getC()+"  "+doubleColor.getD()+"  "+doubleColor.getE()+"  "+doubleColor.getF()+"  |   "+doubleColor.getG());
            }
        }
    }
}
