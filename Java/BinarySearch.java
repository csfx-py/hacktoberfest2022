// binary search algorithm
class BinarySearch{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int search = 5;
        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;
        while (low <= high){
            if (array[mid] < search){
                low = mid + 1;
            } else if (array[mid] == search){
                System.out.println("Found at index " + mid);
                break;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high){
            System.out.println("Not found");
        }
    }
}