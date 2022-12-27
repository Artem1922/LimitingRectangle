public class Main {
    public static void main(String[] args) {
        LimitingRectangle a = new LimitingRectangle(new int[][]{{1, 2, 6,-2},{4,-3, 0, 5}});
        System.out.println(a.getWidth() + a.getHeight());
        System.out.println(a.getBorders());
    }
}
