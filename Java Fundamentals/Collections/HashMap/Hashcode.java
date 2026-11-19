public class Hashcode {
    public static void main(String[] args) {
        String key = "apple";

        int hashCode = key.hashCode();
        System.out.println("Hash Code  for 'apple' :"+hashCode);

        int capacity = 16;
        int index = hashCode & (capacity - 1);
        System.out.println("Bucket index for key 'apple': " + index);
    }
}
