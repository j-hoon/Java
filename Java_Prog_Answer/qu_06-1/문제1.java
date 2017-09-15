class SimpleOperation {
    public static void main(String[] args) {
        simpleOpr(7, 3);
    }
    
    public static void simpleOpr(int n1, int n2) {
        System.out.println("덧셈 결과: " + (n1 + n2));
        System.out.println("뺄셈 결과: " + (n1 - n2));
        System.out.println("곱셈 결과: " + (n1 * n2));
        System.out.println("나눗셈의 몫: " + (n1 / n2));
        System.out.println("나눗셈의 나머지: " + (n1 % n2));
    }
}
