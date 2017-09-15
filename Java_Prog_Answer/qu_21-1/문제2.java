class DBox<L, R> {
    private L left;     // 왼쪽 수납 공간
    private R right;    // 오른쪽 수납 공간

    public void set(L o, R r) {
        left = o;
        right = r;
    } 
    
    @Override
    public String toString() {
        return left + " & " +right;
    }
}

class DDBoxDemo {
    public static void main(String[] args) {
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);

        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);
        
        DBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DBox<>();
        ddbox.set(box1, box2);

        System.out.println(ddbox);
    }
}