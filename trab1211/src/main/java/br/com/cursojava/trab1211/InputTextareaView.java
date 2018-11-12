package br.com.cursojava.trab1211;



import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class InputTextareaView {
     
    public List<String> completeArea(String query) {
        List<String> results = new ArrayList<String>();
         
        if(query.equals("teste")) {
            results.add("teste1!!!");
            results.add("teste2.");
            results.add("teste3.");
            results.add("teste4.");
            results.add("teste5!");
        }
        else {
            for(int i = 0; i < 10; i++) {
                results.add(query + i);
            }
        }
         
        return results;
    }
}