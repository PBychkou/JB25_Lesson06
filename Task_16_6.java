public class Task_16_6 {
    
    public static void main(String[] args) {
        COLOR color;

        System.out.println("Enum constants:");
        COLOR c[] = COLOR.values();
        for (COLOR clr : c) {
            System.out.println(clr);
        }
        
        System.out.println("-----");
        color = COLOR.valueOf("RED");
        System.out.println(color);
    }

    enum COLOR {
        RED, GREEN, BLUE, WHITE
    }
}