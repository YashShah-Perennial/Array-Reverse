package array;

public class IntegerTypeReverseArray implements ReversalArray<Integer> {
    @Override
    public Integer[] reverse(Integer[] array) {
           int sz = array.length;
            int temp;

            for (int i = 0; i < sz / 2; i++) {
                temp = array[i];
                array[i] = array[sz - i - 1];
                array[sz - i - 1] = temp;
            }
        return array;
    }
    }

