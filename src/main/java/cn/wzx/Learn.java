package cn.wzx;
import java.awt.*;
import javax.swing.*;


public class  Learn extends JFrame
{


    public Learn(){
        //����ͼƬ
        ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\Desktop\\downloadfile.jpeg");
        //ImageIcon icon1=new ImageIcon("C:\\Users\\Administrator\\Desktop\\�û���.png");
        //��ͼƬ����label��
        JLabel label=new JLabel(icon);
        JLabel label1=new JLabel("�û�����");
        //����label�Ĵ�С
        label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
        label1.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());

        JFrame frame=new JFrame();

        //��ȡ���ڵĵڶ��㣬��label����
        frame.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));

        //��ȡframe�Ķ�������,������Ϊ͸��
        JPanel j=(JPanel)frame.getContentPane();
        j.setOpaque(false);

        JPanel panel=new JPanel();
        //JTextField jta=new JTextField(10);
        //JTextArea jta=new JTextArea(10,60);


        //panel.add(jta);
        //panel.add(jb);
        //panel.add(jb2);
        panel.add(label1);

        //��������Ϊ͸���ġ����򿴲���ͼƬ
        panel.setOpaque(false);

        frame.add(panel);
        frame.add(panel);
        frame.setSize(icon.getIconWidth(),icon.getIconHeight());
        //frame.setPreferredSize(new Dimension(500, 900));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




    }
    public static void main(String[] args)
    {
        new Learn();
    }
}
