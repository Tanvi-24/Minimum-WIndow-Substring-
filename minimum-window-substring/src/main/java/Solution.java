package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String minWindow(String s, String t) {

        List<Character> window = new ArrayList<>();
        char strarray[] = t.toCharArray();
        boolean flag[] = new boolean[strarray.length];
        int min = 9999999;


        if(s.length()<t.length())
            return "";
        if(s.length() == t.length() && s.equals(t))
            return s;
        for(int i=0;i<s.length();i++)
        {
            if(!window.contains(s.charAt(i)))
            {    window.add(s.charAt(i));
                int v = Arrays.binarySearch(strarray, s.charAt(i));
                if(v>=0)
                    if(window.contains(t.charAt(v)))
                    {
                        min = window.size();
                    }
            }
            else{
                int k = Arrays.binarySearch(strarray,s.charAt(i));
                if(k>=0)
                {
                    int index = window.indexOf(s.charAt(i));
                    while(index!=-1)
                    {
                        window.remove(index);
                        index--;
                    }
                    window.add(s.charAt(i));
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        for(Character ch : window)
            sb.append(ch);

        return sb.toString();

        //ADOBECODEBANC string to test

        //if(Pattern.matches("[+]+",s) || Pattern.matches("[-]+"))
        //            return false;
    }
}
