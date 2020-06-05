package sort;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort {
	public static void main(String[] args)
	{
		List<Integer> intArray = new ArrayList<Integer>();
		String file = "C:\\Users\\mdunk\\Documents\\Projects N' Progs\\eclipse-java\\java-sort\\src\\duplicate.txt";
		long timeElapsed = 0; 
		try {
		//Bubble sort on "duplicate.txt"
		System.out.println("Bubble sort on \"duplicate.txt\"");
		readFile(file, intArray);
		bubbleSort(intArray);
		intArray.clear();
		System.out.println("");
		System.out.println("Quick sort sorted on \"duplicate.txt\"");
		readFile(file, intArray);
		long[] cntArray = {0,0};
		timeElapsed = System.nanoTime();
		//Quick sort on "duplicate.txt"
		quickSort(intArray,0,intArray.size()-1, cntArray);
		timeElapsed = System.nanoTime() - timeElapsed;
		System.out.println(cntArray[1] + " comparisons and "  + cntArray[0] + " swaps");

	
		System.out.println("");
		System.out.println("Bucket sort on \"duplicate.txt\"");
		intArray.clear();
		//Bucket sort on "duplicate.txt"
		readFile(file, intArray);
		bucketSort(intArray);
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		//Bubble sort on "nearly-unsorted.txt"
		file = "C:\\Users\\mdunk\\Documents\\Projects N' Progs\\eclipse-java\\java-sort\\src\\nearly-unsorted.txt";
		intArray.clear();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Bubble sort on \"nearly-unsorted\"");
		readFile(file, intArray);
		bubbleSort(intArray);
		//Quick sort on "nearly-unsorted.txt
		intArray.clear();
		cntArray[0] = 0;
		cntArray[1] = 0;
		System.out.println("");
		System.out.println("Quick sort on \"nearly-unsorted\"");
		readFile(file, intArray);
		timeElapsed = System.nanoTime();
		quickSort(intArray,0,intArray.size()-1, cntArray);
		timeElapsed = System.nanoTime() - timeElapsed;
		System.out.println(cntArray[1] + " comparisons and "  + cntArray[0] + " swaps");
		//Bucket sort on "nearly-unsorted.txt"
		System.out.println("");
		System.out.println("Bucket sort on \"nearly-unsorted.txt\"");
		intArray.clear();
		readFile(file, intArray);
		bucketSort(intArray);
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		//Bubble sort on "nearly-sorted.txt"
		file = "C:\\Users\\mdunk\\Documents\\Projects N' Progs\\eclipse-java\\java-sort\\src\\nearly-sorted.txt";
		intArray.clear();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Bubble sort on \"nearly-sorted\"");
		readFile(file, intArray);
		bubbleSort(intArray);
		//Quick sort on "nearly-sorted.txt"
		intArray.clear();
		cntArray[0] = 0;
		cntArray[1] = 0;
		System.out.println("");
		System.out.println("Quick sort on \"nearly-sorted\"");
		readFile(file, intArray);
		timeElapsed = System.nanoTime();
		quickSort(intArray,0,intArray.size()-1, cntArray);
		timeElapsed = System.nanoTime() - timeElapsed;
		System.out.println(cntArray[1] + " comparisons and "  + cntArray[0] + " swaps");
		
		//Bucket sort on "nearly-sorted.txt"
		System.out.println("");
		System.out.println("Bucket sort on \"nearly-sorted.txt\"");
		intArray.clear();
		readFile(file, intArray);
		bucketSort(intArray);
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		//Bubble sort on "shuffled.txt"
		file = "C:\\Users\\mdunk\\Documents\\Projects N' Progs\\eclipse-java\\java-sort\\src\\shuffled.txt";
		intArray.clear();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Bubble sort on \"shuffled\"");
		readFile(file, intArray);
		bubbleSort(intArray);
		//Quick sort on "shuffled.txt.
		intArray.clear();
		cntArray[0] = 0;
		cntArray[1] = 0;
		System.out.println("");
		System.out.println("Quick sort on \"shuffled.txt\"");
		readFile(file, intArray);
		timeElapsed = System.nanoTime();
		quickSort(intArray,0,intArray.size()-1, cntArray);
		timeElapsed = System.nanoTime() - timeElapsed;
		System.out.println(cntArray[1] + " comparisons and "  + cntArray[0] + " swaps");

		//Bucket sort on "shuffled.txt"
		System.out.println("");
		System.out.println("Bucket sort on \"shuffled.txt\"");
		intArray.clear();
		readFile(file, intArray);
		bucketSort(intArray);
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//Bubble sort on "sorted.txt"
		file = "C:\\Users\\mdunk\\Documents\\Projects N' Progs\\eclipse-java\\java-sort\\src\\sorted.txt";
		intArray.clear();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Bubble sort on \"sorted\"");
		readFile(file, intArray);
		bubbleSort(intArray);
		
		//Quick sort on "sorted.txt."
		intArray.clear();
		cntArray[0] = 0;
		cntArray[1] = 0;
		System.out.println("");
		System.out.println("Quick sort on \"sorted.txt\"");
		readFile(file, intArray);
		quickSort(intArray,0,intArray.size()-1, cntArray);
		System.out.println(cntArray[1] + " comparisons and "  + cntArray[0] + " swaps");	
		
		//Bucket sort on "sorted.txt"
		System.out.println("");
		System.out.println("Bucket sort on \"sorted.txt\"");
		intArray.clear();
		readFile(file, intArray);
		bucketSort(intArray);		
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//Bubble sort on "unsorted.txt"
		file = "C:\\Users\\mdunk\\Documents\\Projects N' Progs\\eclipse-java\\java-sort\\src\\unsorted.txt";
		intArray.clear();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Bubble sort on \"unsorted\"");
		readFile(file, intArray);
		bubbleSort(intArray);
		
		//Quick sort on "unsorted.txt."
		intArray.clear();
		cntArray[0] = 0;
		cntArray[1] = 0;
		System.out.println("");
		System.out.println("Quick sort on \"unsorted.txt\"");
		readFile(file, intArray);
		quickSort(intArray,0,intArray.size()-1, cntArray);
		timeElapsed = System.nanoTime() - timeElapsed;
		System.out.println(cntArray[1] + " comparisons and "  + cntArray[0] + " swaps");
		
		//Bucket sort on "unsorted.txt"
		System.out.println("");
		System.out.println("Bucket sort on \"unsorted.txt\"");
		intArray.clear();
		readFile(file, intArray);
		bucketSort(intArray);
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		//Bubble sort on "one-million-randoms.txt"
		file = "C:\\Users\\mdunk\\Documents\\Projects N' Progs\\eclipse-java\\java-sort\\src\\one-million-randoms.txt";
		intArray.clear();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Bubble sort on \"one-million-randoms\"");
		readFile(file, intArray);
		bubbleSort(intArray);
		
		//Quick sort on "one-million-randoms.txt"
		intArray.clear();
		cntArray[0] = 0;
		cntArray[1] = 0;
		System.out.println("");
		System.out.println("Quick sort on \"one-million-randoms.txt\"");
		readFile(file, intArray);
		quickSort(intArray, 0, intArray.size()-1, cntArray);
		System.out.println(cntArray[1] + " comparisons and "  + cntArray[0] + " swaps");	

		//Bucket sort "one-million-randoms.txt"
		intArray.clear();
		System.out.println("\n");
		System.out.println("Bucket sort on \"one-million-randoms.txt\"");
		readFile(file, intArray);
		bucketSort(intArray);
		
		
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {			
		}
	}
	public static void readFile(String aFile, List<Integer> iArray) throws FileNotFoundException { 
		try {
			BufferedReader reader = new BufferedReader(new FileReader(aFile));
			String line;
			line = reader.readLine();
			while ((line = reader.readLine()) != null  && line.length() != 0) {
				iArray.add(Integer.parseInt(line));
			}
			reader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {			
		}
		
	}
	public static void bubbleSort(List<Integer> iArray) 
	{
		long cprCnt = 0;
		long swapCnt = 0; 
		for(int i = 0;i < iArray.size(); i++) 
		{ 
			for(int j = 1; j < iArray.size(); j++) 
			{
				if(iArray.get(j-1) > iArray.get(j))
				{
					//Swap the elements if the element before current 'j' is larger
					Collections.swap(iArray, j,j-1);
					swapCnt++;
				}
				cprCnt++;
			} 
	
		}
		System.out.println(cprCnt + " comparisons and " + swapCnt + " swaps");
	}
	
	public static int partition(List<Integer> iArray, int start, int end, long[] cntArray) {
		if(start < end) {
			int pivot = iArray.get(end);
			//Partition index
			int pIndex = start;
			for (int i = start; i < end-1; i++) {
				if(iArray.get(i) <= pivot) {
					Collections.swap(iArray, pIndex, i);
					cntArray[0] +=  1;
					pIndex++;						
				}
				cntArray[1] +=  1;
			}
			Collections.swap(iArray, pIndex+1, end);
			cntArray[0] += 1;
			return pIndex;
		}
		else 
			return start;
	}

	public static List<Integer> quickSort(List<Integer> iArray, int start, int end, long[] cntArray) {
		if(start < end ) {
			int pIndex = partition(iArray,start,end, cntArray);
			quickSort(iArray,start, pIndex-1,cntArray);
			quickSort(iArray,pIndex + 1,end, cntArray);
		}
		else
			return iArray;
		return iArray;
	}
	public static void bucketSort(List<Integer> iArray) {
		int key;
		int cmpCount = 0;
		int addCount = 0;
		//Create a list array (2-dimensional array)
		ArrayList<Integer> bucket[] = new ArrayList[100];
		for(int i = 0;i < iArray.size(); i++) {
			key = iArray.get(i);
			if(bucket[key] == null) {		
				bucket[key] = new ArrayList();
			}
			bucket[key].add(iArray.get(i));
			cmpCount++;
		}
		int k = 0;
		for(int i = 0; i < bucket.length; i++) {
			if(bucket[i] != null) {
				for(int j = 0; j < bucket[i].size(); j++){
					iArray.add(k, bucket[i].get(j));
					iArray.remove(k+1);
					k++;
					addCount++;
				}
			}
			cmpCount++;
		}
		System.out.println(cmpCount + " comparaison " + addCount + " elements replaced in the array " );
	}
}
