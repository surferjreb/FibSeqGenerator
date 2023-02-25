package com.brownj;

import java.util.ArrayList;
import java.util.List;



public class FibSeq {

    private int sequenceLength = 0;
    private List<Integer> fib;

    //Constructor
    public FibSeq(int n){
        this.sequenceLength = n;
        this.fib = new ArrayList<>(n);
    }

    private void generateFibSeq(){
        int a = 0;
        int b = 0;

        for(int i =0; i < this.sequenceLength; i++){
            
            if(i > 1){
                a = fib.get(i-2);
                b = fib.get(i-1) + a;
                fib.add(b);

            } else {
                fib.add(i);
            }
        }

    }

    private void printFibSequence(){
        for(int i=0; i < fib.size(); i++){
            String seq = String.format("%d: %d%n", i+1, fib.get(i));
            System.out.print(seq);
        }
    }

    protected List<Integer> getFibSeq(){
        if(!fib.isEmpty()){
            return fib;
        }

        return null;
    }

    public void showFib(){
        this.generateFibSeq();
        this.printFibSequence();
    }

    @Override
    public String toString(){
        return String.format("the sequence length is: %d", this.sequenceLength);
    }

}