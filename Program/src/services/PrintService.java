package services;

import java.util.ArrayList;
import java.util.List;

/*A classe PrintService foi elaborada e definida para utilização apenas de valores inteiros, 
 caso a lista fosse de variáveis de qualquer outro tipo (String) por exemplo seria necessário 
 a criação de uma nova classe onde seria repetido todo o processo elaborado, mais definindo 
 os métodos para String, gerando um probelma de reuso */
/* 
public class PrintService {
    
    private List<Integer> list = new ArrayList<>();

    public void addValue(Integer value) {
        list.add(value);
    }

    public Integer first() {
        if(list.isEmpty()) {
            throw new IllegalStateException("List is empy");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if(!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
    */




/* Solução utilizando Generics */


    public class PrintService<T> {
    
    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if(list.isEmpty()) {
            throw new IllegalStateException("List is empy");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if(!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");

     }
}