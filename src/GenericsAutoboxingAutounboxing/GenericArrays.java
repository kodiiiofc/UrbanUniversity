package GenericsAutoboxingAutounboxing;

public class GenericArrays<T> {
    T[] firstArray;
    T[] secondArray;

    public GenericArrays(T[] firstArray, T[] secondArray) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
    }

    public T[] getFirstArray() {
        return firstArray;
    }

    public T[] getSecondArray() {
        return secondArray;
    }

    public static<T> boolean compare(T[] firstArray, T[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int i = 0; i < firstArray.length - 1; i++) {
            if (!firstArray[i].equals(secondArray[i])) {
                return false;
            }

        }

        return true;
    }

    public static<T> void swapEntryAtIndex(T[] firstArray, T[] secondArray, int index) {
        if (index >= firstArray.length || index >= secondArray.length) {
            throw new IndexOutOfBoundsException("Индекс элемента больше размера массивов");
        }

        var entry = secondArray[index];
        secondArray[index] = firstArray[index];
        firstArray[index] = entry;
        System.out.println("Обмен элементами по индексу " + index + " успешно завершен");
    }


}
