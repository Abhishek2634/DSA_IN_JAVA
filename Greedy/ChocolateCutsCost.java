package Greedy;

import java.util.*;

public class ChocolateCutsCost {
    public static void main(String[] args) {
       // You are given a bar of chocolate composed of mxn pieces.one should break the chocolate.into single squares.Each break of a part of a chocolate is charged a cost expressed by a positive integer.This cost does not depend on the size of a part that is being broken but only depends on the line the break goes along .cost of breaking along consecutive  vertical lines with x1,x2,....xn-1 and along horizontal lines with  y1, y2, ...... yn-1.compute the minimal cost of breaking the whole chocolate into single squares .


        // int n = 4;
        // int m = 6;

        Integer horizontal[] = {2,1,3,1,4};
        Integer vertical[] = {4,1,2};

        int horizontalPieces = 1;
        int verticalPieces = 1;
        int p1 = 0;
        int p2  = 0;

        int totalCost = 0;
        Arrays.sort(vertical,Collections.reverseOrder());
        Arrays.sort(horizontal,Collections.reverseOrder());

        while(p1 < horizontal.length && p2 < vertical.length){
            if(horizontal[p1] <= vertical[p2]){//vertical cut.
                totalCost += horizontalPieces*vertical[p2];
                verticalPieces++;
                p2++;
            }else{// horizontal cut.
                totalCost += verticalPieces*horizontal[p1];
                horizontalPieces++;
                p1++;
            }
        }
        while(p1 < horizontal.length){
            totalCost += verticalPieces*horizontal[p1];
            horizontalPieces++;
            p1++;
        }
        while(p2 < vertical.length){
            totalCost += horizontalPieces*vertical[p2];
            verticalPieces++;
            p2++;
        }
        
        System.out.println("min cost is :"+totalCost);
    }
}
