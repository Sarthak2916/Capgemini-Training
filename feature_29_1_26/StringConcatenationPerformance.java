package feature_29_1_26;

public class StringConcatenationPerformance{
    public static void main(String[] args) {
        int iterations = 1000;

        String str = "";
        for (int i = 0; i < iterations; i++) {
            str = str + "a";
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }

        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sf.append("a");
        }

    }
}

