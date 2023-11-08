import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainJFrame extends javax.swing.JFrame {
    
    public MainJFrame(ArrayList<Product> productList, String fileName, int queue) {
        initComponents();
        for (Product p : productList) {
            this.productList.add(p);
        }
        this.fileName = fileName;
        this.queue = queue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Management = new javax.swing.JButton();
        PlaceOrder = new javax.swing.JButton();
        EndProgram = new javax.swing.JButton();
        Back = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Krungthep", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Coffee Shop Management");

        Management.setBackground(new java.awt.Color(0, 153, 204));
        Management.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        Management.setForeground(new java.awt.Color(255, 255, 255));
        Management.setText("MANAGEMENT");
        Management.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagementActionPerformed(evt);
            }
        });

        PlaceOrder.setBackground(new java.awt.Color(0, 154, 0));
        PlaceOrder.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        PlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        PlaceOrder.setText("PLACE ORDER");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });

        EndProgram.setBackground(java.awt.Color.red);
        EndProgram.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        EndProgram.setForeground(new java.awt.Color(255, 255, 255));
        EndProgram.setText("EXIT");
        EndProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndProgramActionPerformed(evt);
            }
        });

        Back.setBackground(java.awt.Color.orange);
        Back.setFont(new java.awt.Font("Krungthep", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel3.setText("Designed and Developed by: Bastackle@ComSci");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Management, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlaceOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndProgram, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
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
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Management, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EndProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(173, 173, 173)
                .addComponent(jLabel3)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagementActionPerformed
        // TODO add your handling code here:
        ManagementJFrame products = new ManagementJFrame(productList, fileName,queue);
        this.dispose();
        products.setVisible(true);
    }//GEN-LAST:event_ManagementActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        // TODO add your handling code here:
        PlaceOrderJFrame placeOrder = new PlaceOrderJFrame(productList, fileName, queue);
        this.dispose();
        placeOrder.setVisible(true);
    }//GEN-LAST:event_PlaceOrderActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void EndProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndProgramActionPerformed
        // TODO add your handling code here:
        button = "EXIT";
        if (confirmButton(button) == true) {
            System.exit(0);
        }
    }//GEN-LAST:event_EndProgramActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        button = "BACK";
        if (confirmButton(button) == true) {
            OpenJFrame opFrame = new OpenJFrame();
            this.dispose();
            opFrame.setVisible(true);
        }
    }//GEN-LAST:event_BackActionPerformed
   
    public boolean confirmButton(String button) {
        int result;
        
        if(button.equals("EXIT")){
            result = JOptionPane.showConfirmDialog(
                    this,
                    "Do you want to exit the program",
                    "Exit Confirmation",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );
            
        } else {
            result = JOptionPane.showConfirmDialog(
                    this,
                    "Do you want to back to the home page? " +
                    "If you go back, the customer queue will be reset, " + 
                    "and you will need to select the product file again to access the system.",
                    "Warning",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );
        }
        
        return result == JOptionPane.YES_OPTION;
    }

    private ArrayList<Product> productList = new ArrayList<>();
    String fileName = "";
    String button = "";
    int queue;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton EndProgram;
    private javax.swing.JButton Management;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}