import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;

public final class ManagementJFrame extends javax.swing.JFrame {

    public ManagementJFrame(ArrayList<Product> productList, String fileName, int queue) {
        initComponents();
        backupList = new ArrayList<>();
        
        for (Product p : productList) {
            this.productList.add(p);
            backupList.add(p);
        }
        
        this.fileName = fileName;
        this.queue = queue;
        
        showProducts();
        status();
        textClear.setText("");
    }

    private void showProducts() {
        productTableModel = new DefaultTableModel();
        String[] columnNames = {"Type", "Name", "Price (Baht)"};
        productTable.setModel(productTableModel);
        //กำหนดชื่อชอง column แต่ละ column
        productTableModel.setColumnIdentifiers(columnNames);

        // ทำการแสดงข้อมูลสินค้าทุกประเภทที่ตาราง
        filterProductsByType("All");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddButton = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        AddButton1 = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        TypeBox = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        textClear = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        AddButton.setBackground(new java.awt.Color(51, 153, 255));
        AddButton.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
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

        jTextField1.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel3.setText("Type :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jRadioButton1.setText("Coffee");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jRadioButton2.setText("Tea");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jRadioButton3.setText("Soda");

        jLabel4.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        jLabel4.setText("Price :");

        jTextField2.setFont(new java.awt.Font("Krungthep", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        AddButton1.setBackground(new java.awt.Color(0, 154, 0));
        AddButton1.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        AddButton1.setForeground(new java.awt.Color(255, 255, 255));
        AddButton1.setText("ADD");
        AddButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton1ActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(255, 0, 0));
        DeleteButton.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        EditButton.setBackground(java.awt.Color.orange);
        EditButton.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        EditButton.setForeground(new java.awt.Color(255, 255, 255));
        EditButton.setText("EDIT");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        TypeBox.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        TypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Coffee", "Soda", "Tea" }));
        TypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeBoxActionPerformed(evt);
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

        SaveButton.setBackground(new java.awt.Color(51, 153, 255));
        SaveButton.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        textClear.setFont(new java.awt.Font("InaiMathi", 1, 14)); // NOI18N
        textClear.setForeground(new java.awt.Color(255, 0, 0));
        textClear.setText("*** Rigth Click to Clear the Selection ***");

        jLabel5.setFont(new java.awt.Font("InaiMathi", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("! ! ! Not Saved ! ! !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(textClear, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SaveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backButton)
                        .addComponent(SaveButton)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(AddButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton1ActionPerformed
        // TODO add your handling code here:
        buttonName = "ADD"; // เซ็ตเก็บข้อมูลว่ากดปุ่ม ADD
        showCancelText();

        // รับข้อมูลจากช่องกรอก
        String pName = jTextField1.getText(); // ช่องกรอกชื่อสินค้า
        String pPriceText = jTextField2.getText(); // ช่องกรอกราคาสินค้า
        String pType = null; // ประเภทสินค้า

        // ตรวจสอบว่าช่องกรอกชื่อสินค้าว่างเปล่าหรือไม่
        if (pName.equals("")) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Please enter a product name.",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
            return;

            // ตรวจสอบความถูกต้องของชื่อสินค้า
        } else if (checkData.checkString(pName) == 0) {
            JOptionPane.showMessageDialog(
                    this,       
                    "Invalid Name!! Name should be a String.",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // ตรวจสอบว่าเลือกประเภทสินค้าหรือไม่
        if (buttonGroup1.getSelection() == null) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Please select a product type.",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // เช็คประเภทสินค้าที่ถูกเลือก
        if (jRadioButton1.isSelected()) {
            pType = "Coffee";
        } else if (jRadioButton2.isSelected()) {
            pType = "Tea";
        } else if (jRadioButton3.isSelected()) {
            pType = "Soda";
        }

        // ตรวจสอบว่าช่องกรอกราคาสินค้าว่างเปล่าหรือไม่
        if (pPriceText.equals("")) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Please enter a product price.",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
            
        } else {
            // ตรวจสอบความถูกต้องของราคาสินค้า
            int priceValidity = checkData.checkDouble(pPriceText);
            if (priceValidity == 0) {
                JOptionPane.showMessageDialog(
                        this, 
                        "Invalid Price!! Price should be a Numeric.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
                
            } else if (priceValidity == -1) {
                JOptionPane.showMessageDialog(
                        this, 
                        "Invalid Price!! Price should not be less than 0.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }
        }

        double pPrice = Double.parseDouble(pPriceText);
        
        // สร้างสินค้า
        Product newProduct = new Product(pType, pName, pPrice);

        // เช็คว่าสินค้ามีอยู่ในระบบหรือไม่
        if (checkProduct(newProduct, null)) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Product's already exists.",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        // ถามผู้ใช้ว่าต้องการเพิ่มสินค้าหรือไม่
        int ans = JOptionPane.showConfirmDialog(
                this,
                "Do you want to add this product?",
                "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        // ถ้าผู้ใช้ตอบ "Yes" ทำการเพิ่มสินค้า
        if (ans == JOptionPane.YES_OPTION) {
            // หาตำแหน่งสินค้าประเภทเดียวกันที่สุดท้าย
            int index = -1;
            for (int i = 0; i < productList.size(); i++) {
                Product existingProduct = productList.get(i);
                if (existingProduct.getType().equals(pType)) {
                    index = i;
                }
            }

            // ถ้าเจอตำแหน่งสินค้าประเภทเดียวกัน ให้แทรกข้อมูลใหม่ลงในตำแหน่งถัดไป
            if (index != -1) {
                productList.add(index + 1, newProduct);
                productTableModel.insertRow(index + 1, 
                                            new Object[]{
                                                pType, 
                                                pName, 
                                                String.valueOf(df.format(pPrice))
                                            }
                );
            }

            // แจ้งผู้ใช้ว่าการเพิ่มสินค้าสำเร็จ
            JOptionPane.showMessageDialog(this, "Add Product Success");

            // เคลียร์ฟิลด์สำหรับกรอกข้อมูลและปุ่ม Radio ที่ถูกเลือก
            clearProductSelection();
            statusCheck = true;
            status();
            showCancelText();
            
        } else if (ans == JOptionPane.NO_OPTION || ans == JOptionPane.CLOSED_OPTION) {
            return;
        }


    }//GEN-LAST:event_AddButton1ActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        // เช็คว่ามีสินค้าถูกเลือกมากกว่า 1 หรือไม่
        if (size > 1) {
            // ถ้าใช่แสดงข้อความว่าให้เลือกสินค้าแค่ 1 ชิ้นเท่านั้น
            JOptionPane.showMessageDialog(this, "Please select only one product");
        } else if (size == 1) {
            // ถ้าไม่ ให้ทำงานดังนี้ 
            // เช็คความแน่ใจในการลบสินค้าออกจากระบบ
            int ans = JOptionPane.showConfirmDialog(
                    this,
                    "Do you want to delete this product?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            // ถ้าใช่
            if (ans == JOptionPane.YES_OPTION) {
                // ลบแถวที่ถูกเลือกออกจากตาราง
                productTableModel.removeRow(row);
                // ลบสินค้าออกจาก ArrayList ด้วยตำแหน่ง row
                productList.remove(row);
                statusCheck = true;
                clearField();
                status();
                clearProductSelection();
                showCancelText();
            }
        } else {
            // ถ้าไม่มีการเลือกสินค้าจะขึ้นข้อความแสดงให้ว่าให้เลือกสินค้า 1 ชิ้นก่อนลบสินค้า
            JOptionPane.showMessageDialog(this, "Please select a product");
        }

    }//GEN-LAST:event_DeleteButtonActionPerformed
    
    // เช็คว่ามีการแก้ไขข้อมูลหรือไม่ถ้าไม่ จะไม่ทำงาน
    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here:
        buttonName = "EDIT"; // เซ็ตเก็บข้อมูลว่ากดปุ่ม EDIT

        // เช็คว่ามีสินค้าถูกเลือกมากกว่า 1 หรือไม่
        if (size > 1) {
            // ถ้าใช่แสดงข้อความว่าให้เลือกสินค้าแค่ 1 ชิ้นเท่านั้น
            JOptionPane.showMessageDialog(this, "Please select only one product");

        } else if (size == 1) {
            // ถ้าไม่ ให้ทำงานดังนี้ 

            // รับข้อมูลจากช่องกรอก
            String newName = jTextField1.getText(); // ช่องกรอกชื่อสินค้า
            String newPrice = jTextField2.getText(); // ช่องราคาสินค้าชื่อสินค้า
            String newType = null; // ประเภทสินค้า

            // ตรวจสอบว่าช่องกรอกชื่อสินค้าว่างเปล่าหรือไม่
            if (newName.equals("")) {
                JOptionPane.showMessageDialog(
                        this, 
                        "Please enter a product name.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );
                return;

            } // ตรวจสอบความถูกต้องของชื่อสินค้า
            else if (checkData.checkString(newName) == 0) {
                JOptionPane.showMessageDialog(
                        this, 
                        "Invalid Name!! Name should be a String.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            // ตรวจสอบว่าเลือกประเภทสินค้าหรือไม่
            if (buttonGroup1.getSelection() == null) {
                JOptionPane.showMessageDialog(
                        this, 
                        "Please select a product type.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }

            // เช็คประเภทสินค้าที่ถูกเลือก
            if (jRadioButton1.isSelected()) {
                newType = "Coffee";
            } else if (jRadioButton2.isSelected()) {
                newType = "Tea";
            } else if (jRadioButton3.isSelected()) {
                newType = "Soda";
            }

            // ตรวจสอบว่าช่องกรอกราคาสินค้าว่างเปล่าหรือไม่
            if (newPrice.equals("")) {
                JOptionPane.showMessageDialog(
                        this, 
                        "Please enter a product name.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
                
            } else {
                // ตรวจสอบความถูกต้องของราคาสินค้า
                int priceValidity = checkData.checkDouble(newPrice);
                if (priceValidity == 0) {
                    JOptionPane.showMessageDialog(
                            this, 
                            "Invalid Price!! Price should be a Numeric.",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE
                    );
                    return;
                } else if (priceValidity == -1) {
                    JOptionPane.showMessageDialog(
                            this, 
                            "Invalid Price!! Price should not be less than 0.",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }
            }

            double pPrice = Double.parseDouble(newPrice);
            
            // เช็คว่ามีสินค้าอยู่แล้วหรีือไม่
            if (checkProduct(new Product(newType, newName, pPrice), productList.get(row))) {
                JOptionPane.showMessageDialog(
                        this,
                        "Product already exists.",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            if(new Product(newType, newName, pPrice).equals((Product) productList.get(row))){
                JOptionPane.showMessageDialog(
                        this,
                        "Couldn't find any data to edit Please check before proceeding with any changes.",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }
            
            // ถามผู้ใช้ว่าต้องการแก้ไขสินค้าหรือไม่
            int ans = JOptionPane.showConfirmDialog(
                    this,
                    "Do you want to edit this product?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            // ถ้าผู้ใช้ตอบ "Yes" ทำการแก้ไขสินค้า
            if (ans == JOptionPane.YES_OPTION) {
                // ทำการเซ็ตค่าข้อมูลใน arrayList ตำแหน่งที่เลือก
                productList.set(row, new Product(newType, newName, pPrice));

                // ทำการเซ็ตค่าในตารางตำแหน่ง row ที่ทำการเลือก
                productTableModel.setValueAt(newName, row, 1);
                productTableModel.setValueAt(newType, row, 0);
                productTableModel.setValueAt(String.valueOf(df.format(pPrice)), row, 2);

                // เคลียร์ช่องสำหรับกรอกข้อมูลสินค้า
                statusCheck = true;
                clearField();
                clearProductSelection();
                status();
                showCancelText();

            } else if (ans == JOptionPane.NO_OPTION || ans == JOptionPane.CLOSED_OPTION) {
                return;
            }

        } else {
            // ถ้าไม่มีการเลือกสินค้าจะขึ้นข้อความแสดงให้ว่าให้เลือกสินค้า 1 ชิ้นก่อนแก้ไข
            JOptionPane.showMessageDialog(this, "Please's select a product");
        }

    }//GEN-LAST:event_EditButtonActionPerformed

    private void TypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeBoxActionPerformed
        // TODO add your handling code here:
        String selectedType = TypeBox.getSelectedItem().toString();
        filterProductsByType(selectedType);

    }//GEN-LAST:event_TypeBoxActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        
        // สร้างออฟเจ็กต์สำหรับเรียกใช้หน้า MainJFrame
        MainJFrame mainPage;
        // เช็คว่ามีการแก้ไขข้อมูลหรือไม่
        if (statusCheck == true) {
            // ถ้ามีการแก้ไขข้อมูล มีการผู้ใช้ว่าต้องการเซฟหรือไม่
            int ans = JOptionPane.showConfirmDialog(
                    this,
                    "Product list has been edited. Do you want to save your edited?",
                    "Alert",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );

            switch (ans) {
                // ถ้าใช่ให้มีการเซฟข้อมูล แล้วปรับสถานะการแก้ไขเป็น false 
                case JOptionPane.YES_OPTION:
                    saveData(); // เซฟข้อมูล
                    statusCheck = false; // ปรับสถานะการแก้ไขเป็น false 
                    break;
                // ถ้าไม่ จะไม่บันทึกข้อมูล แล้วปรับสถานะการแก้ไขเป็น false
                case JOptionPane.NO_OPTION:
                    statusCheck = false;
                    break;
                case JOptionPane.CANCEL_OPTION:
                    return; // ยกเลิกการกลับไปหน้าหลัก
                default:
                    break;
            }
        }
            
        mainPage = new MainJFrame(backupList, fileName,queue);
        this.dispose();
        mainPage.setVisible(true);

    }//GEN-LAST:event_backButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        // เรียกใช้ฟังก์ชัน saveData แล้วปรับสถานะการแก้ไขเป็น fasle และเก็บสถานะบันทึกว่า true
        saveData();
        status();

    }//GEN-LAST:event_SaveButtonActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        // เป็น function ที่ใช้ดึงข้อมูลสินค้าที่เลือกให้แสดงผ่าน TextField และ RadioBox โดยการคลิกที่เมาส์

        // เช็คว่าถ้าปุ่มที่ถูกคลิกคือปุ่มซ้าย (Button1) ให้ทำงานดังนี้ 
        if (evt.getButton() == MouseEvent.BUTTON1 || evt.getClickCount() == 2) {
            

            // สร้างตัวแปรอาเรย์เก็บหมายเลขแถวที่ถูกคลิก
            int[] selectedRows = productTable.getSelectedRows();

            if (selectedRows.length == 0) {
                size = 0; // ถ้าไม่ถูกเลือกจะเก็บค่าเป็น 0

            } else if (selectedRows.length > 1) {
                size = selectedRows.length; //ถ้ามีหลายแถวที่ถูกเลือกจะเก็บค่าตามจำนวนที่ถูกเลือก
                
            } else {
                // ถ้ามีแค่แถวเดียวที่ถูกเลือก 
                int selectedRow = selectedRows[0]; // ดึงหมายเลขแถวที่ถูกเลือกมาเก็บไว้ในตัวแปร

                // แสดงข้อมูลผ่าน TextField ดึงข้อมูลจากตารางแล้วนำมาแปลงเป็น String
                jTextField1.setText(productTableModel.getValueAt(selectedRow, 1).toString());
                jTextField2.setText(productTableModel.getValueAt(selectedRow, 2).toString());

                // อ่านประเภทสินค้าและตั้งค่า RadioBox ตามประเภท
                String productType = productTableModel.getValueAt(selectedRow, 0).toString();
                switch (productType) {
                    case "Coffee" ->
                        jRadioButton1.setSelected(true);
                    case "Tea" ->
                        jRadioButton2.setSelected(true);
                    case "Soda" ->
                        jRadioButton3.setSelected(true);
                    default ->
                        buttonGroup1.clearSelection();
                }
                row = selectedRow; // บันทึกแถวที่ถูกเลือก
                size = 1; //เก็บค่าจำนวนแถวที่ถูกเลือกให้เป็น 1
            }
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {
            // ถ้าปุ่มที่ถูกคลิกเป็นปุ่มขวา (Button3) จะยกเลิกการเลือกทั้งหมดในตาราง
            clearProductSelection();
        }
        
        showCancelText();
    }//GEN-LAST:event_productTableMouseClicked

    private boolean checkProduct(Product product, Product notCheck) {
        // ฟังก์ชันสำหรับเช็คข้อมูลสินค้าว่ามีสินค้าเดิมกับที่ต้องการกรอกเข้าไปหรือไม่

        for (Product p : productList) {
            // ถ้าปุ่มที่กดเป็น EDIT จะข้ามการเช็คข้อมูลในส่วนสินค้าที่เลือกจะแก้ไข
            if (buttonName.equals("EDIT")
                    && notCheck.getType().equals(p.getType())
                    && notCheck.getName().equals(p.getName())) {
                continue;
            }

            // เช็คว่าสินค้าที่จะเพิ่มหรือแก้ไขมีอยู่แล้วหรือไม่
            if ((p.getType().equals(product.getType()))
                    && (p.getName().equals(product.getName()))) {
                return true; // สินค้ามีอยู่แล้ว ส่งค่า true ออกไป
            }
        }
        return false; // สินค้าไม่มีอยู่ ส่งค่า false ออกไป

    }

    public void clearField() {
        jTextField1.setText("");
        jTextField2.setText("");
        buttonGroup1.clearSelection();
    }
    
    public void clearProductSelection() {
        productTable.clearSelection(); // ล้างการเลือกในตารางสินค้า
        size = 0; // รีเซ็ตค่าขนาดของรายการที่ถูกเลือกเป็น 0
        row = -1; // รีเซ็ตตำแหน่งของรายการที่ถูกเลือกเป็น -1
        clearField();
    }

    private void filterProductsByType(String selectedType) {
        // ฟังก์ชันสำหรับกรองสินค้าให้แสดงเฉพาะสินค้าตามประเภทที่เลือก

        productTableModel.setRowCount(0); // ล้างตารางเก่า

        // ถ้าเลือกทั้งหมดจะ ดึงข้อมูลสินค้าทุกประเภทมาแสดง
        if ("All".equals(selectedType)) {
            // แสดงสินค้าทั้งหมด
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

    private void saveData() {
        statusCheck = false;
        
        // ตรวจสอบว่ามีชื่อไฟล์ที่เลือกหรือไม่
        if (fileName == null || fileName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No file selected for saving data."); // แสดงข้อความแจ้งเตือนถ้าไม่มีไฟล์ที่เลือก
            return;
        }
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false)); // เปิดไฟล์เพื่อเขียนข้อมูล
            for (Product product : productList) {
                // เขียนข้อมูลของสินค้าแต่ละรายการลงในไฟล์
                writer.write(product.getType() + " " + product.getName() + " " + String.valueOf(df.format(product.getPrice())) + "\n");
            }
            // ปิดไฟล์หลังจากเขียนข้อมูลเสร็จ
            writer.close();
            JOptionPane.showMessageDialog(this, "Data saved successfully."); // แสดงข้อความแจ้งเตือนว่าข้อมูลถูกบันทึกเรียบร้อย
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: Unable to save data to the selected file."); // แสดงข้อความแจ้งเตือนเมื่อเกิดข้อผิดพลาดในการบันทึกข้อมูล
        }

        backupList.clear(); // ลบข้อมูลในลิสต์ที่อยู่ใน object สำหรับสำรองข้อมูลของข้อมูลสินค้า
        backupList.addAll(productList); // นำข้อมูลสินค้าปัจจุบันทั้งหมดเพิ่มเข้าไป object ที่ใช้สำรองข้อมูล
    }

    private void showCancelText() {
        if (size > 0) {
            // ถ้ามีการเลือกสินค้าจะแสดงข้อความว่าหากต้องการยกเลิกการเลือกให้กดคลิกขวา
            textClear.setText("*** Rigth Click to Clear the Selection ***");
            return;
        }
        // ถ้าไม่มีจะเซ็ตเป็นว่าง
        textClear.setText("");
    }

    public void status() {
        if (statusCheck == true) {
            // แสดงข้อความว่าข้อมูลยังไม่ถูกบันทึก เมื่อรายการสินค้าถูกแก้ไข
            jLabel5.setText("! ! ! Not Saved ! ! !");
            return;
        }
        jLabel5.setText("");
    }

    DecimalFormat df = new DecimalFormat("0.00"); //เรียกใช้คลาส DecimalFormat โดยให้เซ็ตให้รูปแบบทศนิยมเป็ยแบบ 2 ตำแหน่ง

    // อาเรย์ลิสต์สำหรับเก็บข้อมูลสินค้าแต่ละรายการ 
    private ArrayList<Product> productList = new ArrayList<>();

    // อาเรย์ลิสต์สำหรับเก็บข้อมูลสินค้าแต่ละรายการ ไว้ใช้สำหรับ back up ข้อมูล
    private ArrayList<Product> backupList;

    // ตารางแสดงข้อมูลสินค้า
    private DefaultTableModel productTableModel;

    // เก็บชื่อไฟล์
    String fileName = "";

    // เก็บประเภทของปุ่ม
    String buttonName = "";

    // statusCheck เก็บสถานะว่าข้อมูลสินค้าในอาเรย์มีการเปลี่ยนแปลงหรือไม่
    boolean statusCheck = false;

    int row, size ,queue;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddButton1;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox<String> TypeBox;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable productTable;
    private javax.swing.JLabel textClear;
    // End of variables declaration//GEN-END:variables
}