package com.main.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ValidatePyramidService {

    public  boolean isPyramid(String str) {
        if(str==null || str.isEmpty()) return false;

        char ch []=str.toCharArray();
        int len=ch.length;

        Map<Character, Integer> cache= new HashMap<>();


        for(int i=0;i<len;i++){
            Character character=ch[i];
            Integer count= cache.get(character);

            if(count==null){
                cache.put(character,1);
            }
            else{
                cache.put(character,count+1);
            }
        }


        Integer lastCount=Integer.MAX_VALUE;

        int index=len-1;


        while(index>=0){
            Integer count = cache.get(ch[index]);
            if(count != null){

                if(count>=lastCount){
                    return  false;
                }
                else{
                    lastCount=count;
                    cache.remove(ch[index]);
                }
            }

            index--;
        }
        return true;

    }
}
