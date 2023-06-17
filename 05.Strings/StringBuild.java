public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello_");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}