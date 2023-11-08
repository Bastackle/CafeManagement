import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class OpenJFrame extends javax.swing.JFrame {

    public OpenJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        EndProgram = new javax.swing.JButton();
        SelectFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton4.setBackground(new java.awt.Color(0, 153, 204));
        jButton4.setFont(new java.awt.Font("Krungthep", 0, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("DELETE and EDIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CoffeeShop");
        setAutoRequestFocus(false);
        setResizable(false);

        EndProgram.setBackground(java.awt.Color.red);
        EndProgram.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        EndProgram.setForeground(new java.awt.Color(255, 255, 255));
        EndProgram.setText("EXIT");
        EndProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndProgramActionPerformed(evt);
            }
        });

        SelectFile.setBackground(new java.awt.Color(0, 153, 204));
        SelectFile.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        SelectFile.setForeground(new java.awt.Color(255, 255, 255));
        SelectFile.setText("Open File");
        SelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectFileActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Please select the product file before use this program.");

        jLabel1.setFont(new java.awt.Font("Krungthep", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Coffee Shop Management");

        jLabel3.setText("Designed and Developed by: Bastackle@ComSci");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EndProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EndProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(214, 214, 214)
                .addComponent(jLabel3)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void EndProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndProgramActionPerformed
        if (comfirmExit() == true) {
            System.exit(0);
        }
    }//GEN-LAST:event_EndProgramActionPerformed

    private void SelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectFileActionPerformed

        JFileChooser fileChooser = new JFileChooser();

        // ขึ้นหน้าต่างให้เลือกไฟล์ โดยขึ้นเป็นแบบบังคับ 
        // ถ้าไม่เลือกไฟล์หรือกด cancle จะไม่สามารถเข้าไปถึงหน้าจัดการข้อมูลสินค้าได้
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            fileName = selectedFile.getAbsolutePath();
            checkFile = true;
            keepData();
        } else {
            checkFile = false;
        }

    }//GEN-LAST:event_SelectFileActionPerformed

    public boolean comfirmExit() {
        int result = JOptionPane.showConfirmDialog(
                this,
                "Do you want to exit the program",
                "Exit Confirmation",
                JOptionPane.YES_NO_OPTION
        );

        if (result == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    public void keepData() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            boolean isValidFormat = true; // ตัวแปรสำหรับตรวจสอบรูปแบบข้อมูล
            // สร้างตัวแปรสำหรับการอ่านข้อมูลในไฟล์
            while ((dataFile = reader.readLine()) != null) { // ลูปไปเรื่อย ๆ ถ้าในแต่ละบรรทัดยังมีข้อมูล
                data = dataFile.split(" "); // แยกข้อมูลออกเป็นส่วน ๆ โดยแบ่งจาก space bar
                // ตรวจสอบว่าข้อมูลมีรูปแบบที่ถูกต้องหรือไม่
                if (data.length != 3) {
                    isValidFormat = false;
                    break; // ถ้ารูปแบบไม่ถูกต้องให้หยุดอ่านไฟล์
                }

                try {
                    double productPrice = Double.parseDouble(data[2]);
                    Product product = new Product(data[0], data[1], productPrice); // สร้าง object product ที่เปลี่ยนไปเรื่องตามค่า parameter ที่ส่งเข้าไป
                    productList.add(product); // เพิ่มข้อมูลลงในอาเรย์ลิสต์ โดยส่ง object ที่ชื่อ product เข้าไป
                } catch (NumberFormatException e) {
                    isValidFormat = false;
                    break;
                }
            }
            reader.close(); //ปิดไฟล์

            if (!isValidFormat) {
                // แสดงกล่องข้อความเมื่อรูปแบบข้อมูลไม่ถูกต้อง
                JOptionPane.showMessageDialog(this, "Invalid data format in the selected file. Please choose another file.");
                checkFile = false; // ไม่ต้องเรียกหน้าจัดการข้อมูลสินค้า
                return;
            }

            if (productList.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No data found in the selected file.");
                checkFile = false; // ไม่ต้องเรียกหน้าจัดการข้อมูลสินค้า
                return;
            }

            // เรียกหน้าจัดการข้อมูลสินค้าเมื่อรูปแบบข้อมูลถูกต้องและมีข้อมูล
            MainJFrame main = new MainJFrame(productList, fileName,queue);
            this.dispose();
            main.setVisible(true);

            // อัปเดตตารางด้วยข้อมูลใหม่
        } catch (IOException e) {
            System.out.println("Error: Reading File");
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new OpenJFrame().setVisible(true);
            }
        });
    }

    private ArrayList<Product> productList = new ArrayList<Product>();
    public String fileName = "";
    String dataFile;
    String[] data;
    int queue = 0;
    boolean checkFile;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndProgram;
    private javax.swing.JButton SelectFile;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}