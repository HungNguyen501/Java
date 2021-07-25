package Java.template;

class Test {
    public static void main(String[] args) {
        Generic<Integer> array = new Generic<Integer>(new Integer[]{1,2,3,4,5});
        Generic<String> s = new Generic<String>(new String("hello"));
        
        System.out.println(array.getArray()[0] + "     " + s.getE());
    }
}