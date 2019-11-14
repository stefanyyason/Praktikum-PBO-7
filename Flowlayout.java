/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;
/**
 *
 * @author ASUS
 */
public class Flowlayout extends JFrame {

    /**
     * @param args the command line arguments
     */
    public Flowlayout(){
        //Membuat obyek layout manager
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 5, 10);
        //Memperoleh kontent pane dari frame
        Container container = getContentPane();
        //Mengatur layout manager dari content pane
        container.setLayout(flowLayout);
        //Menambahkan lima button ke content pane
        container.add(new JButton("Tombol 1"));
        container.add(new JButton("Tombol 2"));
        container.add(new JButton("Tombol 3"));
        container.add(new JButton("Tombol 4"));
        container.add(new JButton("Tombol 5"));
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Flowlayout jendela = new Flowlayout();
        jendela.setTitle("Kelas DemoFlowLayout");
        jendela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jendela.setSize(350, 120);
        jendela.setVisible(true);
    }
}
