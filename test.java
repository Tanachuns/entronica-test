import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {
    public static List<Integer> intersectionArrays(int[] arr1,int[] arr2) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i : arr1) {
           for (int j : arr2) {
                if (i==j) {
                    res.add(i);
                }
           } 
        }
        System.out.println(res.toString());
        return res;
    }

    public static int[] sortNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
               if(arr[i]<arr[j]){
                int _i = arr[i];
                arr[i] = arr[j];
                arr[j] = _i;
               }
           }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static List<List<Integer>>  findPairs(int[] arr,int target) {
        List< List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> _arr = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        for (int i = 0; i < arr.length; i++) {
            if(_arr.size()>0){
                _arr.removeFirst();
            }
            for (int j = 0; j < _arr.size(); j++) {
                if(arr[i]+_arr.get(j)==target){
                    res.add(Arrays.asList(arr[i],_arr.get(j)));
                    _arr.remove(j);
                }
            }
        }
        System.out.println(res.toString());
        return res;
    }

    public static void main(String[] args) {
        System.out.println("intersectionArrays");
        intersectionArrays(new int[]{1, 2, 3}, new int[]{2, 3, 4});
        intersectionArrays(new int[]{1, 2, 3}, new int[]{1, 2, 5}); // [1, 2]
        intersectionArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6}); // []
        intersectionArrays(new int[]{}, new int[]{}); // []

        System.out.println("sortNumbers");
        sortNumbers(new int[]{1, 5, 3, 2, 4}); // [1, 2, 3, 4, 5]
        sortNumbers(new int[]{10, 5, 3, 2, 8, 1}); // [1, 2, 3, 5, 8, 10]
        sortNumbers(new int[]{0, -1, 10, 100, -50}); // [-50, -1, 0, 10, 100]
        sortNumbers(new int[]{5, 5, 4, 3, 2, 1}); // [1, 2, 3, 4, 5, 5]
        sortNumbers(new int[]{5,4,3,2,1}); // []
        System.out.println("findPairs");
        findPairs(new int[]{1, 2, 3, 4, 5},6); // [[1, 5], [2, 4]]
        findPairs(new int[]{1, 2, 3, 4, 5}, 8); // [[3, 5]]
        findPairs(new int[]{1, 1, 2, 2, 3, 3}, 4); // [[1, 3], [1, 3], [2, 2]]
        findPairs(new int[]{-2, -1, 0, 1, 2, 3}, 1); // [[-2, 3], [-1, 2], [0, 1]]
    }

 
};