public class ArrayStack<T> implements Stack<T> {

    private T[] arr;
    private int head = -1;

    public ArrayStack()
    {
        Object[] temp_arr = (T[])(new Object[10]);
        arr = (T[]) temp_arr;
    }

    private void growArray()
    {
        Object[] tarr = new Object[arr.length * 2];
        T[] carr = (T[]) tarr;
        System.arraycopy(arr, 0, carr, 0, arr.length);
        arr = carr;
    }

    public void push(T item)
    {
        if (head == arr.length - 1)
            growArray();
        arr[++head] = item;
    }

    public T peek()
    {
        if (empty())
            return null;
        return arr[head];
    }

    public T pop()
    {
        if (empty())
            return null;

        return arr[head--];
    }

    public boolean empty()
    {
        return head == -1;

    }
}