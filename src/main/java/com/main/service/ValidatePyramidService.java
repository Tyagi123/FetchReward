package com.main.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ValidatePyramidService {

    public  boolean isPyramid(String str) {
        //base case
        if(str==null || str.isEmpty()) return false;

        int len=str.length();

        //map to store count by char
        Map<Character, Integer> cache= new HashMap<>();

        Character lastChar= null;


// creating map with count
        for(int i=0;i<len;i++){
            Character character=str.charAt(i);
            if(lastChar==null || lastChar!=character){
                lastChar=character;
            }
            else{
                return false;
            }

            //if there is any space in string return false
            if(character == ' ')return false;;

            Integer count= cache.get(character);
            if(count==null){
                cache.put(character,1);
            }
            else{
                cache.put(character,count+1);
            }
        }




        Integer lastCount=cache.get(str.charAt(len-1));
        cache.remove(str.charAt(len-1));
        int index=len-2;


        //comparing from end of the string
        while(index>=0){
            Integer count = cache.get(str.charAt(index));
            if(count != null){

                if(count!=lastCount-1){
                    return  false;
                }
                else{
                    lastCount=count;
                    cache.remove(str.charAt(index));
                }
            }

            index--;
        }


        return true;

    }
}
