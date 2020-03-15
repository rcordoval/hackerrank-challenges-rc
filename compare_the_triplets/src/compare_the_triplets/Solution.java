package compare_the_triplets;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 * @author rodrigocordovalopez
 *
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<Integer>();
		 result.add(0);
		 result.add(0);
    	 for (int counter = 0; counter < a.size(); counter++) {
    		 if(a.get(counter) != b.get(counter)) {
    			 	if(a.get(counter) > b.get(counter)) {
    			 		result.set(0, result.get(0) + 1);
    			 	} else {
    			 		result.set(1, result.get(1) + 1);
    			 	}
    		 }
         }   	
    	 return result;
    }

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = compareTriplets(a, b);

		System.out.println(result);
	}
}