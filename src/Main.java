import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        int counter = 0;
        int positionmax=0;
        int valueArray = 0;
        int[] myArray = {1, 2, 2, 5, 4, 6, 7, 8, 8, 8};
        Map<Integer, Integer> aux = new HashMap<Integer, Integer>();
        List<Integer> noRepetidos = new ArrayList<>(0);
        aux.put(0, 0);
        for(int k=0; k<myArray.length;k++){
            if(!aux.values().contains(myArray[k])){
                aux.put(myArray[k],0);
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            if(!noRepetidos.contains(myArray[i])){
                noRepetidos.add(myArray[i]);
                for (int j = 0; j < myArray.length; j++){
                    if (myArray[j] == myArray[i]) {
                        aux.put(myArray[i], aux.get(myArray[i]) + 1);
                    }
                }
            }
        }
/*
        for (Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }*/
        positionmax = (int) Collections.max(aux.values());
        for (Map.Entry<Integer, Integer> entry : aux.entrySet()) {
            if(entry.getValue() == positionmax){
                valueArray = entry.getKey();
            }
           // System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
        }


        System.out.println("Longest:" + positionmax);
        System.out.println("Number: "+valueArray);
        System.out.println(aux);
    }
/*
                if(aux.values().contains(myArray[i]) && myArray[i] == aux.get(i)){
                    aux.put(myArray[i],aux.get(myArray[i])+1);
                }else{
                    aux.put(myArray[i],1);
                }

 */
        /*
        for(int i= 0;i<myArray.length;i++){
            for(int j =0;j<myArray.length;j++ ){
                if(myArray[i] == myArray[j]){
                    System.out.println("Valor igual : "+myArray[i]);
                    //listaRepetidos.add(i,myArray[i]);

                }
            }
        }
        System.out.println(listaRepetidos);

       valoresRepetidos.put(i,listaRepetidos.get(i));
       for(int k=0; k<listaRepetidos.size();k++){
       if(listaRepetidos.get(i)==listaRepetidos.get(k)){
       valoresRepetidos.put(i,valoresRepetidos.get(i)+1);
                        }
                    }
         */
/*

        /*
        List<Integer> Numeros;
        Numeros = new ArrayList<>();

        Numeros.add(1);
        System.out.println(Numeros.get(0));
     int[] numeros = new int[100];
        for(int i=0; i < 100; i++){
            numeros[i] = i+1;
            System.out.println(numeros[i]);
        }
*/
    }

