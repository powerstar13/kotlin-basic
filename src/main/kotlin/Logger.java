/**
 * @see 02_function.kt > log main()
 */
public class Logger {
    
    public void log(String level, String message) {
        
        if (level == null || level.length() == 0) {
            level = "INFO";
        }
        System.out.printf("[%s]%s\n", level, message);
    }
    
    public static void main(String[] args) {
    
        Logger logger = new Logger();
        
        logger.log("INFO", /* message = */"인포 로그");
        logger.log(/* level = */"DEBUG", "디버그 로그");
        logger.log("WARN", "워닝 로그");
        
        String level = "ERROR";
        String message = "에러 로그";
        logger.log(level, message);
    }
}
