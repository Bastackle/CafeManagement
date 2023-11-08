import java.util.ArrayList;

public class Cart {

    // เพิ่มสินค้าในตะกร้า
    public void addCart(Product p, int quantity) {
        boolean productExists = false; // ตัวแปรสำหรับตรวจสอบว่าสินค้ามีอยู่ในตะกร้าหรือไม่
        
        for (Product product : cartList) { 
            // ตรวจสอบชื่อสินค้าว่ามีอยู่แล้วหรือไม่
            if (p.getName().equals(product.getName())) {
                // ถ้ามีอยู่แล้ว
                int currentQuantity = product.getQuantity(); // จำนวนสินค้าที่มีอยู่
                int updatedQuantity = currentQuantity + quantity; // คำนวณจำนวนสินค้าใหม่
                product.setQuantity(updatedQuantity); // อัปเดตจำนวนสินค้าในตะกร้า
                productExists = true;
                break; // จบการทำงานเมื่อพบสินค้าแล้ว
            }
        }
        if (!productExists) { // ถ้าสินค้ายังไม่มีในตะกร้า
            p.setQuantity(quantity); // เซ็ตค่าจำนวนสินค้า
            cartList.add(p); // เพิ่มสินค้าใหม่เข้าไปในตะกร้า
        }
    }

    // ลบสินค้าที่ระบุจากตะกร้า
    public void remove(int row) {
        cartList.remove(row);
    }

    // คำนวณรวมราคาสินค้าในตะกร้า
    public double sumPrice() {
        total = 0;
        for (Product p : cartList) {
            total += (p.getPrice() * p.getQuantity());
        }
        return total;
    }

    // รับเงินจากลูกค้า และคิดเงินทอน
    public void pay(double cash) {
        change = cash - total;
    }

    // ส่งค่าเป็นเงินทอน
    public double getChange() {
        return change;
    }

    // คำนวณจำนวนแบงค์และสตางค์ที่ต้องทอนเป็นอาเรย์ resultChange
    public int[] changeMoney() {
        int count;
        double money = change;
        
        // กำหนดค่าเริ่มต้นให้กับอาเรย์ resultChange เป็น 0 ทั้งหมด
        for (count = 0; count < resultChange.length; count++) {
            resultChange[count] = 0;
        }

        // คำนวณเงินบาทที่ต้องทอน
        for (count = 0; count < moneyBaht.length; count++) {
            while (money >= moneyBaht[count]) {
                money -= moneyBaht[count];
                resultChange[count]++;
            }
        }
        
        // คำนวณเงินสตางค์ที่ต้องทอน
        if (money > 0 && money < 1) {
            for (count = moneyBaht.length; count < resultChange.length; count++) {
                while (money >= moneySatang[count - moneyBaht.length]) {
                    money -= moneySatang[count - moneyBaht.length];
                    resultChange[count]++;
                    System.out.println(change);
                }
            }
        }
        
        // ทั้ง 2 การคำนวณทั้งเงินบาทและสตางค์หลักการทำงานคือ
        // เริ่มจากการเลือกแบงค์หรือเหรียญที่มีค่ามากที่สุดให้เท่าที่เป็นไปได้แล้วค่อยลดจำนวนเงินที่ต้องทอนลงเรื่อยๆ 
        // จนกว่าจะไม่สามารถเลือกแบงค์หรือเหรียญใดเพิ่มเติมได้อีก
        
        return resultChange; // ส่งคืนค่าของ array ที่เก็บจำนวนเหรียญและแบงค์ที่ต้องใช้ในการทอน
    }

    // ส่งค่าเป็นขนาดตะกร้าสินค้า (จำนวนสินค้าในตะกร้า) ปัจจุบัน
    public int size() {
        return cartList.size();
    }

    // ลบสินค้าทั้งหมดออกจากตะกร้า
    public void clear() {
        cartList.clear();
    }
    
    // รายการสินค้าในตะกร้า
    private ArrayList<Product> cartList = new ArrayList<Product>();
    
    // อาเรย์เงินแบงค์และสตางค์
    private int[] moneyBaht = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
    private double[] moneySatang = {0.5, 0.25};
    
    // อาเรย์เก็บจำนวนแบงค์และสตางค์ที่ใช้ในการทอนเงิน
    private int[] resultChange = new int[11];
    
    // ยอดรวมราคาสินค้าในตะกร้า และเงินทอน
    private double total, change;
}