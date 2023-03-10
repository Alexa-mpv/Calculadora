/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculadora;

import java.util.ArrayList;

/**
 * Interfaz gráfica de la calculadora
 * @author Fernando Retama
 */
public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnRes = new javax.swing.JButton();
        btnParenIzq = new javax.swing.JButton();
        btnParenDer = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnResolver = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        display = new javax.swing.JTextField();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNum7.setText("7");
        btnNum7.setAutoscrolls(true);
        btnNum7.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnNum4.setText("4");
        btnNum4.setAutoscrolls(true);
        btnNum4.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum1.setText("1");
        btnNum1.setAutoscrolls(true);
        btnNum1.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum8.setText("8");
        btnNum8.setAutoscrolls(true);
        btnNum8.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum5.setText("5");
        btnNum5.setAutoscrolls(true);
        btnNum5.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnNum2.setText("2");
        btnNum2.setAutoscrolls(true);
        btnNum2.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnNum6.setText("6");
        btnNum6.setAutoscrolls(true);
        btnNum6.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnNum9.setText("9");
        btnNum9.setAutoscrolls(true);
        btnNum9.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnNum3.setText("3");
        btnNum3.setAutoscrolls(true);
        btnNum3.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnSum.setText("+");
        btnSum.setAutoscrolls(true);
        btnSum.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });

        btnNum0.setText("0");
        btnNum0.setAutoscrolls(true);
        btnNum0.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        btnPunto.setText(".");
        btnPunto.setAutoscrolls(true);
        btnPunto.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnMul.setText("*");
        btnMul.setAutoscrolls(true);
        btnMul.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.setAutoscrolls(true);
        btnDiv.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnRes.setText("-");
        btnRes.setAutoscrolls(true);
        btnRes.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResActionPerformed(evt);
            }
        });

        btnParenIzq.setText("(");
        btnParenIzq.setAutoscrolls(true);
        btnParenIzq.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnParenIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParenIzqActionPerformed(evt);
            }
        });

        btnParenDer.setText(")");
        btnParenDer.setAutoscrolls(true);
        btnParenDer.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnParenDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParenDerActionPerformed(evt);
            }
        });

        btnExp.setText("^");
        btnExp.setAutoscrolls(true);
        btnExp.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnResolver.setText("=");
        btnResolver.setAutoscrolls(true);
        btnResolver.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 102, 51));
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("AC");
        btnClear.setAutoscrolls(true);
        btnClear.setMargin(new java.awt.Insets(2, 5, 3, 5));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(display)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNum7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnNum4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNum0, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnNum8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNum5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNum9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnNum6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNum3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnParenIzq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExp, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnParenDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExp)
                    .addComponent(btnNum9)
                    .addComponent(btnNum8)
                    .addComponent(btnNum7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum4)
                    .addComponent(btnNum5)
                    .addComponent(btnNum6)
                    .addComponent(btnRes)
                    .addComponent(btnSum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum1)
                    .addComponent(btnNum2)
                    .addComponent(btnNum3)
                    .addComponent(btnMul)
                    .addComponent(btnDiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum0)
                    .addComponent(btnPunto)
                    .addComponent(btnResolver)
                    .addComponent(btnParenIzq)
                    .addComponent(btnParenDer))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void addCharToDisp(char c){
        String text = display.getText();
        text = text + c;
        display.setText(text);
    }
    
    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        addCharToDisp('2');
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResActionPerformed
        addCharToDisp('-');
    }//GEN-LAST:event_btnResActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        addCharToDisp('7');
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        addCharToDisp('8');
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        addCharToDisp('9');
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        addCharToDisp('4');
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        addCharToDisp('5');
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        addCharToDisp('6');
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        addCharToDisp('1');
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        addCharToDisp('3');
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        addCharToDisp('.');
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        addCharToDisp('0');
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnParenIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParenIzqActionPerformed
        addCharToDisp('(');
    }//GEN-LAST:event_btnParenIzqActionPerformed

    private void btnParenDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParenDerActionPerformed
        addCharToDisp(')');
    }//GEN-LAST:event_btnParenDerActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        addCharToDisp('^');
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        addCharToDisp('*');
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        addCharToDisp('+');
    }//GEN-LAST:event_btnSumActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        addCharToDisp('/');
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        display.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        String cadena = display.getText();
        if (!cadena.isEmpty())
            display.setText(Metodos.calculadora(cadena));
    }//GEN-LAST:event_btnResolverActionPerformed

    //aquí estaba el main
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnParenDer;
    private javax.swing.JButton btnParenIzq;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRes;
    private javax.swing.JButton btnResolver;
    private javax.swing.JButton btnSum;
    private javax.swing.JTextField display;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
