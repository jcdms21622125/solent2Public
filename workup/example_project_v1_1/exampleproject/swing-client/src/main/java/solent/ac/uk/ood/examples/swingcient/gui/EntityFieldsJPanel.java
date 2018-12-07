/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solent.ac.uk.ood.examples.swingcient.gui;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import solent.ac.uk.ood.examples.model.Entity;

/**
 *
 * @author cgallen
 */
public class EntityFieldsJPanel extends javax.swing.JPanel {

    private static final Logger LOG = LoggerFactory.getLogger(EntityFieldsJPanel.class);

    private Entity modelEntity = new Entity();

    public Entity getModelEntity() {

        if ("".equals(jTextField_A.getText())) {
            this.modelEntity.setField_A(null);
        } else {
            this.modelEntity.setField_A(jTextField_A.getText());
        }

        if ("".equals(jTextField_B.getText())) {
            this.modelEntity.setField_B(null);
        } else {
            this.modelEntity.setField_B(jTextField_B.getText());
        }

        if ("".equals(jTextField_C.getText())) {
            this.modelEntity.setField_C(null);
        } else {
            this.modelEntity.setField_C(jTextField_C.getText());
        }

        String intText = jTextField_id.getText();
        try {
            Integer id = Integer.parseInt(intText);
            this.modelEntity.setId(id);
        } catch (NumberFormatException e) {
            // should not happen because checked 
        }
        return modelEntity;
    }

    public void setModelEntity(Entity modelEntity) {
        LOG.debug("setting model entity to " + modelEntity);
        this.modelEntity = modelEntity;
        jTextField_A.setText(this.modelEntity.getField_A());
        jTextField_B.setText(this.modelEntity.getField_B());
        jTextField_C.setText(this.modelEntity.getField_C());

        String idtxt = (modelEntity.getId() == null) ? null : modelEntity.getId().toString();
        jTextField_id.setText(idtxt);
        repaint();

    }

    // Tests that ID is an integer
    public class IntegerInputVerifier extends InputVerifier {

        @Override
        public boolean verify(JComponent input) {
            String text = ((JTextField) input).getText();
            try {
                Integer value = Integer.parseInt(text);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    /**
     * Creates new form EntityFieldsJPanel
     */
    public EntityFieldsJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelfield_A = new javax.swing.JLabel();
        jTextField_A = new javax.swing.JTextField();
        jLabelfield_B = new javax.swing.JLabel();
        jTextField_B = new javax.swing.JTextField();
        jLabelfield_C = new javax.swing.JLabel();
        jTextField_C = new javax.swing.JTextField();
        jLabelfield_id = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabelfield_A.setText("field_A");

        jTextField_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AActionPerformed(evt);
            }
        });

        jLabelfield_B.setText("field_B");

        jTextField_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BActionPerformed(evt);
            }
        });

        jLabelfield_C.setText("field_C");

        jTextField_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_CActionPerformed(evt);
            }
        });

        jLabelfield_id.setText("id");

        jTextField_id.setToolTipText("integer id");
        jTextField_id.setInputVerifier(new IntegerInputVerifier());
        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelfield_A, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(jLabelfield_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelfield_C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_B, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(jTextField_A)
                            .addComponent(jTextField_C)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelfield_id, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelfield_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelfield_A)
                    .addComponent(jTextField_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelfield_B)
                    .addComponent(jTextField_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelfield_C)
                    .addComponent(jTextField_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AActionPerformed
        // TODO add your handling code here:
        this.modelEntity.setField_A(jTextField_A.getText());
    }//GEN-LAST:event_jTextField_AActionPerformed

    private void jTextField_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BActionPerformed
        // TODO add your handling code here:
        this.modelEntity.setField_B(jTextField_B.getText());
    }//GEN-LAST:event_jTextField_BActionPerformed

    private void jTextField_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_CActionPerformed
        // TODO add your handling code here:
        this.modelEntity.setField_C(jTextField_C.getText());
    }//GEN-LAST:event_jTextField_CActionPerformed

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
        String intText = jTextField_id.getText();
        try {
            Integer id = Integer.parseInt(intText);
            this.modelEntity.setId(id);
        } catch (NumberFormatException e) {
            this.modelEntity.setId(null); // should not happen because checked 
        }
        // cannot change id
    }//GEN-LAST:event_jTextField_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelfield_A;
    private javax.swing.JLabel jLabelfield_B;
    private javax.swing.JLabel jLabelfield_C;
    private javax.swing.JLabel jLabelfield_id;
    private javax.swing.JTextField jTextField_A;
    private javax.swing.JTextField jTextField_B;
    private javax.swing.JTextField jTextField_C;
    private javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
