package com.edwardy.util;

import com.edwardy.po.DoubleColor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by yuminghua on 4/22/18.
 */
public class DoubleColorUtil {
    public static int getRandom(int min, int max){
        Random random = new Random();
        return random.nextInt(max)%(max-min+1) + min;
    }
    public static boolean isExistNumber(List<Integer> list, Integer number){
        if (list!=null && list.size() > 0){
            for(Integer integer : list){
                if(integer.intValue() == number){
                    return true;
                }
            }
        }
        return false;
    }
    //create blue number
    public static void getRedNumber(List<Integer> list){
        //red number
        if(list!=null && list.size()==0){
            while(list.size()<6){
                Integer integer = getRandom(1,35);
                if(!isExistNumber(list,integer)){
                    list.add(integer);
                }
            }
        }
    }
    //blue number
    public static void getBlueNumber(List<Integer> list){
        if(list!=null && list.size()==6){
            Integer integer = getRandom(1,15);
            list.add(integer);
        }
    }

    //create random double color
    public static DoubleColor getRandomDoubleColor(){
        DoubleColor doubleColor = null;
        List<Integer> list = new ArrayList<Integer>();
        //1 create red number
        getRedNumber(list);
        //2 sort list by asc
        Collections.sort(list);
        //3 create blue number
        getBlueNumber(list);
        //4 create DoubleColor entity
        if(list!=null && list.size()==7){
            doubleColor = new DoubleColor();
            doubleColor.setA(list.get(0));
            doubleColor.setB(list.get(1));
            doubleColor.setC(list.get(2));
            doubleColor.setD(list.get(3));
            doubleColor.setE(list.get(4));
            doubleColor.setF(list.get(5));
            doubleColor.setG(list.get(6));
        }
       return doubleColor;
    }
    //create batch random double color
    public static List<DoubleColor> getBatchRandomDoubleColor(int size){
        List<DoubleColor> list = null;
        if(size>0 && size<1001){
            DoubleColor doubleColor = null;
            list = new ArrayList<DoubleColor>();
            for (int i =0 ; i<size; i++){
                doubleColor = getRandomDoubleColor();
                list.add(doubleColor);
            }
        }
        return list;
    }
    public static void main(String [] args){
        List<DoubleColor> list = getBatchRandomDoubleColor(100);
        OutPutUtil.outPutDoubleColorList(list);
    }

}
