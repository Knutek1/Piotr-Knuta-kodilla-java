package com.kodilla.stream.mirror;

public class Mirror {
    public String mirror(String string){
        char array[] = string.toCharArray();
        for(int i = 0; i<array.length/2; i++){
            char c = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[i]=c;
        }
        StringBuilder sb = new StringBuilder();
        for (char o : array) {
            sb.append(o);
        }
        System.out.println(sb.toString());
        return sb.toString();

    }
}
