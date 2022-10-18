public class Java_Coffee {
    
    private boolean iced;
    
    public boolean isIced() {
        return iced;
    }
    
    public void setIced(boolean iced) {
        this.iced = iced;
    }
}

/**
 * @see 06_ClassProperty.kt
 */
class Barista {
    
    public static void main(String[] args) {
    
        Java_Coffee coffee = new Java_Coffee();
        coffee.setIced(true);
    
        // 상태를 메서드로 표현
        if (coffee.isIced()) System.out.println("아이스 커피");
    }
}