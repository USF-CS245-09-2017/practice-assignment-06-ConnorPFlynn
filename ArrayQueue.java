public class ArrayQueue<T> implements Queue<T> {

    private T[] arr;
    private int head = 0;
    private int tail = 0;


    public ArrayQueue()
    {
        Object[] tarr = new Object[10];
        arr = (T[]) tarr;
    }

    public void enqueue(T item)
    {
        if (tail == arr.length)
        {
            growArray();
        }
        arr[tail++] = item;
    }

    public T dequeue()
    {
        if (empty())
        {
            return null;
        }
        return arr[head++];
    }

    public boolean empty()
    {
        return head == tail;
    }

    private void growArray()
    {
        Object[] tarr = new Object[arr.length * 2];
        T[] arrT = (T[]) tarr;
        System.arraycopy(arr, 0, arrT, 0, arr.length);
        arr = arrT;
    }
}