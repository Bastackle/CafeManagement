import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class PlaceOrderJFrame extends javax.swing.JFrame {

    public PlaceOrderJFrame(ArrayList<Product> productList, String fileName, int queue) {
        initComponents();
        for (Product p : productList) {
            this.productList.add(p);
        }
        this.fileName = fileName;
        this.queue = queue;
        showProducts();
        showCart();
        showCancelText();
    }

    private void showProducts() {
        productTableModel = new DefaultTableModel();
        String[] columnNames = {"Type", "Name", "Price (Baht)"};
        productTable.setModel(productTableModel);
        //กำหนดชื่อชอง column แต่ละ column
        productTableModel.setColumnIdentifiers(columnNames);

        filterProductsByType("All");
    }

    private void showCart() {
        cartTableModel = new DefaultTableModel();
        String[] columnNames = {"Quality", "Name", "Price (Baht)", "Total (Bath)"};
        cartTable.setModel(cartTableModel);
        //กำหนดชื่อชอง column แต่ละ column
        cartTableModel.setColumnIdentifiers(columnNames);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddButton = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        DeleteButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        qualityField = new javax.swing.JTextField();
        AddCart = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        PayButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        receiptArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        ClearCart = new javax.swing.JButton();
        textClear = new javax.swing.JLabel();

        AddButton.setBackground(new java.awt.Color(51, 153, 255));
        AddButton.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton1.setBackground(new java.awt.Color(255, 0, 0));
        DeleteButton1.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        DeleteButton1.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton1.setText("DELETE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CoffeeShop");
        setResizable(false);

        productTable = new javax.swing.JTable()
        {
            public boolean isCellEditable(int row, int column){
                for(int i = 0; i < productTable.getRowCount(); i++){
                    if(row == i){
                        return false;
                    }
                }
                return true;
            }
        };
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        jLabel2.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel2.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel4.setText("Price :");

        jComboBox1.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Coffee", "Soda", "Tea" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(51, 153, 255));
        backButton.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jLabel1.setText("Select Product's Type:");

        jLabel5.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel5.setText("Type :");

        jLabel6.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel6.setText("Quantity :");

        qualityField.setFont(new java.awt.Font("Krungthep", 0, 16)); // NOI18N
        qualityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualityFieldActionPerformed(evt);
            }
        });

        AddCart.setBackground(new java.awt.Color(51, 153, 255));
        AddCart.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        AddCart.setForeground(new java.awt.Color(255, 255, 255));
        AddCart.setText("ADD to Cart");
        AddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCartActionPerformed(evt);
            }
        });

        typeLabel.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        typeLabel.setText("None");

        priceLabel.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        priceLabel.setText("0");

        nameLabel.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        nameLabel.setText("None");

        cartTable = new javax.swing.JTable()
        {
            public boolean isCellEditable(int row, int column){
                for(int i = 0; i < productTable.getRowCount(); i++){
                    if(row == i){
                        return false;
                    }
                }
                return true;
            }
        };
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cartTable);

        jLabel3.setFont(new java.awt.Font("Krungthep", 0, 24)); // NOI18N
        jLabel3.setText("Total:");

        totalLabel.setFont(new java.awt.Font("Krungthep", 0, 24)); // NOI18N
        totalLabel.setText("0.0");

        jLabel7.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel7.setText(" Cart List:");

        DeleteButton.setBackground(new java.awt.Color(255, 0, 0));
        DeleteButton.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        PayButton.setBackground(new java.awt.Color(0, 154, 0));
        PayButton.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        PayButton.setForeground(new java.awt.Color(255, 255, 255));
        PayButton.setText("PAY");
        PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayButtonActionPerformed(evt);
            }
        });

        receiptArea.setColumns(20);
        receiptArea.setFont(new java.awt.Font("YuMincho +36p Kana", 0, 16)); // NOI18N
        receiptArea.setRows(5);
        jScrollPane3.setViewportView(receiptArea);

        jLabel8.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel8.setText("Sample Receipt :");

        ClearCart.setBackground(java.awt.Color.orange);
        ClearCart.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        ClearCart.setForeground(new java.awt.Color(255, 255, 255));
        ClearCart.setText("CLEAR");
        ClearCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearCartActionPerformed(evt);
            }
        });

        textClear.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        textClear.setForeground(new java.awt.Color(255, 0, 0));
        textClear.setText("*** Rigth Click to Clear the Selection ***");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(qualityField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ClearCart, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(PayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameLabel))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(typeLabel))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(priceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(qualityField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DeleteButton)
                        .addComponent(ClearCart)
                        .addComponent(PayButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(totalLabel)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

    }//GEN-LAST:event_AddButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectedType = jComboBox1.getSelectedItem().toString();
        filterProductsByType(selectedType);

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if (cartList.size() > 0) {
            // ตรวจสอบว่ามีสินค้าในตะกร้าหรือไม่
            
            int ans = JOptionPane.showConfirmDialog(
                    this,
                    "Product(s) is/are still in the cart, Do you want to return to the main page?",
                    "Alert",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);
            
            if (ans == JOptionPane.YES_OPTION) {
                // ถ้าผู้ใช้เลือก "ใช่" ให้ทำการกลับไปหน้าหลัก
                MainJFrame mainPage = new MainJFrame(productList, fileName,queue);
                this.dispose();
                mainPage.setVisible(true);

            } else if (ans == JOptionPane.NO_OPTION) {
                // ถ้าผู้ใช้เลือก "ไม่" ไม่ทำอะไร
                return;
            }
            
        } else {
            // ถ้าตะกร้าว่าง
            MainJFrame mainPage = new MainJFrame(productList, fileName, queue);
            this.dispose();
            mainPage.setVisible(true);
        }

    }//GEN-LAST:event_backButtonActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        // เป็น function ที่ใช้ดึงข้อมูลสินค้าที่เลือกให้แสดงผ่าน Label โดยการคลิกที่เมาส์
        
        // เช็คว่าถ้าปุ่มที่ถูกคลิกคือปุ่มซ้าย (Button1) ให้ทำงานดังนี้ 
        if (evt.getButton() == MouseEvent.BUTTON1 || evt.getClickCount() == 2) {
            clearCartSelection();
            
            int[] selectedRows = productTable.getSelectedRows(); // รายการแถวสินค้าที่ถูกเลือก

            if (selectedRows.length == 0) {
                sizeProduct = 0; // // ถ้าไม่ถูกเลือกจะเก็บค่าเป็น 0
                
            } else if (selectedRows.length > 1) {
                sizeProduct = selectedRows.length; //ถ้ามีหลายแถวที่ถูกเลือกจะเก็บค่าตามจำนวนที่ถูกเลือก
                
            } else {

                int selectedRow = selectedRows[0]; // ดึงหมายเลขแถวที่ถูกเลือกมาเก็บไว้ในตัวแปร
                
                // แสดงข้อมูลของสินค้าที่ถูกเลือก
                nameLabel.setText(productList.get(selectedRow).getName());
                typeLabel.setText(productList.get(selectedRow).getType());
                priceLabel.setText(String.valueOf(df.format(productList.get(selectedRow).getPrice())));

                productRow = selectedRow; // บันทึกแถวที่ถูกเลือก
                sizeProduct = 1; //เก็บค่าจำนวนแถวที่ถูกเลือกให้เป็น 1
                
            }
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {
            // ถ้าปุ่มที่ถูกคลิกเป็นปุ่มขวา (Button3) จะยกเลิกการเลือกทั้งหมดในตาราง
            clearProductSelection();
        }
        
        showCancelText();
    }//GEN-LAST:event_productTableMouseClicked

    private void qualityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualityFieldActionPerformed

    }//GEN-LAST:event_qualityFieldActionPerformed

    private void AddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCartActionPerformed
        // TODO add your handling code here:
        if (sizeProduct > 1) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Please select only one product",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );

        } else if (sizeProduct == 1) {
            String quantityText = qualityField.getText(); // รับข้อมูลจำนวนสินค้าจาก TextField

            if (quantityText.equals("")) {
                JOptionPane.showMessageDialog(
                        this, 
                        "Please enter a quantity",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
                
            } else {
                // ตรวจสอบความถูกต้องของราคาสินค้า
                int quantityValidity = checkData.checkInteger(quantityText);
                
                // ถ้าจำนวนสินค้าน้อยกว่าหรือเท่ากับ 0 หรือไม่ใช่ตัวเลขจะขึ้นข้อความแจ้งเตือน
                if (quantityValidity == 0) {
                    JOptionPane.showMessageDialog(
                            this, 
                            "Invalid Quantity!! Quantity should be a Integer.",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE
                    );
                    return;
                    
                } else if (quantityValidity == -1) {
                    JOptionPane.showMessageDialog(
                            this, 
                            "Quantity should not be less than or equal 0.",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }
            }
            
            // ถ้าจำนวนสินค้าถูกต้องทำงานดังนี้
            int quantity = Integer.parseInt(quantityText); // แปลงข้อมูลจำนวนสินค้าเป็นตัวเลข
            
            Product selectedProduct = productList.get(productRow); // รับสินค้าที่ผู้ใช้เลือกจากตารางสินค้า

            cartList.addCart(selectedProduct, quantity);

            // ตรวจสอบว่าสินค้าที่เพิ่มอยู่ในตะกร้าแล้วหรือไม่
            boolean productExists = false;
            
            for (int i = 0; i < cartTableModel.getRowCount(); i++) {
                if (selectedProduct.getName().equals(cartTableModel.getValueAt(i, 1).toString())) {
                    // อัปเดตจำนวนสินค้าแทนที่จะเพิ่มแถวใหม่
                    
                    int currentQuantity = Integer.parseInt(cartTableModel.getValueAt(i, 0).toString());
                    
                    int newQuantity = currentQuantity + quantity;
                    
                    double newTotal = newQuantity * Double.parseDouble(cartTable.getValueAt(i, 2).toString());

                    cartTableModel.setValueAt(newQuantity, i, 0);
                    cartTableModel.setValueAt(String.valueOf(df.format(newTotal)), i, 3);
                    
                    productExists = true;
                    break;
                }
            }

            // ถ้าสินค้ายังไม่มีในตะกร้า ให้เพิ่มแถวใหม่
            if (productExists == false) {
                double totalPrice = selectedProduct.getPrice() * quantity;
                
                // เพิ่มข้อมูลลงในตารางตะกร้า
                cartTableModel.addRow(new Object[]{
                    quantity,
                    selectedProduct.getName(),
                    String.valueOf(df.format(selectedProduct.getPrice())),
                    String.valueOf(df.format(totalPrice))
                });
                
            }

            clearField();
            
            clearProductSelection();

            totalLabel.setText(String.valueOf(df.format(cartList.sumPrice())));

        } else {
            JOptionPane.showMessageDialog(
                    this, 
                    "Please select only one product",   
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
        }

    }//GEN-LAST:event_AddCartActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        if (cartList.size() == 0) {
            JOptionPane.showMessageDialog(this, "None product in cart");
            return;
        }
        
        if (sizeCart > 1) {
            JOptionPane.showMessageDialog(this, "Please select only one product");
            
        } else if (sizeCart == 1) {
            
            int ans = JOptionPane.showConfirmDialog(
                    this,
                    "Do you want to delete this product?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );

            if (ans == JOptionPane.YES_OPTION) {
                // ลบแถวที่ถูกเลือกออกจากตาราง
                cartTableModel.removeRow(cartRow);
                // ลบสินค้าออกจาก ArrayList ด้วยตำแหน่ง selectedRow
                cartList.remove(cartRow);
                totalLabel.setText(String.valueOf(cartList.sumPrice()));
                clearCartSelection();
                showCancelText();
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Please select a product");
        }

    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayButtonActionPerformed
        // TODO add your handling code here:
        // ตรวจสอบว่าตระกร้าสินค้ามีรายการสินค้าอยู่หรือไม่
        
        if (cartList.sumPrice() <= 0) {
            // ถ้าไม่มี แสดงข้อความแจ้งเตือนว่าไม่มีสินค้าในตะกร้า
            JOptionPane.showMessageDialog(this, "The cart needs to have at least 1 product.");
            return; // จบการทำงาน
        }
        
        // ถ้ามี
        String showTotal = "Total = " + String.valueOf(df.format(cartList.sumPrice()));
        double cashInput = 0;
        
        do {
            // แสดงกล่องข้อความเพื่อรับจำนวนเงินของลูกค้า
            String cashInputSTR = JOptionPane.showInputDialog(
                    this,
                    showTotal,
                    "Enter the cash",
                    JOptionPane.PLAIN_MESSAGE
            );
            
            if (cashInputSTR != null) {
                // ตรวจสอบความถูกต้องของข้อมูลที่ป้อนเข้ามา
                int cashValidity = checkData.checkDouble(cashInputSTR);
                
                switch (cashValidity) {
                    case 0:
                        JOptionPane.showMessageDialog(
                                this, 
                                "Invalid Cash!! Cash should be a Numeric.",
                                "Warning",
                                JOptionPane.WARNING_MESSAGE);
                        break;
                    case -1:
                        JOptionPane.showMessageDialog(
                                this, 
                                "Cash must not be less than or equal 0",    
                                "Warning",
                                JOptionPane.WARNING_MESSAGE
                        );
                        break;
                    default:
                        cashInput = Double.parseDouble(cashInputSTR);
                        if (cashInput < cartList.sumPrice()) {
                            JOptionPane.showMessageDialog(
                                    this, 
                                    "Cash must not be less than the price.",
                                    "Warning",
                                    JOptionPane.WARNING_MESSAGE
                            );
                            
                        } else {
                            // ทำการชำระเงิน
                            cartList.pay(cashInput);
                            JOptionPane.showMessageDialog(this, "Payment Successful");
                            
                            // เพิ่มคิวจากเดิมไป 1
                            queue++;
                            
                            // คิดเงินทอน
                            resultChange = cartList.changeMoney();
                            
                            // แสดงใบเสร็จชำระเงิน
                            printReceipt(cashInput);
                            
                            // ล้างสินค้าในตะกร้า
                            clearCart();
                            
                            // ล้างการกดเลือกสินค้าในตาราง
                            clearProductSelection();
                            clearCartSelection();
                            showCancelText();
                            
                            JOptionPane.showMessageDialog(
                                    this, 
                                    getChange(), 
                                    "Change Details",
                                    JOptionPane.PLAIN_MESSAGE
                            );
                        }   break;
                }
                
            } else if (cashInputSTR == null) {
                break; // ออกจากลูปถ้าผู้ใช้ยกเลิกการป้อนข้อมูลหรือปิดกล่องข้อความ
            }
            
        } while (cashInput < cartList.sumPrice()); // ลูปไปเรื่อยๆ ถ้าจำนวนเงินที่กรอกมาต่ำกว่าราคราสินค้า หรือค่าที่กรอกมาผิด
    }//GEN-LAST:event_PayButtonActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        // TODO add your handling code here:
        
        // เช็คว่าถ้าปุ่มที่ถูกคลิกคือปุ่มซ้าย (Button1) ให้ทำงานดังนี้ 
        if (evt.getButton() == MouseEvent.BUTTON1 || evt.getClickCount() == 2) {
            sizeProduct = 0; // รีเซ็ตขนาดของรายการสินค้าและแถวที่ถูกเลือก
            productRow = -1;
            
            // ยกเลิกการเลือกสินค้าในตารางสินค้า
            clearProductSelection();
            
            // รับเลขแถวที่ถูกเลือกในตารางตระกร้าสินค้า
            int[] selectedRows = cartTable.getSelectedRows();

            // ตรวจสอบจำนวนแถวที่ถูกเลือก
            if (selectedRows.length == 0) {
                sizeCart = 0;
            } else if (selectedRows.length > 1) {
                sizeCart = selectedRows.length;
            } else {
                // ในกรณีที่เลือกแถวเดียว
                int selectedRow = selectedRows[0];
                cartRow = selectedRow; // เซ็ตหมายเลขแถวที่ถูกเลือก
                sizeCart = 1; // เซ็ตจำนวนแถวที่เลือกเป็น 1
            }
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {
            // ถ้าปุ่มที่ถูกคลิกเป็นปุ่มขวา (Button3) จะยกเลิกการเลือกทั้งหมดในตาราง
            clearCartSelection();
        }
        
        showCancelText();
    }//GEN-LAST:event_cartTableMouseClicked

    private void ClearCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCartActionPerformed
        // TODO add your handling code here:
        
        // ตรวจสอบว่าตระกร้าสินค้าว่างอยู่แล้วหรือไม่
        if (cartList.size() <= 0) {
            // แสดงข้อความแจ้งเตือนถ้าตระกร้าสินค้าว่างอยู่แล้ว
            JOptionPane.showMessageDialog(this, "Cart is already empty");
            return; // จบการทำงาน
        }
        
        // แสดงคำถามยืนยันล้างตระกร้าสินค้า
        int accept = JOptionPane.showConfirmDialog(
                this,
                "Do you want to clear product in cart?",
                "Alert",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        if (accept == JOptionPane.YES_OPTION) {
            // ถ้ายืนยันการล้างตะกร้าสินค้า ทำการล้างตะกร้าสินค้า
            clearCart();
            clearProductSelection();
            showCancelText();
            
            // แสดงข้อความแจ้งเตือนว่าล้างตระกร้าสินค้าสำเร็จ
            JOptionPane.showMessageDialog(this, "Clear Cart Success");
            
        } else if (accept == JOptionPane.NO_OPTION) {
            // ถ้าไม่ จบการทำงาน
            return;
        }
    }//GEN-LAST:event_ClearCartActionPerformed

    public void clearCart() {
        // ล้างรายการสินค้าในตะกร้า (cartTableModel) โดยการกำหนดจำนวนแถวในตารางให้เป็น 0
        cartTableModel.setRowCount(0); 
        
        cartList.clear(); // ล้างข้อมูลในตะกร้า (cartList)
        
        // อัปเดตราคารวมและแสดงบน Label
        totalLabel.setText(String.valueOf(df.format(cartList.sumPrice())));
    }

    public void clearField() {
        // ล้างข้อมูลในฟิลด์ข้อมูลสินค้าทั้งหมด
        nameLabel.setText("None");
        typeLabel.setText("None");
        priceLabel.setText("0.00");
        qualityField.setText("");
    }

    public void clearProductSelection() {
        productTable.clearSelection(); // ล้างการเลือกในตารางสินค้า
        sizeProduct = 0; // รีเซ็ตค่าขนาดของรายการที่ถูกเลือกเป็น 0
        productRow = -1; // รีเซ็ตตำแหน่งของรายการที่ถูกเลือกเป็น -1
        clearField();
    }

    public void clearCartSelection() {
        cartTable.clearSelection(); // ล้างการเลือกในตารางรถเข็น
        sizeCart = 0; // รีเซ็ตค่าขนาดของรายการที่ถูกเลือกเป็น 0
        cartRow = -1; // รีเซ็ตตำแหน่งของรายการที่ถูกเลือกเป็น -1
    }
    
    private void filterProductsByType(String selectedType) {
        // ฟังก์ชันสำหรับกรองสินค้าให้แสดงเฉพาะสินค้าตามประเภทที่เลือก

        productTableModel.setRowCount(0); // ล้างตารางเก่า

        if ("All".equals(selectedType)) {
            // ถ้าเลือกทั้งหมดจะ ดึงข้อมูลสินค้าทุกประเภทมาแสดง
            for (Product p : productList) {
                productTableModel.addRow(new Object[]{p.getType(), p.getName(), String.valueOf(df.format(p.getPrice()))});
            }
            
        } else {
            // ถ้าเลือกประเภทใดประเภทหนึ่ง
            // จะกรองและดึงข้อมูลและแสดงสินค้าตามประเภทที่เลือก
            for (Product p : productList) {
                if (p.getType().equals(selectedType)) {
                    productTableModel.addRow(new Object[]{p.getType(), p.getName(), String.valueOf(df.format(p.getPrice()))});
                }
            }
        }

    }

    public String getChange() {
        // สร้างข้อความที่บอกถึงจำนวนเงินทอน
        String changeText = "Change = " + String.valueOf(df.format(cartList.getChange()));
        
        // ตรวจสอบว่าไม่มีเงินทอน (ถ้าเท่ากับ 0 หรือติดลบ)
        if(cartList.getChange() == 0){
            return changeText; // รีเทิร์นข้อความ "Change = 0.00"
        }
        
        // ใส่จำนวนเงินที่ต้องทอนในหน่วยบาท
        changeText += "\n\n";
        for (int i = 0; i < moneyBaht.length; i++) {
            if (resultChange[i] > 0) {
                changeText += String.valueOf(moneyBaht[i]) + " THB : " + resultChange[i] + "\n";

            }
        }
        
        // ใส่จำนวนเงินที่ต้องทอนในหน่วยสตางค์
        for (int i = 0; i < moneySatang.length; i++) {
            if (resultChange[i + moneyBaht.length] > 0) {
                changeText += String.valueOf(df.format(moneySatang[i])) + " THB : " + resultChange[i + moneyBaht.length] + "\n";
            }
        }
        
        return changeText; // รีเทิร์นข้อความที่รวมถึงรายละเอียดของเงินทอน
    }

    private void printReceipt(double cash) {
        String text;
        
        // ตั้งค่า TimeZone ตามที่กำหนด
        TimeZone.setDefault(timezone);
        
        // สร้างวันที่ปัจจุบันและรูปแบบเวลาตามที่กำหนด
        Date currentDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formatDate = format.format(currentDate);
        
        // ล้างข้อมูลในตัวแสดงข้อความ receiptArea
        receiptArea.removeAll();
        
        // แสดงหัวเอกสารใบเสร็จ
        receiptArea.setText("*************************************************************************\n");
        receiptArea.setText(receiptArea.getText() + "                                            RECEIPT                                            \n");
        receiptArea.setText(receiptArea.getText() + "*************************************************************************\n\n");

        // วนลูปผ่านแถวในตารางรายการสินค้าในตระกร้า
        for (int i = 0; i < cartTable.getRowCount(); i++) {
            String quantity = cartTable.getValueAt(i, 0).toString();
            String name = cartTable.getValueAt(i, 1).toString();
            String priceAt = cartTable.getValueAt(i, 2).toString();
            String productTotal = cartTable.getValueAt(i, 3).toString();
            String detail = "@" + priceAt + "\t" + quantity + "\t" + productTotal;
            
            // แสดงรายละเอียดสินค้าในใบเสร็จ
            receiptArea.setText(receiptArea.getText() + "        " + name + "\n");
            receiptArea.setText(receiptArea.getText() + "\t" + detail + "\n");
        }

        receiptArea.setText(receiptArea.getText() + "\n" + "==============================================\n");

        // แสดงราคารวม
        text = String.valueOf(df.format(cartList.sumPrice()));
        receiptArea.setText(receiptArea.getText() + "\n" + "Total = " + text + " THB\n");

        // แสดงจำนวนเงินที่ลูกค้าจ่าย
        text = String.valueOf(df.format(cash));
        receiptArea.setText(receiptArea.getText() + "Cash = " + text + " THB\n");

        // แสดงจำนวนเงินทอน
        text = String.valueOf(df.format(cartList.getChange()));
        receiptArea.setText(receiptArea.getText() + "Change = " + text + " THB\n");

        receiptArea.setText(receiptArea.getText() + "\n" + "==============================================\n");

        // แสดงวันที่และเวลาที่สั่งซื้อสินค้า
        receiptArea.setText(receiptArea.getText() + "\n" + formatDate + "\n");
        
        // แสดงคิวที่ลูกค้าได้รับ
        text = "Your Queue is : " + String.valueOf(queue);
        receiptArea.setText(receiptArea.getText() + text + "\n");
        
        receiptArea.setText(receiptArea.getText() + "\n\n" + "                   Thank You for supporting my small Business                    \n");
    }

    private void showCancelText() {
        // ตรวจสอบจำนวนรายการที่เลือกทั้งรายการสินค้าในระบบ และในตะกร้า
        if (sizeProduct == 0 && sizeCart == 0) {
            // ถ้าทั้ง 2 มีค่าเป็น 0 คือไม่มีการเลือก
            textClear.setText(""); // กำหนดข้อความใน textClear ให้เป็นสตริงว่าง
            
        } else if (sizeProduct > 0 || sizeCart > 0) { 
            // ถ้ามีการเลือกในตารางใดตารางหนึ่ง
            // แสดงข้อความที่กำหนด
            textClear.setText("*** Rigth Click to Clear the Selection ***");
        }
    }

    DecimalFormat df = new DecimalFormat("0.00"); //เรียกใช้คลาส DecimalFormat 
    // สร้าง DecimalFormat สำหรับรูปแบบเลขทศนิยม
    
    TimeZone timezone = TimeZone.getTimeZone("Asia/Bangkok"); // ตั้งค่าโซนเวลาเป็น Asia/Bangkok

    // อาเรย์ลิสต์สำหรับเก็บข้อมูลสินค้าแต่ละรายการ 
    private ArrayList<Product> productList = new ArrayList<>();

    // อาเรย์และตัวแปรที่ใช้สำหรับการจ่ายเงินและทอนเงิน
    private int[] moneyBaht = {1000, 500, 100, 50, 20, 10, 5, 2, 1}; // เงินบาท
    private double[] moneySatang = {0.5, 0.25}; // เงินสตางค์
    private int[] resultChange = new int[11]; // อาเรย์สำหรับเก็บผลลัพธ์การทอนเงิน
    
    // สร้าง object ของคลาส Cart สำหรับการจัดการตระกร้าสินค้า
    private Cart cartList = new Cart();
    
    // ตารางแสดงข้อมูลสินค้า
    private DefaultTableModel productTableModel; // ตารางสำหรับแสดงรายการสินค้า
    private DefaultTableModel cartTableModel; // ตารางสำหรับแสดงรายการในตระกร้า

    // เก็บชื่อไฟล์
    String fileName = "";

    int productRow, sizeProduct, sizeCart, cartRow, queue; // ตัวแปรที่ใช้เก็บข้อมูลเกี่ยวกับการเลือกแถวและคิว

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddCart;
    private javax.swing.JButton ClearCart;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton DeleteButton1;
    private javax.swing.JButton PayButton;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable cartTable;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField qualityField;
    private javax.swing.JTextArea receiptArea;
    private javax.swing.JLabel textClear;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}