public class checkData {

    // ตรวจสอบว่าข้อความเป็นตัวเลขล้วนหรือไม่
    public static int checkString(String message) {
        try {
            double checkMessage = Double.parseDouble(message);
            return 0; // คืนค่า 0 ถ้าข้อความเป็นตัวเลข
        } catch (NumberFormatException e1) {
            return 1; // คืนค่า 1 ถ้าข้อความไม่ใช่ตัวเลขล้วน
        }
    }
    
    // ตรวจสอบว่าข้อความเป็นว่าตัวเลขและมีค่ามากกว่า 0
    public static int checkDouble(String message) {
        try {
            double checkMessage = Double.parseDouble(message);
            if (checkMessage <= 0) {
                return -1; // คืนค่า -1 ถ้าข้อความเป็นตัวเลขทศนิยมและมีค่าน้อยกว่าหรือเท่ากับ 0
            }
            return 1; // คืนค่า 1 ถ้าข้อความเป็นตัวเลขและมีค่ามากกว่า 0
        } catch (NumberFormatException e1) {
            return 0; // คืนค่า 0 ถ้าข้อความไม่ใช่ตัวเลข
        }
    }

    // ตรวจสอบว่าข้อความเป็นว่าตัวเลขจำนวนเต็มและมีค่ามากกว่า 0
    public static int checkInteger(String message) {
        try {
            int checkMessage = Integer.parseInt(message);
            if (checkMessage <= 0) {
                return -1; // คืนค่า -1 ถ้าข้อความเป็นตัวเลขจำนวนเต็มและมีค่าน้อยกว่าหรือเท่ากับ 0
            }
            return 1; // คืนค่า 1 ถ้าข้อความเป็นตัวเลขจำนวนเต็มและมีค่ามากกว่า 0
        } catch (NumberFormatException e1) {
            return 0; // คืนค่า 0 ถ้าข้อความไม่ใช่ตัวเลขจำนวนเต็ม
        }
    }
}