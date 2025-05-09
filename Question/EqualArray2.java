package Question;

public class EqualArray2 {
    

        public static void main(String[] args) {
            int[] n1 = {1, 2, 3, 4};
            int[] n2 = {1, 2, 3, 4};
            
            Boolean same = true;
            if (n1.length < n2.length || n1.length > n2.length) {
                same = false;
            } else {
                for (int i = 0; i < n1.length; i++) {
                    if (n1[i] == n2[i]) {
                        same = true;
                    } else {
                        same = false;
                        break;
                    }
                }
            }
            if (same) {
                System.out.println("Arrays is same");
            } else {
                System.out.println("Array is different");
            }
    
        }
    }

