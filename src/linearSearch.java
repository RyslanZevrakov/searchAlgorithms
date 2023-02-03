
    import java.util.ArrayList;

    public class linearSearch {

        public static int linearSearch(ArrayList<Integer> arr, int target) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == target) {
                    return i;
                }
            }

            return -1;
        }

    }

