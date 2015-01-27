package framesystem;

import java.awt.Button;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;
import lib.MM1_lib;
import lib.MMS_lib;
 
public class FrameSystemView extends Frame implements ActionListener,WindowListener{

	private TextField text1 = new TextField("",5);
	private TextField text2 = new TextField("",5);
	private TextField text3 = new TextField("",5);
	private Button button1 = new Button("ë´ÇµéZ");
	private TextField m1 = new TextField("",5);
	private TextField m2 = new TextField("",5);
	private TextField m3 = new TextField("",5);
	private Button bm = new Button("M/M/1");
	private TextField ms1 = new TextField("",5);
	private TextField ms2 = new TextField("",5);
	private TextField ms3 = new TextField("",5);
	private TextField ms4 = new TextField("",5);
	private TextField ms5 = new TextField("",5);
	private TextField ms6 = new TextField("",5);
	private TextField ms7 = new TextField("",5);
	private TextField ms8 = new TextField("",5);
	private Button bms = new Button("M/M/S");
	public FrameSystemView(FrameSystemController controller) {
		// TODO Auto-generated constructor stub
		addWindowListener(this);
		setTitle("FrameSystem");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(new Label("ìöÇ¶"));
		add(text3);
		add(new Label("É…"));
		add(m1);
		add(new Label("É "));
		add(m2);
		add(bm);
		add(new Label("ïΩãœånì‡êlêî"));
		add(m3);
		add(new Label("É…"));
		add(ms1);
		add(new Label("É "));
		add(ms2);
		add(new Label("s"));
		add(ms3);
		add(bms);
		add(new Label("óòópó¶"));
		add(ms4);
		add(new Label("ïΩãœë“Çøêlêî"));
		add(ms5);
		add(new Label("ïΩãœånì‡êlêî"));
		add(ms6);
		add(new Label("ïΩãœånì‡éûä‘"));
		add(ms7);
		add(new Label("ïΩãœånì‡éûä‘"));
		add(ms8);
		button1.addActionListener(this);
		bm.addActionListener(this);
		bms.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == button1){
		    int val1 = Integer.parseInt(text1.getText());
		    int val2 = Integer.parseInt(text2.getText());
            // text3.setText(String.valueOf(val1 + val2));
		    Calculation_lib clib = new Calculation_lib(val1,val2);
		    text3.setText(String.valueOf(clib.getPlus()));
		}
		else if(e.getSource() == bm){
			double lambda = Double.parseDouble(m1.getText());
			double mu = Double.parseDouble(m2.getText());
            MM1_lib mlib = new MM1_lib(lambda,mu);
            m3.setText(String.valueOf(mlib.getLength()));
		}
		else if(e.getSource() == bms){
			double lambda = Double.parseDouble(ms1.getText());
			double mu = Double.parseDouble(ms2.getText());
			int s = Integer.parseInt(ms3.getText());
            MMS_lib slib = new MMS_lib(lambda,mu,s);
            ms4.setText(String.valueOf(slib.getRho()));
            ms5.setText(String.valueOf(slib.getLq()));
            ms6.setText(String.valueOf(slib.getL()));
            ms7.setText(String.valueOf(slib.getWq()));
            ms8.setText(String.valueOf(slib.getW()));

		}
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}