
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Powerzak
 */
public class OKNO extends javax.swing.JFrame {
private boolean obrazek1;
private boolean obrazek2;
private boolean obrazek3;
private boolean obrazek4;
private boolean obrazek5;
private String wynik;
private String karta;
private String wynikp="";
private String kartap="";
private boolean spr=false;

int suma=55;

private ArrayList <Card>  karty=new ArrayList<>();
private Klient b;
private  String przeciwnik;
String stan="";
         
String pulaa="";
int pula;
DeckofCards a;
    /** 
     * Creates new form OKNO
     */
  Timer timer = new Timer(5000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
System.out.println("TIMER");
              

            try {
                stan = b.getOknos();
                pulaa = b.getPulaa();
                 
                 System.out.println("stan"+stan);
                 System.out.println(pulaa+"pula");
                if(stan.equals("pass"))
{
   suma+=Integer.parseInt(pulaa);
   suma+=pula;
     jLabel3.setText("Twoja ilosc piniedzy wynosi "+ suma);
    b.setOknos("");
    pasuj.setEnabled(false);
        p5.setVisible(false);
             p10.setVisible(false);
              p20.setVisible(false);
               obstaw.setVisible(false);
                pasuj.setVisible(false);
             wyjdz.setVisible(true);
              graj.setVisible(true);
             
                  sprawdzam.setVisible(false);
                 
                  zmianakart.setVisible(false);
                  jLabel1.setText("wygrales "+ pulaa);
}
                else if(stan.equals("obstaw"))
                {
                    sprawdzam.setEnabled(false);
                    if(pulaa.equals("5"))
                    {
                        
              jLabel3.setText("twoj przeciwnik postawil 5 $");
               obstaw.setVisible(false);
                pasuj.setVisible(false);
                  zmianakart.setVisible(false);
                  b.setOknos(stan);
                  p5.setVisible(true);
             p10.setVisible(true);
              p20.setVisible(true);
                   }
                      if(pulaa.equals("10"))
                    {
                        System.out.println("ello");
       jLabel3.setText("twoj przeciwnik postawil 10 $");
               obstaw.setVisible(false);
                pasuj.setVisible(false);
                  zmianakart.setVisible(false);
                  b.setOknos(stan);
                  p5.setVisible(false);
             p10.setVisible(true);
              p20.setVisible(true);
                  
                   }
                        if(pulaa.equals("20"))
                    {
                        
              jLabel3.setText("twoj przeciwnik postawil 20 zl");
               obstaw.setVisible(false);
                pasuj.setVisible(false);
                  zmianakart.setVisible(false);
                  b.setOknos(stan);
                  p5.setVisible(false);
             p10.setVisible(false);
              p20.setVisible(true);
                  
                   }
                }
                else if (stan.equals("spr"))
                {pulaa=b.getPulaa();
                    kartap=b.getkarta();
                    wynikp=b.getwynok();
                    System.out.println(wynikp+"wynik");
                   
                      System.out.println(kartap+"karta");
                   
                   System.out.println(pulaa+"pula");
                  
                   
                   if(spr)
                   {
                       if(wynik())
                       {
                           suma+=(pula*2);
                           jLabel3.setText("wygrales gratulacje twoja suma to  "+ suma);
                           
                       }
                       else
                       {
                            pula=0;
            jLabel3.setText("przegrales przykro mi");
                       }
                   }
                     b.setOknos(" ");       
                }
                else if (stan.equals("wiadomosc2")){
                    String wiadomosc=b.getwiadmosc();
                    jTextField1.setText(wiadomosc);
                   b.setOknos("");
                    
                }
                
               
                    
            } catch (IOException ex) {
                System.out.println("blad");
               
            } catch (InterruptedException ex) {
                Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
            }



        }});

    public OKNO(String nazwa,Klient b) throws IOException {
        obrazek1=false;
        obrazek2=false;
        obrazek3=false;
        obrazek4=false;
        obrazek5=false;
        
          this.b=b;
        
          a = new DeckofCards();
          a.shuffle();
        
                
         
        initComponents();
        przeciwnik=nazwa;
          jLabel1.setText("Twoim przeciwnikiem jest "+ nazwa);
          jTextField1.setVisible(false);
          
            p5.setVisible(false);
             p10.setVisible(false);
              p20.setVisible(false);
               obstaw.setVisible(false);
                pasuj.setVisible(false);
             wyjdz.setVisible(false);
              graj.setVisible(false);
               wiadomosc.setVisible(false);
                  sprawdzam.setVisible(false);
                  
                  jTextField1.setVisible(false);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rozdawanie = new javax.swing.JButton();
        pcard3 = new javax.swing.JButton();
        card2 = new javax.swing.JButton();
        card4 = new javax.swing.JButton();
        card3 = new javax.swing.JButton();
        zmianakart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        p5 = new javax.swing.JButton();
        p10 = new javax.swing.JButton();
        p20 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        obstaw = new javax.swing.JButton();
        pasuj = new javax.swing.JButton();
        wyjdz = new javax.swing.JButton();
        graj = new javax.swing.JButton();
        wiadomosc = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        sprawdzam = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        card1 = new javax.swing.JButton();
        pcard1 = new javax.swing.JButton();
        pcard4 = new javax.swing.JButton();
        pcard2 = new javax.swing.JButton();
        card5 = new javax.swing.JButton();
        pcard5 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rozdawanie.setText("rozdawanie ");
        rozdawanie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rozdawanieMouseClicked(evt);
            }
        });
        rozdawanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rozdawanieActionPerformed(evt);
            }
        });

        pcard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyl.png"))); // NOI18N
        pcard3.setText("jButton2");
        pcard3.setEnabled(false);
        pcard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcard3ActionPerformed(evt);
            }
        });

        card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyl.png"))); // NOI18N
        card2.setText("jButton2");
        card2.setEnabled(false);
        card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card2ActionPerformed(evt);
            }
        });

        card4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyl.png"))); // NOI18N
        card4.setText("jButton2");
        card4.setEnabled(false);
        card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card4ActionPerformed(evt);
            }
        });

        card3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyl.png"))); // NOI18N
        card3.setText("jButton2");
        card3.setEnabled(false);
        card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card3ActionPerformed(evt);
            }
        });

        zmianakart.setText("zamiana kart");
        zmianakart.setEnabled(false);
        zmianakart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zmianakartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N

        p5.setText("5");
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });

        p10.setText("10");
        p10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10ActionPerformed(evt);
            }
        });

        p20.setText("20");
        p20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p20ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Witaj w grze");

        obstaw.setText("obstaw");
        obstaw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obstawActionPerformed(evt);
            }
        });

        pasuj.setText("pasuj");
        pasuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasujActionPerformed(evt);
            }
        });

        wyjdz.setText("Wyjdz z gry ");
        wyjdz.setActionCommand("wyjdz z gry ");
        wyjdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyjdzActionPerformed(evt);
            }
        });

        graj.setText("Graj dalej");
        graj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grajActionPerformed(evt);
            }
        });

        wiadomosc.setText("napisz wiadomosc");
        wiadomosc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wiadomoscActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        sprawdzam.setText("sprawdzam");
        sprawdzam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprawdzamActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setText("Twoja suma piniedzy to 55");

        card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyl.png"))); // NOI18N
        card1.setText("jButton2");
        card1.setEnabled(false);
        card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card1ActionPerformed(evt);
            }
        });

        pcard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyl.png"))); // NOI18N
        pcard1.setText("jButton2");
        pcard1.setEnabled(false);
        pcard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcard1ActionPerformed(evt);
            }
        });

        pcard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyl.png"))); // NOI18N
        pcard4.setText("jButton2");
        pcard4.setEnabled(false);
        pcard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcard4ActionPerformed(evt);
            }
        });

        pcard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyl.png"))); // NOI18N
        pcard2.setText("jButton2");
        pcard2.setEnabled(false);
        pcard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcard2ActionPerformed(evt);
            }
        });

        card5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyl.png"))); // NOI18N
        card5.setText("jButton2");
        card5.setEnabled(false);
        card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card5ActionPerformed(evt);
            }
        });

        pcard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tyl.png"))); // NOI18N
        pcard5.setText("jButton2");
        pcard5.setEnabled(false);
        pcard5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcard5ActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p20)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sprawdzam, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(pasuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(obstaw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(137, 137, 137)
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(p10)
                    .addComponent(p5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(pcard1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pcard2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pcard3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pcard4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pcard5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(zmianakart, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rozdawanie)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wiadomosc, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wyjdz, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(graj, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(204, 204, 204)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pcard1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcard2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcard3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcard4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcard5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(wiadomosc)
                .addGap(28, 28, 28)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p5)
                    .addComponent(wyjdz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(graj)
                    .addComponent(p10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(obstaw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pasuj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sprawdzam))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(zmianakart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rozdawanie)
                        .addGap(26, 26, 26)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void rozdawanieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rozdawanieMouseClicked
        
           
        
             card1.setIcon(new ImageIcon( a.getDeck()[0].getCardImage()));
             karty.add(a.getDeck()[0]);
              card2.setIcon(new ImageIcon( a.getDeck()[1].getCardImage()));
                karty.add(a.getDeck()[1]);
           card3.setIcon(new ImageIcon( a.getDeck()[3].getCardImage()));
                karty.add(a.getDeck()[3]);
                   card4.setIcon(new ImageIcon( a.getDeck()[2].getCardImage()));
                karty.add(a.getDeck()[2]);
                 card5.setIcon(new ImageIcon( a.getDeck()[4].getCardImage()));
                 karty.add(a.getDeck()[4]);
                  rozdawanie.setEnabled(false );
                       jTextField1.setVisible(true);
          card3.setEnabled(true );
          card1.setEnabled(true );
          card2.setEnabled(true );
          card4.setEnabled(true );
           card5.setEnabled(true );
          pasuj.setEnabled(true );
          zmianakart.setEnabled(true );
         wiadomosc.setVisible(true);
         
          obstaw.setVisible(true);
          pasuj.setVisible(true);
          sprawdzam.setVisible(true);
          rozdawanie.setEnabled(false);
          rozdawanie.setVisible(false);
          suma=suma-5;
          pula=5;
          jLabel3.setText("Twoja ilosc pineidzy wynosi "+ suma);
timer.start();
          
          
          
    }//GEN-LAST:event_rozdawanieMouseClicked

    private void pcard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcard3ActionPerformed
        if(obrazek1==false)
        {File file = new File("tyl.png");

            BufferedImage bi;
            try {
                bi = ImageIO.read(file);
                
       card1.setIcon(new ImageIcon(bi));
            } catch (IOException ex) {
                Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
            }
        obrazek1=true;
        }
        else
        {
            obrazek1=false;
          pcard3.setIcon(new ImageIcon(a.getDeck()[0].getCardImage()));
      }
    }//GEN-LAST:event_pcard3ActionPerformed

    private void card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card2ActionPerformed
        // TODO add your handling code here:
        if(obrazek2==false)
        {File file = new File("tyl.png");

            BufferedImage bi;
            try {
                bi = ImageIO.read(file);
                
       card2.setIcon(new ImageIcon(bi));
       obrazek2=true;
            } catch (IOException ex) {
                Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
            }
        obrazek2=true;
        }
        else
        {
            obrazek2=false;
          card2.setIcon(new ImageIcon(a.getDeck()[1].getCardImage()));
      }
    }//GEN-LAST:event_card2ActionPerformed

    private void card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card4ActionPerformed
        // TODO add your handling code here:
           if(obrazek4==false)
        {File file = new File("tyl.png");

            BufferedImage bi;
            try {
                bi = ImageIO.read(file);
                
       card4.setIcon(new ImageIcon(bi));
       obrazek4=true;
            } catch (IOException ex) {
                Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
            }
        obrazek4=true;
        }
        else
        {
            obrazek4=false;
          card4.setIcon(new ImageIcon(a.getDeck()[2].getCardImage()));
          
      }
    }//GEN-LAST:event_card4ActionPerformed
//tasowanie guzik 
    private void card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card3ActionPerformed
           if(obrazek3==false)
        {File file = new File("tyl.png");

            BufferedImage bi;
          
            try {
                bi = ImageIO.read(file);
                
       card3.setIcon(new ImageIcon(bi));
            } catch (IOException ex) {
                Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
            }
        obrazek3=true;
        }
        else
        {
            obrazek3=false;
          card3.setIcon(new ImageIcon(a.getDeck()[3].getCardImage()));
       
      }
           
    }//GEN-LAST:event_card3ActionPerformed

    private void zmianakartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zmianakartActionPerformed
                               System.out.println("zmiana kart");
    if(obrazek1==true)
    { System.out.println( "0  " );
        card1.setIcon(new ImageIcon(a.getDeck()[51].getCardImage()));
       usuwanie(0,51);
        System.out.println("kartaa1pozmianei" +karty.get(0).getFaceName());
    }
    if(obrazek2==true)
    { System.out.println( "1" );
        card2.setIcon(new ImageIcon(a.getDeck()[50].getCardImage()));
        usuwanie(1,50);
         System.out.println(karty.get(1).getFaceName());
    }
    if(obrazek3==true)
    {System.out.println( "2" );
        card3.setIcon(new ImageIcon(a.getDeck()[49].getCardImage()));
            usuwanie(2,49);
        System.out.println(karty.get(2).getFaceName());
    }
    if(obrazek4==true)
    {System.out.println( "3" );
        card4.setIcon(new ImageIcon(a.getDeck()[48].getCardImage()));
          usuwanie(3,48);
         System.out.println(karty.get(3).getFaceName());
    }
     if(obrazek5==true)
    {
        System.out.println( "4" );
        card5.setIcon(new ImageIcon(a.getDeck()[47].getCardImage()));
       usuwanie(4,47);
         System.out.println("zmiana koneic "+karty.get(4).getFaceName());
    }
    for(int i=0;i<karty.size();i++)
    {
        System.out.println(karty.get(i).getFaceName());
    }
       zmianakart.setEnabled(false);
       zmianakart.setVisible(false);
       obrazek1=false;
             obrazek2=false;
              obrazek3=false;
               obrazek4=false;
                   obrazek5=false;

    
           
           
    
    
 
    }//GEN-LAST:event_zmianakartActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
    try{
        pula=pula+5;
        suma-=5;
        jLabel3.setText("Twoja pula pineidzy to  "+suma);
        sprawdzam.setEnabled(true);
         b.Oknoa(pula, "obstaw", przeciwnik);
    } catch (IOException ex) {
        Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_p5ActionPerformed

    private void grajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grajActionPerformed

             wyjdz.setVisible(false);
              graj.setVisible(false);
               card3.setEnabled(true );
          card1.setEnabled(true );
          card2.setEnabled(true );
          card4.setEnabled(true );
          pasuj.setEnabled(true );
          zmianakart.setEnabled(true );
         wiadomosc.setVisible(true);
         
          obstaw.setVisible(true);
          pasuj.setVisible(true);
          sprawdzam.setVisible(true);
               
    }//GEN-LAST:event_grajActionPerformed

    private void wiadomoscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wiadomoscActionPerformed
    try {
        String abc=jTextField1.getText();
        System.out.println("wiadmmosc"+abc);
        b.Wiadomosc(abc, przeciwnik);
    } catch (IOException ex) {
        Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_wiadomoscActionPerformed

    private void wyjdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyjdzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wyjdzActionPerformed

    private void sprawdzamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprawdzamActionPerformed
boolean poker =true;
int liczba1=0;
int liczba2=0;
int ite=0;
int kw1=0;
int kw2=0;

int [] valu={2,3,4,5,6,7,8,9,10,11,12,13,14};
  
karty.sort(Comparator.comparing(Card::getFaceValue));


if(!kolor() || !streat())
    {
        poker=false;
    }

if(poker )
{
    wynik="poker";
    karta=""+karty.get(4).getFaceValue();
    System.out.println("poker");
         
    
}
else
{
 for(int j=0;j<valu.length;j++)
 {
     for(int i=0;i<karty.size();i++)
     {
         if(karty.get(i).getFaceValue()==valu[j])
         {
            ite++;
                  
         }
     }
     if(ite>1)
     {
         if(liczba1>1)
         {
             kw2=valu[j];
             liczba2=ite;
             break;
         }
         else
         {
             kw1=valu[j];
             liczba1=ite;
             
         }
     }
    ite=0;
             
 }
 if(liczba1==4)
 {
     wynik="kareta";
     karta=""+karty.get(4).getFaceValue();
 }
else if((liczba1==3 && liczba2==2) || (liczba2==3 && liczba1==2))
 {
     wynik="Full";
     karta=""+karty.get(4).getFaceValue();
 }
else if(liczba1==0 && liczba2==0)
        {
           if(kolor())
           {
               wynik="kolor";
     karta=""+karty.get(4).getFaceValue();
           }
           else if(streat())
                   {
                       wynik="streat";
     karta=""+karty.get(4).getFaceValue();
                   }
           else
           {
                wynik="wysokakarta";
      karta=""+karty.get(4).getFaceValue();
           }
               
        }
else if(liczba2==2 && liczba1==2)
{
    wynik="dwiepary";
     karta=""+karty.get(4).getFaceValue();
}
else if(liczba2==2 || liczba1==2)
{
    wynik="para";
      karta=""+karty.get(4).getFaceValue();
}
 

    
}
System.out.println("wynik "+wynik+"karta"+karta);
for(int i=0;i<karty.size();i++)
{
      System.out.println(karty.get(i).getFaceName());
}
    try {
        b.Okno(wynik,String.valueOf(pula),karta,przeciwnik);
    } catch (IOException ex) {
        Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
    }
    if(!wynikp.equals(""))
    {
        System.out.println("jestem w srodku aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        if(wynik())
        {
            suma+=(pula*2);
            jLabel3.setText("Wygrales twoja suma to "+suma);
        }
        else
        {
            pula=0;
            jLabel3.setText("przegrales przykro mi");
        }
    }
    else
    {
        spr=true;
    }
         
    }//GEN-LAST:event_sprawdzamActionPerformed

    private void pasujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasujActionPerformed
    try {
        b.Oknoa(pula, "pass", przeciwnik);
      jLabel1.setText("Przegraełeś "+pula+"$");
      p5.setVisible(false);
             p10.setVisible(false);
              p20.setVisible(false);
               obstaw.setVisible(false);
                pasuj.setVisible(false);
             wyjdz.setVisible(true);
              graj.setVisible(true);
              
                  sprawdzam.setVisible(false);
                  
                 
      
    } catch (IOException ex) {
        Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
    
    }//GEN-LAST:event_pasujActionPerformed
    }
    private void card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card1ActionPerformed
      ;
        if(obrazek1==false)
        {File file = new File("tyl.png");

            BufferedImage bi;
            try {
                bi = ImageIO.read(file);
                
       card1.setIcon(new ImageIcon(bi));
            } catch (IOException ex) {
                Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
            }
        obrazek1=true;
        }
        else
        {
            obrazek1=false;
          card1.setIcon(new ImageIcon(a.getDeck()[0].getCardImage()));
      }
    }//GEN-LAST:event_card1ActionPerformed

    private void pcard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcard1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcard1ActionPerformed

    private void pcard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcard4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcard4ActionPerformed

    private void pcard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcard2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcard2ActionPerformed

    private void rozdawanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rozdawanieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rozdawanieActionPerformed

    private void obstawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obstawActionPerformed
       p5.setVisible(true);
       p10.setVisible(true);
       p20.setVisible(true);
    }//GEN-LAST:event_obstawActionPerformed

    private void p10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10ActionPerformed
    try {
        pula=pula+10;
        suma-=10;
        jLabel3.setText("Twoja pula pineidzy to  "+suma);
        b.Oknoa(pula, "obstaw", przeciwnik);
        p5.setEnabled(false);
             p10.setEnabled(false);
             
              p20.setVisible(true);
               sprawdzam.setEnabled(true);
    } catch (IOException ex) {
        Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_p10ActionPerformed

    private void p20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p20ActionPerformed
     try{
         if(pula==5)
         {
             pula=0;
             suma+=5;
             
         }
         else
         {
             pula=0;
             suma+=10;
         }
        pula=pula+20;
        suma-=20;
        jLabel3.setText("Twoja pula piniedzy to  "+suma);
         b.Oknoa(pula, "obstaw", przeciwnik);
          p5.setEnabled(false);
             p10.setEnabled(false);
             
              p20.setEnabled(false);
               sprawdzam.setEnabled(true);
    } catch (IOException ex) {
        Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_p20ActionPerformed

    private void card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card5ActionPerformed
      if(obrazek5==false)
        {File file = new File("tyl.png");

            BufferedImage bi;
            try {
                bi = ImageIO.read(file);
                
       card5.setIcon(new ImageIcon(bi));
            } catch (IOException ex) {
                Logger.getLogger(OKNO.class.getName()).log(Level.SEVERE, null, ex);
            }
        obrazek5=true;
        }
        else
        {
            obrazek5=false;
          card5.setIcon(new ImageIcon(a.getDeck()[4].getCardImage()));
      }
    }//GEN-LAST:event_card5ActionPerformed
private boolean kolor()
        {
            String[] suits={"Clubs","Diamonds","Hearts","Spades"};
            int ite=0;
             for(int j=0;j<suits.length;j++)
 {
     for(int i=0;i<karty.size();i++)
     {
         if(karty.get(i).getSuit().equals(suits[j]))
         {
            ite++;
                  
         }
         
     }
      if(ite==5)
         {
            return true;
         }
         else
         {
            ite=0;
         }
 }
             return false;
        }
public boolean streat()
{
    for(int i=1;i<karty.size();i++)
{
    if(!(karty.get(i-1).getFaceValue()+1==karty.get(i).getFaceValue()) )
    {
        return false;
                
    }
    
    
}
    return true;
}
public void usuwanie(int u, int dod)
        
{
    
        
    karty.remove(u);
    karty.add(u, a.getDeck()[dod]);
}
public int wynik2(String wynikk)
{
   switch(wynikk)
   {
       case "wysokakarta":
               {
                   return 1;
               }
       case "para":
       {
           return 2;
       }
       case "dwiepary ":
       {
           return 3;
       }
   }
   return 0;
}
public boolean wynik( )
{
    System.out.println(kartap);
    int kartaprz=Integer.parseInt(kartap);
     int kartat=Integer.parseInt(karta);
      int wyniki=wynik2(wynik);
     
     int wynikpi=wynik2(wynikp);
    
  if(wyniki>wynikpi)
  {
      return true;
  }
  else if(wyniki==wynikpi)
  {
     if(kartat>kartaprz)
     {
         return true;
     }
     else
     {
         return false;
     }
          
  }
  
   return false;
}
    private void pcard5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcard5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcard5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton card1;
    private javax.swing.JButton card2;
    private javax.swing.JButton card3;
    private javax.swing.JButton card4;
    private javax.swing.JButton card5;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton graj;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton obstaw;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JButton p10;
    private javax.swing.JButton p20;
    private javax.swing.JButton p5;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JButton pasuj;
    private javax.swing.JButton pcard1;
    private javax.swing.JButton pcard2;
    private javax.swing.JButton pcard3;
    private javax.swing.JButton pcard4;
    private javax.swing.JButton pcard5;
    private javax.swing.JButton rozdawanie;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JButton sprawdzam;
    private javax.swing.JButton wiadomosc;
    private javax.swing.JButton wyjdz;
    private javax.swing.JButton zmianakart;
    // End of variables declaration//GEN-END:variables

}
