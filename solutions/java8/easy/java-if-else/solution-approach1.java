// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem     Java If-Else
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-26, 05:10 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N % 2 == 0){
            if (N>=2 && N <=5){
                System.out.println("Not Weird");
            }
            else if(N >=6 && N<=20){
                System.out.println("Weird");
            }
            else if(N >20){
                System.out.println("Not Weird");
            }
            
        }
        else{
            System.out.println("Weird");
        }
            
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
