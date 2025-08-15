public class ReverseOnlyString {
    public static void main(String[] args) {
        String str = "he$lo@wel?ome";
        int start = 0;
        int end = str.length()-1;
        char[] arr = str.toCharArray();
        while(start <= end) {
            if (!(arr[start] >= 'a' && arr[start] <= 'z')) {
                start++;
            }
            if (!(arr[end] >= 'a' && arr[end] <= 'z')) {
                end--;
            }
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(new String(arr));
    }
}
