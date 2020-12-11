package ListForestEdge;

public class FirstReverseTry {
    int[] firstReverseTry(int[] arr) {

        if(arr.length == 0)
            return arr;
        int x = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = x;


        return arr;
    }

}
