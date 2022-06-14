package array;

public class CharacterReverseArray implements ReversalArray<Character>
{
    @Override
    public Character[] reverse(Character[] array) {
        int sz = array.length;
        Character temp;
        for (int i = 0; i < sz / 2; i++) {
            temp = array[i];
            array[i] = array[sz - i - 1];
            array[sz - i - 1] =  temp;
        }
        return array;
    }
}
