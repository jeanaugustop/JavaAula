package br.edu.up.collections;

import java.sql.SQLOutput;
import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        List<String> list = new ArrayList<String>();
        Map<Integer, String> map = new HashMap<>();

        list.add("Joaquim");
        list.add("Maria");
        list.add("Ana");

        Collections.sort(list);

        Collections.reverse(list);

        for (String value : list){
            System.out.println(value);
        }


    }

}
