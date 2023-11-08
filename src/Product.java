public class Product {

    // คอนสตรักเตอร์ของคลาส Product
    // ใช้กำหนดชื่อ ประเภท และราคาสินค้า
    Product(String type, String name, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // กำหนดชื่อสินค้า
    public void setName(String name) {
        this.name = name;
    }
    
    // กำหนดประเภทสินค้า
    public void setType(String type) {
        this.type = type;
    }
    
    // กำหนดราคาสินค้า
    public void setPrice(double price) {
        this.price = price;
    }

    // กำหนดจำนวนของสินค้า (ตอนสั่งซื้อ)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // ส่งค่าเป็นชื่อสินค้า
    public String getName() {
        return name;
    }

    // ส่งค่าเป็นประเภทสินค้า
    public String getType() {
        return type;
    }

    // ส่งค่าเป็นราคาสินค้า
    public double getPrice() {
        return price;
    }

    // ส่งค่าเป็นจำนวนสินค้า (ที่เลือกซื้อ)
    public int getQuantity() {
        return quantity;
    }

    // เช็คความเหมือนกันของข้อมูลสินค้า
    public boolean equals(Product p){
        return name.equals(p.name) && type.equals(p.type) && (price == p.price);
    }    

    private String name, type; 
    private int quantity;
    private double price;
}