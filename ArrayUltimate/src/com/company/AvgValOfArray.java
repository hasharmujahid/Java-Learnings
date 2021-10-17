package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AvgValOfArray {
    //feilds
    Scanner scanner=new Scanner(System.in);
    public double[] array ;
    public double[] array2;
    //methoods
    public double[] inputs(){
        int lengthofarray;
        System.out.println("enter the legth of the array :");
        lengthofarray=scanner.nextInt();
       this.array=new double[lengthofarray];
        for (int i=0;i<lengthofarray;i++){
            System.out.println("enter the value of the index "+ i+" to store ");
            array[i]=scanner.nextDouble();

        }
        System.out.println("array is "+Arrays.toString(array));
        return array;

    }
    public double[] inputsarray2(){
        int lengthofarray;
        System.out.println("enter the length of the array2:");
        lengthofarray=scanner.nextInt();
        this.array2=new double[lengthofarray];
        for (int i=0;i<lengthofarray;i++){
            System.out.println("enter the value of the index "+ i+" to store ");
            array2[i]=scanner.nextDouble();

        }
        System.out.println("array is "+Arrays.toString(array2));
        return array2;

    }

    // method for avg of array

    public double average(){
        double[] inputArray=inputs();
        int count=0;
        double sum=0;
        for (int i=0;i<inputArray.length;i++){
            sum+=inputArray[i];
            count+=1;
        }
        double avg=sum/count;
        System.out.println("Average of the array is "+ avg);
        return avg;

    }
    //method to test for a specifc value in array and count
    public boolean test_for_a_specific_value(){
        System.out.print("enetr the value tou want to check ::::::::  ");
        double val=scanner.nextDouble();
        int count=0;
        for (int i=0; i<array.length;i++){
            if(array[i]==val){
                count++;

            }

        }System.out.println("entered value is detected "+count+" times");

        return false;

    }
    //method to find the index of a value
    public void index_of_the_specific_value(){
        System.out.print("enter thevalue to find which index you want to know -----> ");
        int valuetofind=scanner.nextInt();
        try{
            for (int i=0; i<array.length;i++) {
                if (array[i] == valuetofind) {
                    System.out.println("value is present in array and index of value is " + i);
                }



            }
        }catch (Exception e){
            System.out.println("value is not present in array try again");
        }
    }
    //to remove a specific element from an array
    public void remove_element(){
        double [] my_array = array;
        System.out.println("Original Array : "+ Arrays.toString(array));
        System.out.print("enter the index of the value u want to remove ---->");
        int removeindex=scanner.nextInt();
        for (int i=removeindex;i<my_array.length-1;i++){
            my_array[i] = my_array[i + 1];
        }
        System.out.println("After removing the second element: "+Arrays.toString(my_array));

    }
    //reverse an aray
    public void reversethearray(){
        double[] reverse_array = new double[array.length];
        for (int j=0;j<reverse_array.length;){
            for (int i=array.length-1;i>=0;i--){
                reverse_array[j]=array[i];
                j++;

            }

        }System.out.println("reverse array is "+Arrays.toString(reverse_array));

    }
    //find the duplicate values of an array of integer values
    public void duplicate(){
        double[] values=this.array;
        for (int i=0;i<values.length-1;i++){
            for (int j=i+1;j<values.length;j++){
                if ((values[i]==values[j] )&& (i!=j)){
                    System.out.println("Duplicates "+values[j]);
                }


            }
        }

    }
    //ava program to find the common elements between two arrays
    public void commonvalues(){
        double []array1=this.array;
        System.out.println("enetr the length of 2nd array");
        double[]array2=inputs();
        double[]common=new double[array1.length];
        for (int k=0;k<common.length;k++){
            for (double value : array1) {
                for (double v : array2) {

                    if ((value == v)) {
                        common[k] = value;

                    }

                }
            }
        }System.out.println("common values in the arrays are "+Arrays.toString(common));

    }
    public void duplicatesbetween2arrays(){
        double[]array2=new double[array.length];
        System.out.println("length is same as feild legth");
        for (int j=0;j<array.length;j++){
            System.out.println("enter the value of the index "+ j +" to store ");
            array2[j]=scanner.nextDouble();

        }            System.out.println("2nd array is "+Arrays.toString(array2));

        for (int i=0;i<array.length;i++){
            for (int k=i;k<array2.length;k++){
                if(array[i]==array2[k]){
                    System.out.println("common elements rae "+array[i]);

                }
            }

        }
    }
    //remove duplicate elements from an array
    public void removeduplicatesfromanarray(){
        double[]temp=new double[array.length];
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
            if (array[i]==array[j]) {
                array[j]-=array[i];
            }
            }
        }
        System.out.println("new array is"+Arrays.toString(array));
    }
    //to find the second largest element in an array
    public void secondlargetselementinarray(){
        double[] array1=this.array;
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("Second largest element is "+array1[array1.length-2]);
    }
    //to find the second samllest element in an array
    public void SecondSmallestElement(){
        double[] array1=this.array;
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println("Second smallest element is "+array1[1]);
    }
    //convert an array to ArrayList
    public void convert_an_array_to_ArrayList(){
        double[] arraytoconvert=this.array;
        System.out.println("staring conversion  plz wait.. ");
        ArrayList<Double> List = new ArrayList(Arrays.asList(arraytoconvert));
        System.out.println(List);
        System.out.println("converting back to array...");
        Object[] array1=List.toArray();
        System.out.println(Arrays.toString(array1));

    }
    //Java program to find all pairs of elements in an array whose sum is equal to a specified number
    public void sumpair(){
        System.out.println("enter the nuymber you want to find sumpair of  ---> ");
        double sum=scanner.nextDouble();
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==sum){
                    System.out.println("pair is "+"( "+array[i]+" , "+array[j]+" )");
                }
            }
        } System.out.println("pair not found");
    }
    // Java program to test the equality of two arrays
    public void test_equality(){
        array2=inputsarray2();
        if(array.length==array2.length){
                if (Arrays.equals(this.array, array2)){
                    System.out.println("print both arrays are eqaul ");
                }else System.out.println("test falied");
        }
        else System.out.println("length is not same so equality test failed ");
    }
    //Java program to find the number of even and odd integers in a given array of integers
    public void num_of_even_and_odd_int_in_array(){
        int Even_numbers_count=0;
        int odd_num_count=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                Even_numbers_count+=1;
            }else{
                odd_num_count+=1;
            }

        }
        System.out.println("Total numbers of even int in the array are "+Even_numbers_count);
        System.out.println("Total number of odd Int in the array are  "+odd_num_count);

    }
    // Java program to get the difference between the largest and smallest values in an array of integers
    public void getdiff_between_max_and_min_in_array(){
        Arrays.sort(this.array);
        int max_int= (int) array[array.length-1];
        int min_int=(int) array[0];
        int difference=max_int-min_int;
        System.out.println("difference between maximum and minimum in the array is "+difference);
    }
    //compute the average value of an array of integers except the largest and smallest values
    public void average_without_max_and_min(){
        Arrays.sort(this.array);
        int count=0;
        int sum=0;
        double average=0.0;
            for (int j = 1;j<array[array.length-2];j++){
                sum+=array[j];
                count+=1;
            }
        average=sum/count;
        System.out.println(" the average value of an array of integers except the largest and smallest values is "+average);
    }

    //Java program to remove the duplicate elements of a given array and return the new length of the array.
    public void new_nonrepetive_array(){
        double[] new_non_repetive_array = new double[array.length];
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]!=array[j]) {
//                    array[j]=array[i];
                    new_non_repetive_array[i]+=array[i];
                }
            }

    } System.out.println("new non repetitive array is "+Arrays.toString(new_non_repetive_array));
        System.out.println("length od this array is "+new_non_repetive_array.length);

    }
}




