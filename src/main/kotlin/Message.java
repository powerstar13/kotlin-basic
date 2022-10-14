/**
 * @see 02_function.kt > greeting main()
 */
public class Message {
    
    public void greeting(String message) {
        // 자바에서는 디폴트 파라미터가 없기 때문에 코틀린에서의 디폴트 파라미터 구현과 유사하다고 보면 된다.
        if (message == null || message.length() == 0) {
            System.out.println("안녕하세요!!");
            return;
        }
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        
        new Message().greeting(null);
        
        new Message().greeting("Hello, World");
    }
}
