import java.util.Arrays;

public class Github {

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclic_sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct_index = arr[i]-1;  
            // Note : if the input contains (0-1) the formula  will be arr[i].  If input contains (1-n) then you can go with this formula arr[i]-1
            if(arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else{
                i++;
            }
        }


    }
    static void swap(int arr[],int first,int second){
        int temp  = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

Output : [1,2,3,4,5]

