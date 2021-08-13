import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

public class Des_java {

private static String input="",Enc="",Dec="";


    public static void main(String[] args)
    {

        JFrame f1=new JFrame();
		f1.setVisible(true);
		f1.setSize(500,400);
		f1.setTitle("DES Encryption Project");
		f1.setLayout(null);

	    JTextField djt1 =new JTextField(10);
	    djt1.setFont(new Font(Font.DIALOG,Font.PLAIN,14));
	    djt1.setBounds(50,50,200,30);

        JButton djb=new JButton("Encrypt");
	    djb.setBounds(300,50,100,30);

	    JLabel djl3 =new JLabel("");
		djl3.setFont(new Font("Verdana", Font.PLAIN, 14));
	    djl3.setBounds(50,100,250,30);
	    djl3.setText("Encrypt Message :");

	    JLabel encryptText =new JLabel("");
		encryptText.setFont(new Font("Verdana", Font.PLAIN, 14));
		encryptText.setBounds(230,100,250,30);
	    encryptText.setText("");

		JButton djb1=new JButton("Decrypt");
	    djb1.setBounds(150,150,100,30);

	    JLabel djl =new JLabel("");
		djl.setFont(new Font("Verdana", Font.PLAIN, 14));
		djl.setBounds(50,200,250,30);
	    djl.setText("Decrypt Message :");

		JLabel decryptText =new JLabel("");
		decryptText.setFont(new Font("Verdana", Font.PLAIN, 14));
		decryptText.setBounds(230,200,250,30);
	    decryptText.setText("");

		djb.addActionListener(new ActionListener()
		 {
		   public void actionPerformed(ActionEvent ae)
		   {
				input=djt1.getText();
				if(input == null)
				{
					encryptText.setText("");
				}else{
					try{
						            KeyGenerator kg = KeyGenerator.getInstance("DES");
						            SecretKey myDESKey = kg.generateKey();
						            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
						            cipher.init(Cipher.ENCRYPT_MODE,myDESKey);
						            byte[] text = input.getBytes();
						            byte[] textEnc = cipher.doFinal(text);
									Enc= new String(textEnc);
						            encryptText.setText(Enc);

						            cipher.init(Cipher.DECRYPT_MODE,myDESKey);
						            byte[] textDec = cipher.doFinal(textEnc);
                                    Dec = new String(textDec);

						}catch (Exception e){

			            }
				}
		   }
		 });


		 djb1.addActionListener(new ActionListener()
		 {
		   public void actionPerformed(ActionEvent ae)
		   {
             decryptText.setText(Dec);
		   }
		 });


        f1.add(djt1);
        f1.add(djb);
        f1.add(djl3);
        f1.add(djb1);
        f1.add(djl);
        f1.add(encryptText);
        f1.add(decryptText);
    }


}
